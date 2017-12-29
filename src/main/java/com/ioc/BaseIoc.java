package com.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;

/**
 * @Author ZGang
 * @Description: IOC基础
 * @Date: Create in 11:00 2017/12/29
 * @Modified By:
 */
public class BaseIoc {
    /**
     * IOC 概念
     *  IOC inversion if controller 控制反转
     *  把bean交给容器管理,一个容器可以装饰一个bean的所有信息
     */
    /**
     * 查看BeanFactory 接口源码
     *  BeanFactory接口是IOC容器基础规范, 其定义了容器的基本功能方法
     */
    public void seeBeanFactoryInterface(){

        BeanFactory beanFactory = null;

        beanFactory.containsBean("a");//这个bean是不是在容器内

        beanFactory.getAliases("");//获得Bean别名

        beanFactory.getBean("beanName");//通过名称获得类对象

        beanFactory.getBean(BaseIoc.class);//通过类类型来获得类对象

        beanFactory.getType("");//获得类类型

    }

    /**
     * ApplicationContext 其是Spring IOC的最高形态
     */
    public void seeApplicationContextInterFace(){
        ApplicationContext context = null;
    }
}
