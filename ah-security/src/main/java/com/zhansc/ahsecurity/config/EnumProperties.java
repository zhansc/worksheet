package com.zhansc.ahsecurity.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 枚举字段配置
 * 1、@ImportSource 引入外部配置文件，支持文件格式：xml，引入properties和yaml格式的配置提示：前言中不允许有内容。
 *   @PropertySource 注解默认解析properties，无法解析yaml配置文件，要想解析yaml配置可以指定加载配置的工厂，
 *   默认工厂是PropertySourceFactory.class，所以可以自定义解析yaml工厂
 *
 * @author zhanshuchan
 * @date 2022/11/27
 **/
@Data
@Component
@ConfigurationProperties(prefix = "my.enum")
@PropertySource(value = "classpath:/myenum/MyEnum.yaml", encoding = "UTF-8", factory = YmlSourceFactory.class)
public class EnumProperties {
    private Map<String, String> alarmMap;

    private List<String> incidentList;

    @Value("${my.enum.yake.address}")
    private String yakeAddress;

}
