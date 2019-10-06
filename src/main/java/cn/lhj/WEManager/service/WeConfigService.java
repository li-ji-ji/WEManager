package cn.lhj.WEManager.service;

import org.springframework.stereotype.Service;

import cn.lhj.WEManager.po.WeConfig;

@Service
public interface WeConfigService extends BaseService<WeConfig, Integer> {


	
/*=================================查询====================================*/
	//根据配置键名查询已启用配置
	public WeConfig getAbleByKey(String configKey) throws Exception;
	
/*=================================查询====================================*/	
	
	
/*=================================添加====================================*/
/*=================================添加====================================*/
	
	
/*=================================修改====================================*/
	//修改水价
	public int setWaterPrice(Double price) throws Exception;
	//修改电价
	public int setElectPrice(Double price) throws Exception;
/*=================================修改====================================*/
	
	
/*=================================删除====================================*/
/*=================================删除====================================*/
	
}
