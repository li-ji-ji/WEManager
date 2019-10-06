package cn.lhj.WEManager.API;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import cn.lhj.WEManager.po.WeNav;
import cn.lhj.WEManager.service.WeNavService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin
@Api
@RequestMapping("/nav")
public class WeNavAPI {

	@Autowired
	private WeNavService navService;
	
	//获取所有导航菜单
	@RequestMapping("/getAll")
	@ApiOperation(value="获取所有导航菜单")
	public List<WeNav> getAll()throws Exception{
		return navService.getAll();
	}
	
	//添加单个导航菜单
	@RequestMapping("/addOne")
	@ApiOperation(value="添加单个导航菜单")
	public int addone(WeNav nav) throws Exception{
		return navService.add(nav);
	}
	
	//修改单个导航菜单
	@RequestMapping("/updateOne")
	@ApiOperation(value="修改单个导航菜单")
	public int updateOnt(WeNav nav) throws Exception{
		return navService.update(nav);
	}
	
	//删除单个导航菜单
	@RequestMapping("/delOne")
	@ApiOperation(value="删除单个导航菜单")
	public int delOne(Integer id) throws Exception{
		return navService.delete(id);
	}
}
