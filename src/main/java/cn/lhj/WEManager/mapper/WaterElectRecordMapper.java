package cn.lhj.WEManager.mapper;

import cn.lhj.WEManager.po.WaterElectRecord;
import cn.lhj.WEManager.po.WaterElectRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaterElectRecordMapper {
    int countByExample(WaterElectRecordExample example);

    int deleteByExample(WaterElectRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WaterElectRecord record);

    int insertSelective(WaterElectRecord record);

    List<WaterElectRecord> selectByExample(WaterElectRecordExample example);

    WaterElectRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WaterElectRecord record, @Param("example") WaterElectRecordExample example);

    int updateByExample(@Param("record") WaterElectRecord record, @Param("example") WaterElectRecordExample example);

    int updateByPrimaryKeySelective(WaterElectRecord record);

    int updateByPrimaryKey(WaterElectRecord record);
}