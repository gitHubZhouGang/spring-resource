package com.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;

/**
 * @Author ZGang
 * @Description: Ioc 容器
 * @Date: Create in 13:10 2017/12/29
 * @Modified By:
 */
public class IocOfContainer {

    /**
     * 查看BeanFactory 接口源码
     *  BeanFactory接口是IOC容器基础规范, 其定义了容器的基本功能方法
     */
    public void seeBeanFactoryInterface(){

        BeanFactory beanFactory = null;

        beanFactory.containsBean("a");//这个bean是不是在容器内

        beanFactory.getAliases("");//获得Bean别名

        beanFactory.getBean("beanName");//通过名称获得类对象

        beanFactory.getBean(IocOfContainer.class);//通过类类型来获得类对象

        beanFactory.getType("");//获得类类型

    }

    /**
     * ApplicationContext 其是Spring IOC的最高形态
     */
    public void seeApplicationContextInterFace(){
        ApplicationContext context = null;

    }
}
