package com.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.HierarchicalBeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * SpringBeanFactory 主要是用来描述Spring Bean的创建架构
 *
 * @author ZGang
 * @create 2017-12-29 23:40
 **/
public class SpringBeanFactory {

    /**
     * BeanFactory 是Spring 创建Bean的基础接口
     *  可以通过BeanFactory可以访问Spring容器
     *  @see {https://www.cnblogs.com/ITtangtang/p/3978349.html) DefaultListableBeanFactory.uml
     */
    public void seeBeanFactory(){
        BeanFactory beanFactory = null;//BeanFactory 的顶级接口

        ListableBeanFactory listableBeanFactory = null;//接口 标示接口可列表
        ConfigurableListableBeanFactory configurableListableBeanFactory = null;//接口
        DefaultListableBeanFactory defaultListableBeanFactory = null;//是BeanFactory 的最终实现类

        HierarchicalBeanFactory hierarchicalBeanFactory = null;//接口 标示接口有继承
        ConfigurableBeanFactory configurableBeanFactory = null;//接口
        AbstractAutowireCapableBeanFactory abstractAutowireCapableBeanFactory = null;//抽象类

        AutowireCapableBeanFactory autowireCapableBeanFactory = null;//接口 标示接口自动装配规则
    }
}
