package com.starter;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

/**
 * @Author ZGang
 * @Description: 从应用启动 开始了解Spring的工作流
 * @Date: Create in 15:09 2017/12/29
 * @Modified By:
 */
public class SpringLoad {

    /**
     * 对于java Web应用来说，spring通过servlet规范来初始化WebApplicationContext(ioc容器)
     *  ContextLister 实现了ServletContextListener接口，
     *  当ServletContext初始化和销毁的时候就会调用contextInitialized和contextDestroyed方法，用来初始化IOC容器和释放IOC容器资源
     */
    public void seeContextLoaderListener(){
        ContextLoaderListener contextLoaderListener = null;

    }
}
