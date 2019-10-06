package cn.lhj.WEManager.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lhj.WEManager.API.ElectRecordAPI;
import cn.lhj.WEManager.mapper.extend.WeConfigMapperExtends;
import cn.lhj.WEManager.po.WeConfig;
import cn.lhj.WEManager.po.WeConfigExample;
import cn.lhj.WEManager.service.WeConfigService;

@Service
public class WeConfigServiceImpl implements WeConfigService {

	@Autowired
	private WeConfigMapperExtends configMapper;


	private static final Logger log = LoggerFactory.getLogger(WeConfigServiceImpl.class);
	
/*=========================================================基本方法================================================================*/
	
	@Override
	public List<WeConfig> getAll() throws Exception {
		return configMapper.selectByExample(null);
	}

	@Override
	public WeConfig getById(Integer id) throws Exception {
		return configMapper.selectByPrimaryKey(id);
	}

	@Override
	public int add(WeConfig config) throws Exception {
		try {
			configMapper.insertSelective(config);
			log.info("添加成功");
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int delete(Integer id) throws Exception {
		try {
			configMapper.deleteByPrimaryKey(id);
			log.info("删除成功");
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int update(WeConfig config) throws Exception {
		try {
			configMapper.updateByPrimaryKeySelective(config);
			log.info("修改成功");
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
/*=========================================================基本方法================================================================*/


	
/*=========================================================查询方法================================================================*/
	//根据配置键名查询已启用配置
	@Override
	public WeConfig getAbleByKey(String configKey) throws Exception{
		WeConfigExample example=new WeConfigExample();
		WeConfigExample.Criteria criteria=example.createCriteria();
		criteria.andConfigKeyEqualTo(configKey);
		criteria.andConfigStatusEqualTo(1);
		try {
			List<WeConfig> configs= configMapper.selectByExample(example);
			return configs.get(0);
		} catch (Exception e) {
			return null;
		}
	}
/*=========================================================查询方法================================================================*/
	
/*=========================================================添加方法================================================================*/
/*=========================================================添加方法================================================================*/
	
/*=========================================================修改方法================================================================*/
	//修改水价
	@Override
	public int setWaterPrice(Double price) throws Exception{
		WeConfig config=new WeConfig();
		WeConfigExample example=new WeConfigExample();
		WeConfigExample.Criteria criteria=example.createCriteria();
		criteria.andConfigKeyEqualTo("水价(元/吨)");
		boolean isExist=true;
		List<WeConfig> getConfig=configMapper.selectByExample(example);
		if(getConfig.size()>0) {
			config=getConfig.get(0);
		}else {
			isExist=false;
			config.setConfigKey("水价(元/吨)");
			config.setConfigStatus(1);
			config.setConfigType("系统配置");
			config.setDataType("number");
		}
		config.setConfigValue(String.valueOf(price));
		try {
			if(isExist) {
				update(config);
			}else {
				add(config);
			}
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}
	
	//修改电价
	@Override
	public int setElectPrice(Double price) throws Exception{
		WeConfig config=new WeConfig();
		WeConfigExample example=new WeConfigExample();
		WeConfigExample.Criteria criteria=example.createCriteria();
		criteria.andConfigKeyEqualTo("电价(元/度)");
		boolean isExist=true;
		List<WeConfig> getConfig=configMapper.selectByExample(example);
		if(getConfig.size()>0) {
			config=getConfig.get(0);
		}else {
			isExist=false;
			config.setConfigKey("电价(元/度)");
			config.setConfigStatus(1);
			config.setConfigType("系统配置");
			config.setDataType("number");
		}
		config.setConfigValue(String.valueOf(price));
		try {
			if(isExist) {
				update(config);
			}else {
				add(config);
			}
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}
/*=========================================================修改方法================================================================*/
	
/*=========================================================删除方法================================================================*/
	
/*=========================================================删除方法================================================================*/
	

}
