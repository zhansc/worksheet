package com.zhansc.ahsecurity.config;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.DefaultPropertySourceFactory;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.Optional;
import java.util.Properties;

/**
 * 自定义yaml解析工厂
 *
 * @author zhanshuchan
 * @date 2022/11/27
 **/
public class YmlSourceFactory extends DefaultPropertySourceFactory {

    private static final String YML_SUFFIX = ".yml";
    private static final String YAML_SUFFIX = ".yaml";

    @Override
    public PropertySource<?> createPropertySource(String name, EncodedResource resource) throws IOException {
        String sourceName = Optional.ofNullable(name).orElse(resource.getResource().getFilename());

        if (sourceName == null) {
            return super.createPropertySource(name, resource);
        }
        if (!resource.getResource().exists()) {
            // return an empty Properties
            return new PropertiesPropertySource(sourceName, new Properties());
        } else if (sourceName.endsWith(YML_SUFFIX) || sourceName.endsWith(YAML_SUFFIX)) {
            Properties propertiesFromYaml = loadYaml(resource);
            return new PropertiesPropertySource(sourceName, propertiesFromYaml);
        } else {
            return super.createPropertySource(name, resource);
        }
    }

    /**
     * load yaml file to properties
     *
     * @param resource
     * @return
     * @throws IOException
     */
    private Properties loadYaml(EncodedResource resource) throws IOException {
        YamlPropertiesFactoryBean factory = new YamlPropertiesFactoryBean();
        factory.setResources(resource.getResource());
        factory.afterPropertiesSet();
        return factory.getObject();
    }

}
