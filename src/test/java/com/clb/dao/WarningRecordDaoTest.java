package com.clb.dao;

import com.clb.bean.WarningRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author cuilibo@k2data.com.cn
 * @Date 18-4-20 下午2:41.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:springmvc.xml"})
public class WarningRecordDaoTest {

    @Autowired
    WarningRecordDao warningRecordDao;

    @Test
    public void deleteByPrimaryKey () throws Exception {

    }

    @Test
    public void insert () throws Exception {

    }

    @Test
    public void insertSelective () throws Exception {

    }

    @Test
    public void selectByPrimaryKey () throws Exception {

    }

    @Test
    public void selectAll () throws Exception {
        List<WarningRecord> warningRecords = warningRecordDao.selectAll();
        warningRecords.forEach(s-> System.out.println(s.getMessage()));
    }

    @Test
    public void updateByPrimaryKeySelective () throws Exception {

    }

    @Test
    public void updateByPrimaryKeyWithBLOBs () throws Exception {

    }

    @Test
    public void updateByPrimaryKey () throws Exception {

    }

}