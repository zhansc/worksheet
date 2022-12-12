package com.zhansc.ahsecurity.controller;

import com.zhansc.ahsecurity.config.EnumProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 测试枚举配置
 *
 * @author zhanshuchan
 * @date 2022/11/27
 **/
@RestController
public class MyEnumConfigController {

    @Resource
    private EnumProperties enumProperties;

    @GetMapping("/myenum")
    public String myEnum(String name) {
        Map<String, String> alarmMap = enumProperties.getAlarmMap();
        return alarmMap.getOrDefault(name, null);
    }
}
