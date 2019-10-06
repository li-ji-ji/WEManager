package cn.lhj.WEManager.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import cn.lhj.WEManager.po.WaterElectRecord;

@Service
public interface WaterElectRecordService {
	
/*=================================查询====================================*/	
	//查询所有水电记录
	public List<WaterElectRecord> getWERecordAll()throws Exception;
	//根据ID查询水电记录
	public WaterElectRecord getWERecordById(Integer id)throws Exception;
	//根据门牌号查询水电记录
	public List<WaterElectRecord> getWERecordByHId(String hId)throws Exception;
	//根据年份查询水电记录
	public List<WaterElectRecord> getWERecordByYear(Integer year)throws Exception;
	//根据月份查询水电记录
	public List<WaterElectRecord> getWERecordByMonth(Integer month)throws Exception;
	//根据年月查询水电记录
	public List<WaterElectRecord> getWERecordByYearAndMonth(Date yearAndMonth)throws Exception;
	//根据缴费状态查询水电记录
	public List<WaterElectRecord> getWERecordByCostStatus(Integer costStatus)throws Exception;
/*=================================查询====================================*/
	
/*=================================添加====================================*/	
	//添加单条水电记录
	public int addWERecordOne(WaterElectRecord weRecord)throws Exception;
/*=================================添加====================================*/
	
/*=================================修改====================================*/	
	//修改单条水电记录
	public int setWERecordOne(WaterElectRecord weRecord)throws Exception;
/*=================================修改====================================*/	
	
/*=================================删除====================================*/
	//删除单条水电记录
	public int delWERecordOne(Integer id)throws Exception;	
/*=================================删除====================================*/
}
