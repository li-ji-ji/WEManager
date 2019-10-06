package cn.lhj.WEManager.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import cn.lhj.WEManager.po.ElectRecord;
import cn.lhj.WEManager.po.WaterRecord;

@Service
public interface ElectRecordService extends BaseService<ElectRecord, Integer> {

	
/*=========================================================查询方法================================================================*/
	//根据门牌号查询
	public ElectRecord getByHouseId(String houseId) throws Exception;
	//根据缴费状态查询
	public List<ElectRecord> getCostedRecord() throws Exception;
	//根据缴费状态查询未缴费记录
	public List<ElectRecord> getUnCostRecord() throws Exception;
	//根据时间查询记录
	public List<ElectRecord> getRecordByRecordTime(Date startTime,Date endTime)throws Exception;
	//查询本月记录
	public List<ElectRecord> getRecordThisMonth()throws Exception;
	//查询本月未缴费记录
	public List<ElectRecord> getUnCostRecordThisMonth()throws Exception;
	//查询本月已缴费记录
	public List<ElectRecord> getCostedRecordThisMonth()throws Exception;
	//根据时间跟门牌号查询记录
	public ElectRecord getRecordByRecordTimeAndHouseId(String houseId,Date startTime,Date endTime)throws Exception;
	
/*=========================================================查询方法================================================================*/
	
/*=========================================================添加方法================================================================*/
	//根据门牌号以及本月表数添加记录
	public int addByHouseIdAndThisNum(String houseId,Double thisNum) throws Exception;
/*=========================================================添加方法================================================================*/
	
/*=========================================================修改方法================================================================*/
	
/*=========================================================修改方法================================================================*/
	
/*=========================================================删除方法================================================================*/
	
/*=========================================================删除方法================================================================*/

	
	
}
