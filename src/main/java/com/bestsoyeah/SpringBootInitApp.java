package com.bestsoyeah;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Authour Zhang Yanfu
 * @Date 2018/6/10.
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
public class SpringBootInitApp extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(HeadstormApplication.class);
    }
}
