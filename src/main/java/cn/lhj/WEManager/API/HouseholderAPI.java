package cn.lhj.WEManager.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.lhj.WEManager.po.Householder;
import cn.lhj.WEManager.service.HouseholderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin
@Api
@RequestMapping("/house")
public class HouseholderAPI {
	
	@Autowired
	private HouseholderService holderService;
	
	
/*=================================查询====================================*/
	//查询所有住户
	@ApiOperation(value="查询所有住户")
	@RequestMapping("/getHouseholderAll")
	public List<Householder> getHouseholderAll() throws Exception {
		return holderService.getHouseholderAll();
	}

	//根据ID查询住户
	@ApiOperation(value="根据ID查询住户")
	@RequestMapping("/getHouseholderById")
	public Householder getHouseholderById(@RequestParam("id")Integer id) throws Exception {
		return holderService.getHouseholderById(id);
	}

	//根据门牌号查询住户
	@ApiOperation(value="根据门牌号查询住户")
	@RequestMapping("/getHouseholderByHouseId")
	public List<Householder> getHouseholderByHouseId(@RequestParam("hId")String hId) throws Exception {
		return holderService.getHouseholderByHouseId(hId);
	}

	//根据住户姓名查询住户
	@ApiOperation(value="根据住户姓名查询住户")
	@RequestMapping("/getHouseholderByName")
	public List<Householder> getHouseholderByName(@RequestParam("hName")String hName) throws Exception {
		return holderService.getHouseholderByName(hName);
	}

	//根据住户姓名模糊查询住户
	@ApiOperation(value="根据住户姓名模糊查询住户")
	@RequestMapping("/getHouseholderByNameLike")
	public List<Householder> getHouseholderByNameLike(@RequestParam("kerWords")String kerWords) throws Exception {
		return holderService.getHouseholderByNameLike(kerWords);
	}

	//根据住户状态查询住户
	@ApiOperation(value="根据住户状态查询住户")
	@RequestMapping("/getHouseholderByStatus")
	public List<Householder> getHouseholderByStatus(@RequestParam("status")Integer status) throws Exception {
		return holderService.getHouseholderByStatus(status);
	}

/*=================================查询====================================*/	
	
	
/*=================================添加====================================*/
	//添加单个住户
	@ApiOperation(value="添加单个住户")
	@RequestMapping("/addHouseHolderOne")
	public int addHouseHolderOne(@RequestBody Householder holder)throws Exception{
		return holderService.addHouseHolderOne(holder);
	}
/*=================================添加====================================*/
	
	
/*=================================修改====================================*/
	//修改单个住户
	@ApiOperation(value="修改单个住户")
	@RequestMapping("/setHouseHolderOne")
	public int setHouseHolderOne(@RequestBody Householder holder)throws Exception{
		return holderService.setHouseHolderOne(holder);
	}
/*=================================修改====================================*/
	
	
/*=================================删除====================================*/
	//根据ID删除单个住户
	@ApiOperation(value="根据ID删除单个住户")
	@RequestMapping("/delHouseHolderOne")
	public int delHouseHolderOne(@RequestParam("id")Integer id) throws Exception{
		return holderService.delHouseHolderOne(id);
	}
/*=================================删除====================================*/
}
