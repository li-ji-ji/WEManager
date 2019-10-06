package cn.lhj.WEManager.API;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.lhj.WEManager.po.WaterElectRecord;
import cn.lhj.WEManager.po.WaterElectRecordExample;
import cn.lhj.WEManager.service.WaterElectRecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin
@Api
public class WaterElectRecordAPI {
	
	@Autowired
	private WaterElectRecordService weRecoreService;
	
	/*=================================查询====================================*/	
	//查询所有水电记录
	@ApiOperation(value="查询所有水电记录")
	@RequestMapping("/getWERecordAll")
	public List<WaterElectRecord> getWERecordAll()throws Exception{
		return weRecoreService.getWERecordAll();
	}
	//根据ID查询水电记录
	@ApiOperation(value="根据ID查询水电记录")
	@RequestMapping("/getWERecordById")
	public WaterElectRecord getWERecordById(@RequestParam("id")Integer id)throws Exception{
		return weRecoreService.getWERecordById(id);
	}
	//根据门牌号查询水电记录
	@ApiOperation(value="根据门牌号查询水电记录")
	@RequestMapping("/getWERecordByHId")
	public List<WaterElectRecord> getWERecordByHId(@RequestParam("hId")String hId)throws Exception{
		return weRecoreService.getWERecordByHId(hId);
	}
	//根据年份查询水电记录
	@ApiOperation(value="根据年份查询水电记录")
	@RequestMapping("/getWERecordByYear")
	public List<WaterElectRecord> getWERecordByYear(@RequestParam("year")Integer year)throws Exception{
		return weRecoreService.getWERecordByYear(year);
	}
	//根据月份查询水电记录
	@ApiOperation(value="根据月份查询水电记录")
	@RequestMapping("/getWERecordByMonth")
	public List<WaterElectRecord> getWERecordByMonth(@RequestParam("month")Integer month)throws Exception{
		return weRecoreService.getWERecordByMonth(month);
	}
	//根据年月查询水电记录
	@ApiOperation(value="根据年月查询水电记录")
	@RequestMapping("/getWERecordByYearAndMonth")
	public List<WaterElectRecord> getWERecordByYearAndMonth(@RequestParam("yearAndMonth")Date yearAndMonth)throws Exception{
		return weRecoreService.getWERecordByYearAndMonth(yearAndMonth);
	}
	//根据缴费状态查询水电记录
	@ApiOperation(value="根据缴费状态查询水电记录")
	@RequestMapping("/getWERecordByCostStatus")
	public List<WaterElectRecord> getWERecordByCostStatus(@RequestParam("costStatus")Integer costStatus)throws Exception{
		return weRecoreService.getWERecordByCostStatus(costStatus);
	}
/*=================================查询====================================*/
	
/*=================================添加====================================*/	
	//添加单条水电记录
	@ApiOperation(value="添加单条水电记录")
	@RequestMapping("/addWERecordOne")
	public int addWERecordOne(@RequestBody WaterElectRecord weRecord)throws Exception{
		return weRecoreService.addWERecordOne(weRecord);
	}
/*=================================添加====================================*/
	
/*=================================修改====================================*/	
	//修改单条水电记录
	@ApiOperation(value="修改单条水电记录")
	@RequestMapping("/setWERecordOne")
	public int setWERecordOne(@RequestBody WaterElectRecord weRecord)throws Exception{
		return weRecoreService.setWERecordOne(weRecord);
	}
/*=================================修改====================================*/	
	
/*=================================删除====================================*/	
	//删除单条水电记录
	@ApiOperation(value="删除单条水电记录")
	@RequestMapping("/delWERecordOne")
	public int delWERecordOne(@RequestParam("id")Integer id)throws Exception{
		return weRecoreService.delWERecordOne(id);
	}
/*=================================删除====================================*/

}
