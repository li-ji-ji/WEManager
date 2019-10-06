package cn.lhj.WEManager.API;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.lhj.WEManager.po.ElectRecord;
import cn.lhj.WEManager.po.WaterRecord;
import cn.lhj.WEManager.service.WaterRecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/water")
@CrossOrigin
@Api
public class WaterRecordAPI {

	@Autowired
	private WaterRecordService recordService;

/*=========================================================查询接口================================================================*/
	
	//查询所有记录
	@ApiOperation(value="查询所有记录")
	@RequestMapping("/getAll")
	public List<WaterRecord> getAll() throws Exception{
		return recordService.getAll();
	}
	
	//根据门牌号查询
	@ApiOperation(value="根据门牌号查询")
	@RequestMapping("/getByHouseId")
	public WaterRecord getByHouseId(@RequestParam("houseId")String houseId) throws Exception{
		return recordService.getByHouseId(houseId);
	}
	
	//根据缴费状态查询已缴费记录
	@ApiOperation(value="根据缴费状态查询已缴费记录")
	@RequestMapping("/getCostedRecord")
	public List<WaterRecord> getCostedRecord() throws Exception{
		return recordService.getCostedRecord();
	}	
	
	//根据缴费状态查询未缴费记录
	@ApiOperation(value="根据缴费状态查询未缴费记录")
	@RequestMapping("/getUnCostRecord")
	public List<WaterRecord> getUnCostRecord() throws Exception{
		return recordService.getUnCostRecord();
	}
	
	//根据时间查询记录
	@ApiOperation(value="根据时间查询记录")
	@RequestMapping("/getRecordByTime")
	public List<WaterRecord> getRecordByTime(@RequestParam("startTime")Date startTime,@RequestParam("endTime")Date endTime)throws Exception{
		return recordService.getRecordByRecordTime(startTime, endTime);
	}
	
	//查询本月记录
	@ApiOperation(value="查询本月记录")
	@RequestMapping("/getRecordThisMonth")
	public List<WaterRecord> getRecordThisMonth()throws Exception{
		return recordService.getRecordThisMonth();
	}
	
	//查询本月未缴费记录
	@ApiOperation(value="查询本月未缴费记录")
	@RequestMapping("/getUnCostRecordThisMonth")
	public List<WaterRecord> getUnCostRecordThisMonth()throws Exception{
		return recordService.getUnCostRecordThisMonth();
	}
	
	//查询本月已缴费记录
	@ApiOperation(value="查询本月已缴费记录")
	@RequestMapping("/getCostedRecordThisMonth")
	public List<WaterRecord> getCostedRecordThisMonth()throws Exception{
		return recordService.getCostedRecordThisMonth();
	}
/*=========================================================查询接口================================================================*/

	
	
/*=========================================================添加接口================================================================*/
	//添加单条记录
	@ApiOperation(value="添加单条记录")
	@RequestMapping("/add")
	public int add(@RequestBody WaterRecord record) throws Exception{
		return recordService.add(record);
	}
	
	//根据门牌号以及本月表数添加记录
	@ApiOperation(value="根据门牌号以及本月表数添加记录")
	@RequestMapping("/addByHouseIdAndThisNum")
	public int addByHouseIdAndThisNum(@RequestParam("houseId")String houseId,@RequestParam("thisNum")Double thisNum) throws Exception{
		return recordService.addByHouseIdAndThisNum(houseId, thisNum);
	}
	
	
/*=========================================================添加接口================================================================*/

/*=========================================================修改接口================================================================*/
	
/*=========================================================修改接口================================================================*/
	
/*=========================================================删除接口================================================================*/
	
/*=========================================================删除接口================================================================*/

}
