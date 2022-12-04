package com.capol.shard.mapper;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import cn.hutool.json.JSONUtil;
import com.capol.shard.entity.LogId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class LogIdMapperTest {

    private static Snowflake snowflake = IdUtil.createSnowflake(1, 1);


    @Autowired
    private LogIdMapper logIdMapper;

    @Test
    void test() {
        LogId logId = new LogId();
        long id = snowflake.nextId();
        logId.setId(id);
        logId.setComment("Capol-Shard 分表组件");
        logId.setCreateDate(new Date());
        //插入
        logIdMapper.save(logId);
        //查询
        LogId logIdObject = logIdMapper.queryOne(id);
        System.out.println(JSONUtil.toJsonPrettyStr(logIdObject));
    }



}