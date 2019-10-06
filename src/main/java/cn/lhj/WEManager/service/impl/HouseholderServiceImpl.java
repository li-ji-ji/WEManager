package cn.lhj.WEManager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lhj.WEManager.mapper.extend.HouseholderMapperExtends;
import cn.lhj.WEManager.po.Householder;
import cn.lhj.WEManager.po.HouseholderExample;
import cn.lhj.WEManager.service.HouseholderService;

@Service
public class HouseholderServiceImpl implements HouseholderService {

	@Autowired
	private HouseholderMapperExtends holderMapper;
	
	
/*=================================查询====================================*/
	//查询所有住户
	@Override
	public List<Householder> getHouseholderAll() throws Exception {
		return holderMapper.selectByExample(null);
	}

	//根据ID查询住户
	@Override
	public Householder getHouseholderById(Integer id) throws Exception {
		return holderMapper.selectByPrimaryKey(id);
	}

	//根据门牌号查询住户
	@Override
	public List<Householder> getHouseholderByHouseId(String hId) throws Exception {
		HouseholderExample example=new HouseholderExample();
		HouseholderExample.Criteria criteria=example.createCriteria();
		criteria.andHouseIdEqualTo(hId);
		return holderMapper.selectByExample(example);
	}

	//根据住户姓名查询住户
	@Override
	public List<Householder> getHouseholderByName(String hName) throws Exception {
		HouseholderExample example=new HouseholderExample();
		HouseholderExample.Criteria criteria=example.createCriteria();
		criteria.andHousehoulderNameEqualTo(hName);
		return holderMapper.selectByExample(example);
	}

	//根据住户姓名模糊查询住户
	@Override
	public List<Householder> getHouseholderByNameLike(String kerWords) throws Exception {
		HouseholderExample example=new HouseholderExample();
		HouseholderExample.Criteria criteria=example.createCriteria();
		criteria.andHousehoulderNameLike("%"+kerWords+"%");
		return holderMapper.selectByExample(example);
	}

	//根据住户状态查询住户
	@Override
	public List<Householder> getHouseholderByStatus(Integer status) throws Exception {
		HouseholderExample example=new HouseholderExample();
		HouseholderExample.Criteria criteria=example.createCriteria();
		criteria.andStatusEqualTo(status);
		return holderMapper.selectByExample(example);
	}

/*=================================查询====================================*/	
	
	
/*=================================添加====================================*/
	//添加单个住户
	@Override
	public int addHouseHolderOne(Householder holder)throws Exception{
		return holderMapper.insertSelective(holder);
	}
/*=================================添加====================================*/
	
	
/*=================================修改====================================*/
	//修改单个住户
	@Override
	public int setHouseHolderOne(Householder holder)throws Exception{
		return holderMapper.updateByPrimaryKeySelective(holder);
	}
/*=================================修改====================================*/
	
	
/*=================================删除====================================*/
	//根据ID删除单个住户
	@Override
	public int delHouseHolderOne(Integer id) throws Exception{
		return holderMapper.deleteByPrimaryKey(id);
	}
/*=================================删除====================================*/
}
