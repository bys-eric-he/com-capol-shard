package com.capol.shard.mapper;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import cn.hutool.json.JSONUtil;
import com.capol.shard.entity.LogDate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class LogDateMapperTest {

    private static Snowflake snowflake = IdUtil.createSnowflake(2, 2);

    @Autowired
    private LogDateMapper logDateMapper;

    @Test
    void test() {
        LogDate logDate = new LogDate();
        logDate.setId(snowflake.nextId());
        logDate.setComment("Capol-Shard 分表组件, 数据按ID进行取模分表!");
        logDate.setCreateDate(new Date());
        //插入
        logDateMapper.save(logDate);
        //查询
        List<LogDate> logDates = logDateMapper.queryList();
        System.out.println(JSONUtil.toJsonPrettyStr(logDates));
    }

}