package com.spt.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author gschao
 * @date 2016/9/22 9:07.
 */
@Configuration
public class DefaultViewSet extends WebMvcConfigurerAdapter {
    /**
     * @author gschao
     * create by 2016-09-22 09:09
     * 设置默认的跳转访问路径
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/login.html");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }


}
