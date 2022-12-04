package com.capol.shard.mapper;


import com.capol.shard.entity.LogId;
import com.capol.shard.interceptor.TableShard;
import com.capol.shard.strategy.TableShardStrategyId;
import org.apache.ibatis.annotations.Param;


/**
 * @Author Eric.He
 * @Description
 * @Date 2022/12/04
 */
@TableShard(tableNamePrefix = "tb_log_id",value = "id",fieldFlag = true,shardStrategy = TableShardStrategyId.class)
public interface LogIdMapper {

    /**
     * 根据id查询-根据id分片
     */
    LogId queryOne(@Param("id") long id);

    /**
     * 单插入-根据id分片
     */
    void save(LogId logId);


}
