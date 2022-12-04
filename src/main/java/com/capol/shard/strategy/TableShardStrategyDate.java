package com.capol.shard.strategy;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.capol.shard.interceptor.ITableShardStrategy;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author Eric.He
 * @Description 分表策略日期
 * @Date 2022/12/04
 */
@Component
public class TableShardStrategyDate implements ITableShardStrategy {

    private static final String DATE_PATTERN = "yyyyMM";

    @Override
    public String generateTableName(String tableNamePrefix, Object value) {
        verificationTableNamePrefix(tableNamePrefix);
        if (value == null || StrUtil.isBlank(value.toString())) {
            return tableNamePrefix + "_" +DateUtil.format(new Date(), DATE_PATTERN);
        } else {
            return tableNamePrefix + "_" +DateUtil.format(new Date(), value.toString());
        }
    }
}
