package com.capol.shard.interceptor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author Eric.He
 * @Description 分表注解
 * @Date 2022/12/04
 */
@Target(value = {ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TableShard {

    // 表前缀名
    String tableNamePrefix();

    //值
    String value() default "";

    //是否是字段名，如果是需要解析请求参数改字段名的值（默认否）
    boolean fieldFlag() default false;

    // 对应的分表策略类
    Class<? extends ITableShardStrategy> shardStrategy();


}
