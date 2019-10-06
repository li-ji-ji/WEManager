package cn.lhj.WEManager.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lhj.WEManager.mapper.WaterRecordMapper;
import cn.lhj.WEManager.po.WaterRecord;
import cn.lhj.WEManager.po.WaterRecordExample;
import cn.lhj.WEManager.po.WeConfig;
import cn.lhj.WEManager.service.WaterRecordService;
import cn.lhj.WEManager.service.WeConfigService;
import cn.lhj.WEManager.util.DateUtil;

@Service
public class WaterRecordServiceImpl implements WaterRecordService {

	@Autowired
	private WaterRecordMapper waterRecordMapper;
	
	@Autowired
	private WeConfigService configService;
	
/*=========================================================基本方法================================================================*/
	
	@Override
	public List<WaterRecord> getAll() throws Exception {
		return waterRecordMapper.selectByExample(null);
	}

	
	@Override
	public WaterRecord getById(Integer id) throws Exception{
		return waterRecordMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int add(WaterRecord record) throws Exception {
		try {
			waterRecordMapper.insertSelective(record);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int delete(Integer id) throws Exception {
		try {
			waterRecordMapper.deleteByPrimaryKey(id);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int update(WaterRecord record) throws Exception {
		try {
			waterRecordMapper.updateByPrimaryKeySelective(record);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
/*=========================================================基本方法================================================================*/

	
/*=========================================================查询方法================================================================*/
	//根据门牌号查询
	@Override
	public WaterRecord getByHouseId(String houseId) throws Exception{
		WaterRecordExample example=new WaterRecordExample();
		WaterRecordExample.Criteria criteria=example.createCriteria();
		criteria.andHouseIdEqualTo(houseId);
		List<WaterRecord> records=waterRecordMapper.selectByExample(example);
		//判断是否返回空列表
		if(records.size()>0) {
			return records.get(0);
		}else {
			return null;
		}
	}
	
	//根据缴费状态查询已缴费记录
	@Override
	public List<WaterRecord> getCostedRecord() throws Exception{
		WaterRecordExample example=new WaterRecordExample();
		WaterRecordExample.Criteria criteria=example.createCriteria();
		criteria.andCostStatusEqualTo(1);
		return waterRecordMapper.selectByExample(example);
	}
	
	//根据缴费状态查询未缴费记录
	@Override
	public List<WaterRecord> getUnCostRecord() throws Exception{
		WaterRecordExample example=new WaterRecordExample();
		WaterRecordExample.Criteria criteria=example.createCriteria();
		criteria.andCostStatusEqualTo(0);
		return waterRecordMapper.selectByExample(example);
	}
	
	//根据时间查询记录
	@Override
	public List<WaterRecord> getRecordByRecordTime(Date startTime,Date endTime)throws Exception{
		WaterRecordExample example=new WaterRecordExample();
		WaterRecordExample.Criteria criteria=example.createCriteria();
		criteria.andRecordTimeBetween(startTime, endTime);
		return waterRecordMapper.selectByExample(example);
	}

	
	//查询本月记录
	@Override
	public List<WaterRecord> getRecordThisMonth()throws Exception{
		WaterRecordExample example=new WaterRecordExample();
		WaterRecordExample.Criteria criteria=example.createCriteria();
		Date now=new Date();
		//获取本月第一天
		Date thisMonth=new DateUtil().getThisMonthFirst();
		criteria.andRecordTimeBetween(thisMonth, now);
		return waterRecordMapper.selectByExample(example);
	}


	//查询本月未缴费记录
	@Override
	public List<WaterRecord> getUnCostRecordThisMonth()throws Exception{
		WaterRecordExample example=new WaterRecordExample();
		WaterRecordExample.Criteria criteria=example.createCriteria();
		Date now=new Date();
		//获取本月第一天
		Date thisMonth=new DateUtil().getThisMonthFirst();
		criteria.andRecordTimeBetween(thisMonth, now);
		criteria.andCostStatusEqualTo(0);
		return waterRecordMapper.selectByExample(example);
	}

	//查询本月已缴费记录
	@Override
	public List<WaterRecord> getCostedRecordThisMonth()throws Exception{
		WaterRecordExample example=new WaterRecordExample();
		WaterRecordExample.Criteria criteria=example.createCriteria();
		Date now=new Date();
		//获取本月第一天
		Date thisMonth=new DateUtil().getThisMonthFirst();
		criteria.andRecordTimeBetween(thisMonth, now);
		criteria.andCostStatusEqualTo(1);
		return waterRecordMapper.selectByExample(example);
	}
	
	//根据时间跟门牌号查询记录
	@Override
	public WaterRecord getRecordByRecordTimeAndHouseId(String houseId,Date startTime,Date endTime)throws Exception{
		WaterRecordExample example=new WaterRecordExample();
		WaterRecordExample.Criteria criteria=example.createCriteria();
		criteria.andRecordTimeBetween(startTime, endTime);
		criteria.andHouseIdEqualTo(houseId);
		List<WaterRecord> records=waterRecordMapper.selectByExample(example);
		if(records.size()>0) {
			return records.get(0);
		}else {
			return null;
		}
	}
	
/*=========================================================查询方法================================================================*/
	
/*=========================================================添加方法================================================================*/
	//根据门牌号以及本月表数添加记录
	@Override
	public int addByHouseIdAndThisNum(String houseId,Double thisNum) throws Exception{
		//查询水费配置
		WeConfig config=new WeConfig();
		config=configService.getAbleByKey("水价(元/吨)");
		Double price=Double.valueOf(config.getConfigValue());
		WaterRecord record=new WaterRecord();
		//获取当前时间
		Date now=new Date();
		//获取上个月份
		Date last=new DateUtil().getLastMonth();
		//获取本月第一天
		Date thisMonth=new DateUtil().getThisMonthFirst();
		System.out.println(thisMonth);
		//查询上月水表记录
		boolean isNull=true;
		WaterRecord lastRecord=getRecordByRecordTimeAndHouseId(houseId,last,now);
		WaterRecord thisRecord=getRecordByRecordTimeAndHouseId(houseId,thisMonth,now);
		if(thisRecord!=null) {
			isNull=false;
		}
		//判断是否已有本月记录
		if(thisNum>=lastRecord.getThisNum()) {
			try {
				record.setHouseId(houseId);
				record.setLastNum(lastRecord.getThisNum());
				record.setThisNum(thisNum);
				record.setUseNum(thisNum-lastRecord.getThisNum());
				record.setCostNum((thisNum-lastRecord.getThisNum())*price);
				record.setRecordTime(now);
				try {
					if(isNull) {
						add(record);
					}else {
						record.setId(thisRecord.getId());
						update(record);
					}
					return 1;
				} catch (Exception e) {
					e.printStackTrace();
					return 0;
				}
			} catch (Exception e) {
				e.printStackTrace();
				return 0;
			}
		}else {
			return 0;
		}
	}
/*=========================================================添加方法================================================================*/
	
/*=========================================================修改方法================================================================*/
	
/*=========================================================修改方法================================================================*/
	
/*=========================================================删除方法================================================================*/
	
/*=========================================================删除方法================================================================*/

}
