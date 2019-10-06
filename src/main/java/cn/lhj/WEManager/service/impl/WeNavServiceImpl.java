package cn.lhj.WEManager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lhj.WEManager.mapper.extend.WeNavMapperExtends;
import cn.lhj.WEManager.po.ElectRecord;
import cn.lhj.WEManager.po.WeNav;
import cn.lhj.WEManager.service.WeNavService;

@Service
public class WeNavServiceImpl implements WeNavService {

	@Autowired
	private WeNavMapperExtends navMapper;
	
/*=========================================================基本方法================================================================*/
	
	@Override
	public List<WeNav> getAll() throws Exception {
		return navMapper.selectByExample(null);
	}
	
	@Override
	public WeNav getById(Integer id) throws Exception{
		return navMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public int add(WeNav nav) throws Exception {
		try {
			navMapper.insert(nav);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int delete(Integer id) throws Exception {
		try {
			navMapper.deleteByPrimaryKey(id);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int update(WeNav nav) throws Exception {
		try {
			navMapper.updateByPrimaryKeySelective(nav);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
/*=========================================================基本方法================================================================*/
	

}
