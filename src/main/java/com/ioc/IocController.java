package com.ioc;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConstructorArgumentValues;

/**
 * @Author ZGang
 * @Description: Spring 如何控制管理类 以及其之间的依赖关系
 * @Date: Create in 13:12 2017/12/29
 * @Modified By:
 */
public class IocController {

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


}
