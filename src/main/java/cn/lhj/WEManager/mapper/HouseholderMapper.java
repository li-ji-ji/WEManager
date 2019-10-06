package cn.lhj.WEManager.mapper;

import cn.lhj.WEManager.po.Householder;
import cn.lhj.WEManager.po.HouseholderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HouseholderMapper {
    int countByExample(HouseholderExample example);

    int deleteByExample(HouseholderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Householder record);

    int insertSelective(Householder record);

    List<Householder> selectByExample(HouseholderExample example);

    Householder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Householder record, @Param("example") HouseholderExample example);

    int updateByExample(@Param("record") Householder record, @Param("example") HouseholderExample example);

    int updateByPrimaryKeySelective(Householder record);

    int updateByPrimaryKey(Householder record);
}