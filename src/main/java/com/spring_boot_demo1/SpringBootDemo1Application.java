package com.spring_boot_demo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SpringBootDemo1Application {

//    或者在配置中修改
//    @Configuration
//    static class WebConfig implements WebMvcConfigurer {
//
//        @Override
//        public void addResourceHandlers(ResourceHandlerRegistry registry) {
//            //设置静态资源映射路径为/**，资源位置为类路径下的upload
//            registry.addResourceHandler("/**").addResourceLocations("classpath:/upload/");
//        }
//    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemo1Application.class, args);
    }

}
