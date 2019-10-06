package cn.lhj.WEManager.mapper;

import cn.lhj.WEManager.po.ElectRecord;
import cn.lhj.WEManager.po.ElectRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ElectRecordMapper {
    int countByExample(ElectRecordExample example);

    int deleteByExample(ElectRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ElectRecord record);

    int insertSelective(ElectRecord record);

    List<ElectRecord> selectByExample(ElectRecordExample example);

    ElectRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ElectRecord record, @Param("example") ElectRecordExample example);

    int updateByExample(@Param("record") ElectRecord record, @Param("example") ElectRecordExample example);

    int updateByPrimaryKeySelective(ElectRecord record);

    int updateByPrimaryKey(ElectRecord record);
}