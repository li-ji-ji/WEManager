package cn.lhj.WEManager.service.impl;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lhj.WEManager.mapper.WaterElectRecordMapper;
import cn.lhj.WEManager.mapper.extend.WaterElectRecordMapperExtends;
import cn.lhj.WEManager.po.WaterElectRecord;
import cn.lhj.WEManager.po.WaterElectRecordExample;
import cn.lhj.WEManager.service.WaterElectRecordService;

@Service
public class WaterElectRecordServiceImpl implements WaterElectRecordService {

	@Autowired
	private WaterElectRecordMapperExtends WERecodeMapper;
	
/*=================================查询====================================*/	
	//查询所有水电记录
	@Override
	public List<WaterElectRecord> getWERecordAll()throws Exception{
		return WERecodeMapper.selectByExample(null);
	}
	//根据ID查询水电记录
	@Override
	public WaterElectRecord getWERecordById(Integer id)throws Exception{
		return WERecodeMapper.selectByPrimaryKey(id);
	}
	//根据门牌号查询水电记录
	@Override
	public List<WaterElectRecord> getWERecordByHId(String hId)throws Exception{
		WaterElectRecordExample example=new WaterElectRecordExample();
		WaterElectRecordExample.Criteria criteria=example.createCriteria();
		criteria.andHouseIdEqualTo(hId);
		return WERecodeMapper.selectByExample(example);
	}
	//根据年份查询水电记录
	@Override
	public List<WaterElectRecord> getWERecordByYear(Integer year)throws Exception{
		WaterElectRecordExample example=new WaterElectRecordExample();
		WaterElectRecordExample.Criteria criteria=example.createCriteria();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String getStartTime=year+"-01-01";
		String getEndTime=year+"-12-31";
		//System.out.println(getStartTime);
		//System.out.println(getEndTime);
		Date startDate=dateFormat.parse(getStartTime);
		Date endTime=dateFormat.parse(getEndTime);
		criteria.andRecordTimeGreaterThanOrEqualTo(startDate);
		criteria.andRecordTimeLessThanOrEqualTo(endTime);
		return WERecodeMapper.selectByExample(example);
	}
	//根据月份查询水电记录
	@Override
	public List<WaterElectRecord> getWERecordByMonth(Integer month)throws Exception{
		WaterElectRecordExample example=new WaterElectRecordExample();
		WaterElectRecordExample.Criteria criteria=example.createCriteria();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar date = Calendar.getInstance();
        String year = String.valueOf(date.get(Calendar.YEAR));
		String getStartTime=year+"-"+month+"-01";
		String getEndTime=year+"-"+month+"-31";
		//System.out.println(getStartTime);
		//System.out.println(getEndTime);
		Date startDate=dateFormat.parse(getStartTime);
		Date endTime=dateFormat.parse(getEndTime);
		criteria.andRecordTimeBetween(startDate, endTime);
		return WERecodeMapper.selectByExample(example);
	}
	//根据年月查询水电记录
	@Override
	public List<WaterElectRecord> getWERecordByYearAndMonth(Date yearAndMonth)throws Exception{
		WaterElectRecordExample example=new WaterElectRecordExample();
		WaterElectRecordExample.Criteria criteria=example.createCriteria();
		criteria.andRecordTimeEqualTo(yearAndMonth);
		return WERecodeMapper.selectByExample(example);
	}
	//根据缴费状态查询水电记录
	@Override
	public List<WaterElectRecord> getWERecordByCostStatus(Integer costStatus)throws Exception{
		WaterElectRecordExample example=new WaterElectRecordExample();
		WaterElectRecordExample.Criteria criteria=example.createCriteria();
		criteria.andCostStatusEqualTo(costStatus);
		return WERecodeMapper.selectByExample(example);
	}
/*=================================查询====================================*/
	
/*=================================添加====================================*/	
	//添加单条水电记录
	@Override
	public int addWERecordOne(WaterElectRecord weRecord)throws Exception{
		//日期格式化
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar date = Calendar.getInstance();
		//获取当前年月
        String year = String.valueOf(date.get(Calendar.YEAR));
        Integer month = Integer.valueOf(date.get(Calendar.MONTH));
        //获取上月与本月时间
		String getThisTime=year+"-"+month+"-01"; 
		String getLastTime=year+"-"+(month-1)+"-01"; 
		Date thisTime=dateFormat.parse(getThisTime);
		Date lastTime=dateFormat.parse(getLastTime);
		WaterElectRecordExample example=new WaterElectRecordExample();
		WaterElectRecordExample.Criteria criteria=example.createCriteria();
		criteria.andRecordTimeBetween(lastTime, thisTime);
		criteria.andHouseIdEqualTo(weRecord.getHouseId());
		List<WaterElectRecord> lastMonthRecord=WERecodeMapper.selectByExample(example);
		WaterElectRecord lastRecord=lastMonthRecord.get(0);
		//填写本月记录
		Date recordTime=new Date();
		weRecord.setRecordTime(recordTime);
		weRecord.setLastElectNum(lastRecord.getThisElectNum());
		weRecord.setLastWaterNum(lastRecord.getThisWaterNum());
		weRecord.setElectNum(weRecord.getThisElectNum()-lastRecord.getThisElectNum());
		weRecord.setWaterNum(weRecord.getThisWaterNum()-lastRecord.getThisWaterNum());
		//System.out.println(getStartTime);
		//System.out.println(getEndTime);
		Date startDate=dateFormat.parse(getThisTime);
		return WERecodeMapper.insertSelective(weRecord);
	}
/*=================================添加====================================*/
	
/*=================================修改====================================*/	
	//修改单条水电记录
	public int setWERecordOne(WaterElectRecord weRecord)throws Exception{
		return WERecodeMapper.updateByPrimaryKeySelective(weRecord);
	}
/*=================================修改====================================*/	
	
/*=================================删除====================================*/	
	//删除单条水电记录
	public int delWERecordOne(Integer id)throws Exception{
		return WERecodeMapper.deleteByPrimaryKey(id);
	}
/*=================================删除====================================*/

}
