package com.clb.dao;



import com.clb.bean.WarningRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WarningRecordDao {
    int deleteByPrimaryKey (Long id);

    int insert (WarningRecord record);

    int insertSelective (WarningRecord record);

    WarningRecord selectByPrimaryKey (Long id);

    List<WarningRecord> selectAll ();

    int updateByPrimaryKeySelective (WarningRecord record);

    int updateByPrimaryKeyWithBLOBs (WarningRecord record);

    int updateByPrimaryKey (WarningRecord record);
}