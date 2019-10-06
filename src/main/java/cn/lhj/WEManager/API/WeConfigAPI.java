package cn.lhj.WEManager.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.lhj.WEManager.po.WeConfig;
import cn.lhj.WEManager.service.WeConfigService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin
@Api
@RequestMapping("/config")
public class WeConfigAPI {

	@Autowired
	private WeConfigService configService;

	
/*=================================查询====================================*/

	//查询所有配置
	@ApiOperation(value="查询所有配置")
	@RequestMapping("/getAll")
	public List<WeConfig> getAll() throws Exception{
		return configService.getAll();
	}
	
	//根据配置键名查询已启用配置
	@ApiOperation(value="根据配置键名查询已启用配置")
	@RequestMapping("/getAbleByKey")
	public WeConfig getAbleByKey(@RequestParam("configKey") String configKey) throws Exception{
		return configService.getAbleByKey(configKey);
	}
/*=================================查询====================================*/	
	
	
/*=================================添加====================================*/
	
	//添加单个配置
	@ApiOperation(value="添加单个配置")
	@RequestMapping("/addOne")
	public int addOne(@RequestBody WeConfig config) throws Exception{
		return configService.add(config);
	}
/*=================================添加====================================*/
	
	
/*=================================修改====================================*/
	//修改单个配置
	@ApiOperation(value="修改单个配置")
	@RequestMapping("/setOne")
	public int setOne(@RequestBody WeConfig config) throws Exception{
		return configService.update(config);
	}
	//修改水价
	@ApiOperation(value="修改水价")
	@RequestMapping("/setWaterPrice")
	public int setWaterPrice(@RequestParam("price") Double price) throws Exception{
		return configService.setWaterPrice(price);
	}
	//修改电价
	@ApiOperation(value="修改电价")
	@RequestMapping("/setElectPrice")
	public int setElectPrice(@RequestParam("price") Double price) throws Exception{
		return configService.setElectPrice(price);
	}
/*=================================修改====================================*/
	
	
/*=================================删除====================================*/
	//根据ID删除单个配置
	@ApiOperation(value="根据ID删除单个配置")
	@RequestMapping("/delOneById")
	public int delOneById(@RequestParam("id") Integer id) throws Exception{
		return configService.delete(id);
	}
/*=================================删除====================================*/
}
