package cn.lhj.WEManager.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lhj.WEManager.API.ElectRecordAPI;
import cn.lhj.WEManager.mapper.extend.ElectRecordMapperExtends;
import cn.lhj.WEManager.po.ElectRecord;
import cn.lhj.WEManager.po.ElectRecordExample;
import cn.lhj.WEManager.po.WaterRecord;
import cn.lhj.WEManager.po.WaterRecordExample;
import cn.lhj.WEManager.po.WeConfig;
import cn.lhj.WEManager.service.ElectRecordService;
import cn.lhj.WEManager.service.WeConfigService;
import cn.lhj.WEManager.util.DateUtil;

@Service
public class ElectRecordServiceImpl implements ElectRecordService {

	@Autowired
	private ElectRecordMapperExtends recordMapper;
	
	@Autowired
	private WeConfigService configService;

	private static final Logger log = LoggerFactory.getLogger(ElectRecordServiceImpl.class);
	
/*=========================================================基本方法================================================================*/

	@Override
	public List<ElectRecord> getAll() throws Exception {
		return recordMapper.selectByExample(null);
	}
	
	@Override
	public ElectRecord getById(Integer id) throws Exception{
		return recordMapper.selectByPrimaryKey(id);
	}

	@Override
	public int add(ElectRecord record) throws Exception {
		try {
			recordMapper.insertSelective(record);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int delete(Integer id) throws Exception {
		try {
			recordMapper.deleteByPrimaryKey(id);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int update(ElectRecord record) throws Exception {
		try {
			recordMapper.updateByPrimaryKeySelective(record);
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
	public ElectRecord getByHouseId(String houseId) throws Exception{
		ElectRecordExample example=new ElectRecordExample();
		ElectRecordExample.Criteria criteria=example.createCriteria();
		criteria.andHouseIdEqualTo(houseId);
		List<ElectRecord> records=recordMapper.selectByExample(example);
		//判断是否返回空列表
		if(records.size()>0) {
			return records.get(0);
		}else {
			return null;
		}
	}
	
	//根据缴费状态查询已缴费记录
	@Override
	public List<ElectRecord> getCostedRecord() throws Exception{
		ElectRecordExample example=new ElectRecordExample();
		ElectRecordExample.Criteria criteria=example.createCriteria();
		criteria.andCostStatusEqualTo(1);
		return recordMapper.selectByExample(example);
	}
	
	//根据缴费状态查询未缴费记录
	@Override
	public List<ElectRecord> getUnCostRecord() throws Exception{
		ElectRecordExample example=new ElectRecordExample();
		ElectRecordExample.Criteria criteria=example.createCriteria();
		criteria.andCostStatusEqualTo(0);
		return recordMapper.selectByExample(example);
	}
	
	//根据时间查询记录
	@Override
	public List<ElectRecord> getRecordByRecordTime(Date startTime,Date endTime)throws Exception{
		ElectRecordExample example=new ElectRecordExample();
		ElectRecordExample.Criteria criteria=example.createCriteria();
		criteria.andRecordTimeBetween(startTime, endTime);
		return recordMapper.selectByExample(example);
	}

	//查询本月记录
	@Override
	public List<ElectRecord> getRecordThisMonth()throws Exception{
		ElectRecordExample example=new ElectRecordExample();
		ElectRecordExample.Criteria criteria=example.createCriteria();
		Date now=new Date();
		//获取本月第一天
		Date thisMonth=new DateUtil().getThisMonthFirst();
		criteria.andRecordTimeBetween(thisMonth, now);
		return recordMapper.selectByExample(example);
	}


	//查询本月未缴费记录
	@Override
	public List<ElectRecord> getUnCostRecordThisMonth()throws Exception{
		ElectRecordExample example=new ElectRecordExample();
		ElectRecordExample.Criteria criteria=example.createCriteria();
		Date now=new Date();
		//获取本月第一天
		Date thisMonth=new DateUtil().getThisMonthFirst();
		criteria.andRecordTimeBetween(thisMonth, now);
		criteria.andCostStatusEqualTo(0);
		return recordMapper.selectByExample(example);
	}

	//查询本月已缴费记录
	@Override
	public List<ElectRecord> getCostedRecordThisMonth()throws Exception{
		ElectRecordExample example=new ElectRecordExample();
		ElectRecordExample.Criteria criteria=example.createCriteria();
		Date now=new Date();
		//获取本月第一天
		Date thisMonth=new DateUtil().getThisMonthFirst();
		criteria.andRecordTimeBetween(thisMonth, now);
		criteria.andCostStatusEqualTo(1);
		return recordMapper.selectByExample(example);
	}
	
	//根据时间跟门牌号查询记录
	@Override
	public ElectRecord getRecordByRecordTimeAndHouseId(String houseId,Date startTime,Date endTime)throws Exception{
		ElectRecordExample example=new ElectRecordExample();
		ElectRecordExample.Criteria criteria=example.createCriteria();
		criteria.andRecordTimeBetween(startTime, endTime);
		criteria.andHouseIdEqualTo(houseId);
		List<ElectRecord> records=recordMapper.selectByExample(example);
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
		//查询电费配置
		WeConfig config=new WeConfig();
		config=configService.getAbleByKey("电价(元/度)");
		Double price=Double.valueOf(config.getConfigValue());
//		System.out.println(price);
		ElectRecord record=new ElectRecord();
		//获取当前时间
		Date now=new Date();
		//获取上个月份
		Date last=new DateUtil().getLastMonth();
		//获取本月第一天
		Date thisMonth=new DateUtil().getThisMonthFirst();
		System.out.println(thisMonth);
		//查询上月水表记录
		boolean isNull=true;
		ElectRecord lastRecord=getRecordByRecordTimeAndHouseId(houseId,last,now);
		//判断是否已有本月记录
		ElectRecord thisRecord=getRecordByRecordTimeAndHouseId(houseId,thisMonth,now);
		if(thisRecord!=null) {
			isNull=false;
		}
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
				log.error("添加/更新异常=》{}",e);
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
