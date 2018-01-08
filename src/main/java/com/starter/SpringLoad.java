package com.starter;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.web.context.ConfigurableWebApplicationContext;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

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

        //所有的context类都必须实现这个接口
        ConfigurableWebApplicationContext configurableWebApplicationContext = null;//接口

        AbstractApplicationContext abstractApplicationContext;//抽象类  主要是refresh方法

        XmlWebApplicationContext xmlWebApplicationContext;//默认的Web容器实现类   如果不指定则直接使用这个

    }

    /**
     * Context 初始化
     */
    public void contextInit(){
        /*
         *   1,创建ApplicationContext   ContextLoad.createWebApplicationContext(servletContext);
         *      可以通过Servlet initparam 指定创建的Context类型 如果不指定则默认为XmlWebApplicationContext
         */

        /**
         *  2,检验创建的Context 是否和ConfigurableWebApplicationContext是否相同或是另一个类的超类或接口。 ;  this.context isAssignableFrom ConfigurableWebApplicationContext
         *      如果不是这个子类,则表明我们无需读取配置资源 来对Context初始化
         *      同时判断状态  context.isActive();   active是通过AtomicBoolean 来标识的;相关操作轻查看jdk原子操作包
         */

        /**
         * 3,设置Context Parent类
         */

        /**
         * 4,初始化Context准备   ContextLoad.configureAndRefreshWebApplicationContext(context, servletContext);
         *      4.1 设置 Context.id  通过配置或者自动生产
         *      4.2 获得配置文件地址  String configLocationParam = sc.getInitParameter(CONFIG_LOCATION_PARAM);
         *      4.3 Context.refresh();  调用的是AbstractApplicationContext中的实现方法
         *
         */

        /**
         * 5,开始初始化AbstractApplicationContext.refresh();
         *      5.1 prepareRefresh(); 为初始化做准备   设置 closed  active 属性;
         *      5.2 obtainFreshBeanFactory();  绑定/刷新BeanFactory
         *          5.2.1 先刷新AbstractRefreshableApplicationContext.refreshBeanFactory();
         *          5.2.2 如果已存在,则先销毁Bean 然后关闭BeanFactory
         *          5.2.3 判断Beanfactory 如果是开始初始化AbstractApplicationContext.getInternalParentBeanFactory();  如果是ConfigurableApplicationContext则获取的是父类的BeanFactory,如果不是则直接调用getParent();
         *          5.2.4 创建AbstractRefreshableApplicationContext.createBeanFactory();-->DefaultListableBeanFactory对象;
         *          5.2.5 设置BeanFactory AbstractRefreshableApplicationContext.customizeBeanFactory(beanFactory); 是否允许同名覆盖 和循环调用  如果想设置这两个属性则可以在web中指定BeanFactory为DefaultListableBeanFactory  然后通过setAllowCircularReferences和setAllowBeanDefinitionOverriding这俩ing方法来做
         *          5.2.6 AbstractRefreshableApplicationContext.loadBeanDefinitions(beanFactory); 开始解析xml文件  加载BeanDefinitions
         *
         *      5.3 prepareBeanFactory(beanFactory);//准备BeanFactory
         *      5.4 postProcessBeanFactory(beanFactory);//
         *      5.5 invokeBeanFactoryPostProcessors(beanFactory);
         *      5.6 registerBeanPostProcessors(beanFactory);//作用是用于拦截Bean的创建
         *      5.7 initMessageSource();
         *      5.8 initApplicationEventMulticaster();//初始化上下文的事件多播组建，ApplicationEvent触发时由multicaster通知给ApplicationListener
         *      5.9 onRefresh();
         *      5.10 registerListeners();//注册事件监听器，事件监听Bean统一注册到multicaster里头，ApplicationEvent事件触发后会由multicaster广播
         *      5.11 finishBeanFactoryInitialization(beanFactory);//非延迟加载的单例Bean实例化
         *      5.12 finishRefresh();
         *
         */

    }
}
