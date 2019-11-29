package com.spring_boot_demo1.config;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Configuration;

//@Configuration表示该类为配置类，该注解可以被@ComponentScan扫描到
@Configuration
public class ServletConfig implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

    @Override
    public void customize(ConfigurableServletWebServerFactory factory) {
        factory.setPort(8888); // 自定义设置端口
    }
}
