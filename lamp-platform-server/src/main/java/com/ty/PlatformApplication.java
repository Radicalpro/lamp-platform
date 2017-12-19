package com.ty;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.nio.charset.Charset;
import java.util.List;

/**
 * spring-boot 启动类
 *
 * @author ty
 */
@SpringBootApplication
@ServletComponentScan
@MapperScan("com.ty.*.mapper")
public class PlatformApplication extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(PlatformApplication.class, args);
    }

}

