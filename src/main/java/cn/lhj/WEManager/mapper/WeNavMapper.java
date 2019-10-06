package cn.lhj.WEManager.mapper;

import cn.lhj.WEManager.po.WeNav;
import cn.lhj.WEManager.po.WeNavExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeNavMapper {
    int countByExample(WeNavExample example);

    int deleteByExample(WeNavExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WeNav record);

    int insertSelective(WeNav record);

    List<WeNav> selectByExampleWithBLOBs(WeNavExample example);

    List<WeNav> selectByExample(WeNavExample example);

    WeNav selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WeNav record, @Param("example") WeNavExample example);

    int updateByExampleWithBLOBs(@Param("record") WeNav record, @Param("example") WeNavExample example);

    int updateByExample(@Param("record") WeNav record, @Param("example") WeNavExample example);

    int updateByPrimaryKeySelective(WeNav record);

    int updateByPrimaryKeyWithBLOBs(WeNav record);

    int updateByPrimaryKey(WeNav record);
}