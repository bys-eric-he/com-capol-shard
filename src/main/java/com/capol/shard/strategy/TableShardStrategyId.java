package com.capol.shard.strategy;

import cn.hutool.core.util.StrUtil;
import com.capol.shard.interceptor.ITableShardStrategy;
import org.springframework.stereotype.Component;

/**
 * @Author Eric.He
 * @Description 分表策略id
 * @Date 2022/12/04
 */
@Component
public class TableShardStrategyId implements ITableShardStrategy {
    @Override
    public String generateTableName(String tableNamePrefix, Object value) {
        verificationTableNamePrefix(tableNamePrefix);
        if (value == null || StrUtil.isBlank(value.toString())) {
            throw new RuntimeException("value is null");
        }
        long id = Long.parseLong(value.toString());
        return tableNamePrefix + "_" + (id % 2);
    }
}
