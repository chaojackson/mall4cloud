package com.mall4j.cloud.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zyc
 * @date 2020/9/21
 */
@EnableAspectJAutoProxy(exposeProxy = true)
@Configuration
public class AopConfig {
}
