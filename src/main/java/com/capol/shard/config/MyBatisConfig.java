package com.capol.shard.config;


import com.capol.shard.interceptor.TableShardInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBatisConfig {

    /**
     * 注册插件
     */
    @Bean
    public Interceptor tableShardInterceptor(){
        return new TableShardInterceptor();
    }

}
