package com.starter;

import org.springframework.web.context.ContextLoader;
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
     *
     *  servlet规范规定：1，在应用服务启动的时候就会创建一个ServletContext  在应用服务结束时 销毁ServletContext
     *                  2，ServletContextListener 是监听ServletContext的监听器，在Servlet创建和销毁的时候会分别调用contextInitialized和contextDestroyed方法
     *  ContextLoaderListener 实现了ServletContextListener接口，
     *       1，当ServletContext初始化和销毁的时候就会调用contextInitialized和contextDestroyed方法，用来初始化IOC容器和释放IOC容器资源
     *       2，继承了ContextLoad方法
     */
    public void seeContextLoaderListener(){
        ContextLoaderListener contextLoaderListener = null;//类

        /**
         * ContextLoader类主要是用来做容器初始化的动作
         *  Servlet 2+
         *      在此版本的Servlet中，我们通过在web.xml中配置contextClass属性来指定类
         *  Servlet 3+
         *      在3.0之后，由于web.xml是非必须选项；所以ContextLoader可以直接在构造函数中直接注入WebApplicationContext
         *
         *  contextConfigLocation是指定配置文件路径的
         */
        ContextLoader contextLoader = null;//类
        contextLoader.initWebApplicationContext(null);//初始化容器

        //测试提交   查看分支的情况
    }
}
