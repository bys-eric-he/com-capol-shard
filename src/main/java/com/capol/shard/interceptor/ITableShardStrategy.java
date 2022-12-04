package com.capol.shard.interceptor;


import cn.hutool.core.util.StrUtil;

/**
 * @Author Eric.He
 * @Description 分表策略接口
 * @Date 2022/12/04
 */
public interface ITableShardStrategy {


    /**
     * @author: Eric.He
     * @description: 生成分表名
     * @param tableNamePrefix 表前缀名
     * @param value 值
     * @date: 2022/12/04
     * @return: java.lang.String
     */
    String generateTableName(String tableNamePrefix,Object value);

    /**
     * 验证tableNamePrefix
     */
    default void verificationTableNamePrefix(String tableNamePrefix){
        if (StrUtil.isBlank(tableNamePrefix)) {
            throw new RuntimeException("tableNamePrefix is null");
        }
    }
}
