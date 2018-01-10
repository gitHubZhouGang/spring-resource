package com.ioc;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.AbstractRefreshableApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * @author ZGang
 * @description 此类主要用来关注Spring是如何处理SpringBean对象
 *    包含Bean的定义  以及关系处理
 * @create 2017-12-30 00:09
 **/
public class SpringBeanDeinition {

    /**
     * Spring 通过BeanDefinition来管理对象以及对象之间的关系
     */
    public void seeBeanDefinition() {

        BeanDefinition beanDefinition = null;

        beanDefinition.setParentName("");//父类名称

        beanDefinition.getParentName();

        beanDefinition.setBeanClassName("");//类名

        beanDefinition.getBeanClassName();

        beanDefinition.setScope("");//域

        beanDefinition.getScope();

        beanDefinition.setLazyInit(false);//延迟初始化

        beanDefinition.isLazyInit();

        beanDefinition.setDependsOn(null);//依赖类

        beanDefinition.getDependsOn();

        beanDefinition.setAutowireCandidate(false);//候选Bean

        beanDefinition.isAutowireCandidate();

        beanDefinition.setPrimary(false);//主要

        beanDefinition.isPrimary();

        beanDefinition.setFactoryBeanName("");//工厂类(创建)

        beanDefinition.getFactoryBeanName();

        beanDefinition.setFactoryMethodName("");

        beanDefinition.getFactoryMethodName();

        beanDefinition.getConstructorArgumentValues();//构造参数

        beanDefinition.getPropertyValues();//默认参数

        beanDefinition.isSingleton();//是否单例

        beanDefinition.isPrototype();

        beanDefinition.isAbstract();//是否抽象

        beanDefinition.getRole();//

        beanDefinition.getDescription();

        beanDefinition.getResourceDescription();

        beanDefinition.getOriginatingBeanDefinition();
    }

    /**
     * 了解BeanDefiniton的初始化
     */
    public  void seeBeanDefinitions(){
        /**
         *  1,在Web中 BeanDefainition主要是在Load配置文件的时候  读取配置文件信息转化为我们的对象信息;
         *   XmlWebApplicationContext.loadBeanDefinitions(DefaultListableBeanFactory beanFactory)
         */

        /**
         * 2,在解析xml之前  我们看到了Spring Environment,Reader,Loader,Resolver系列接口 在继续深入之前我们有必要了解一下着几个接口
         *   2.1 PropertyResolver
         *   2.3 Environment
         *   2.4 ResourceLoader
         *   2.5 BeanDefinitionReader
         */

    }

}
