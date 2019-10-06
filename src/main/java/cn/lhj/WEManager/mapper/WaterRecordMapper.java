package cn.lhj.WEManager.mapper;

import cn.lhj.WEManager.po.WaterRecord;
import cn.lhj.WEManager.po.WaterRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaterRecordMapper {
    int countByExample(WaterRecordExample example);

    int deleteByExample(WaterRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WaterRecord record);

    int insertSelective(WaterRecord record);

    List<WaterRecord> selectByExample(WaterRecordExample example);

    WaterRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WaterRecord record, @Param("example") WaterRecordExample example);

    int updateByExample(@Param("record") WaterRecord record, @Param("example") WaterRecordExample example);

    int updateByPrimaryKeySelective(WaterRecord record);

    int updateByPrimaryKey(WaterRecord record);
}