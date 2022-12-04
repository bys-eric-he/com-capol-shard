package com.capol.shard.mapper;

import com.capol.shard.entity.LogDate;
import com.capol.shard.interceptor.TableShard;
import com.capol.shard.strategy.TableShardStrategyDate;


import java.util.List;

/**
 * @Author Eric.He
 * @Description
 * @Date 2022/12/04
 */
@TableShard(tableNamePrefix = "tb_log_date",shardStrategy = TableShardStrategyDate.class)
public interface LogDateMapper {

    /**
     * 查询列表-根据日期
     */
    List<LogDate> queryList();

    /**
     * 单插入
     */
    void  save(LogDate logDate);

}
