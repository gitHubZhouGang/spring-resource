package com.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Constants;
import org.springframework.core.env.EnvironmentCapable;
import org.springframework.web.context.ConfigurableWebApplicationContext;
import org.springframework.web.context.support.AbstractRefreshableWebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * @Author ZGang
 * @Description: Ioc 容器
 * @Date: Create in 13:10 2017/12/29
 * @Modified By:
 */
public class IocOfContainer {

    /**
     * ApplicationContext 其是Spring IOC的最高形态
     */
    public void seeApplicationContextInterFace(){
        ApplicationContext context = null;

        ConfigurableApplicationContext configurableApplicationContext;

        AbstractRefreshableWebApplicationContext abstractRefreshableWebApplicationContext;

        XmlWebApplicationContext xmlWebApplicationContext = null;

        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = null;

    }
}
