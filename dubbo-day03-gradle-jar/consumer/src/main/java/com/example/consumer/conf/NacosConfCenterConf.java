package com.example.consumer.conf;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.api.config.annotation.NacosProperty;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname NacosConfCenterConf
 * @Description TODO
 * @Author xiexiaobiao
 * @Date 2019-08-02 22:00
 * @Version 1.0
 **/
@Configuration
@Configurable //Marks a class as being eligible for Spring-driven configuration.
//Annotation for enabling Nacos Config features.
@EnableNacosConfig(globalProperties = @NacosProperties(serverAddr = "127.0.0.1:8848"))
@NacosPropertySource(dataId = "config-center.properties",autoRefreshed = true,groupId = "DEFAULT_GROUP")
public class NacosConfCenterConf {

}
