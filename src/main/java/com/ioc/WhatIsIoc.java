package com.ioc;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author ZGang
 * @Description: 理解IOC主要用来干嘛的
 * @Date: Create in 11:17 2017/12/29
 * @Modified By:
 */
public class WhatIsIoc {

    /**
     * IOC(Inversion of Controller,控制反转)
     *
     *   我们可以采用八股文方式来理解;
     *   这里的控制说的是控制对象的生命周期   以及对象之间的依赖关系;
     *   反转的意思是对象的控制权从对象本身转移到IOC容器中;
     *      比如:Spring中  我们可以直接  @Autowired xxx 来获得对象,正常情况下   我们是采用  new XXX();来获得对象的;
     *
     *   控制反转中,控制是必要基础 反转则是使用手段;因为我们控制了对象的生命周期和依赖关系 才能施展反转这一功能;
     *
     *   Ioc的优点在于解耦 统一管理
     *
     *   Ioc实现关键在于如何管理类之间的对象和类的生命周期
     *
     *   Ioc使用关键在于如何实现反转
     *
     */

}
