package cn.lhj.WEManager.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.lhj.WEManager.po.Householder;


@Service
public interface HouseholderService {
	
/*=================================查询====================================*/
	//查询所有住户
	public List<Householder> getHouseholderAll()throws Exception;
	//根据ID查询住户
	public Householder getHouseholderById(Integer id)throws Exception;
	//根据门牌号查询住户
	public List<Householder> getHouseholderByHouseId(String hId)throws Exception;
	//根据住户姓名查询住户
	public List<Householder> getHouseholderByName(String hName)throws Exception;
	//根据住户姓名模糊查询住户
	public List<Householder> getHouseholderByNameLike(String kerWords)throws Exception;
	//根据住户状态查询住户
	public List<Householder> getHouseholderByStatus(Integer status)throws Exception;
/*=================================查询====================================*/	
	
	
/*=================================添加====================================*/
	//添加单个住户
	public int addHouseHolderOne(Householder holder)throws Exception;
/*=================================添加====================================*/
	
	
/*=================================修改====================================*/
	//修改单个住户
	public int setHouseHolderOne(Householder holder)throws Exception;
/*=================================修改====================================*/
	
	
/*=================================删除====================================*/
	//根据ID删除单个住户
	public int delHouseHolderOne(Integer id) throws Exception;
/*=================================删除====================================*/
}
