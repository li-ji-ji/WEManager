package cn.lhj.WEManager.mapper;

import cn.lhj.WEManager.po.WeConfig;
import cn.lhj.WEManager.po.WeConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeConfigMapper {
    int countByExample(WeConfigExample example);

    int deleteByExample(WeConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WeConfig record);

    int insertSelective(WeConfig record);

    List<WeConfig> selectByExample(WeConfigExample example);

    WeConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WeConfig record, @Param("example") WeConfigExample example);

    int updateByExample(@Param("record") WeConfig record, @Param("example") WeConfigExample example);

    int updateByPrimaryKeySelective(WeConfig record);

    int updateByPrimaryKey(WeConfig record);
}