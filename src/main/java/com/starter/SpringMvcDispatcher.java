package com.starter;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.FrameworkServlet;

import javax.servlet.http.HttpServlet;

/**
 * @author Weirdo
 * 从请求进入,了解springMvc
 */
public class SpringMvcDispatcher {
    public void doDisPatcher() {
        HttpServlet httpServlet = null;
        //HttpServlet#service(ServletRequest req, ServletResponse res)
        /*service这个方法的内容很简单，就是将ServletRequest和ServletResponse转换为HttpServletRequest和HttpServletResponse。
            因为我们是做web开发，通常用的是HTTP协议，所以这里我们需要的时候HttpServletRequest和HttpServletResponse。
            接下来就是调用service(HttpServletRequest request, HttpServletResponse response)，
            我们在HttpServlet和FrameworkServlet中都找到了这个方法，但是HttpServlet是FrameworkServlet的父类，
            即FrameworkServlet中重写了service这个方法，所以我们这里去FrameworkServlet中去看看这个方法的内容：*/
        FrameworkServlet frameworkServlet = null;
        //FrameworkServlet#service(HttpServletRequest request, HttpServletResponse response)
        //FrameworkServlet#HttpMethod httpMethod = HttpMethod.resolve(request.getMethod());
        /*第一步根据请求的方法类型转换对应的枚举类GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE
            如果请求类型为PATCH或者没有找到相应的请求类型的话，则直接调用processRequest这个方法。
            但是这种情况我们很少很少会遇到。所以这里会执行super.service这个方法。即调用HttpServlet中的service方法。*/
        //HttpServlet#service(HttpServletRequest req, HttpServletResponse resp)
        /*如果是get请求
            检查是不是开启了页面缓存 通过header头的 Last-Modified/If-Modified-Since
            获取Last-Modified的值
            没有开启页面缓存调用doGet方法
            获取If-Modified-Since的值
            更新Last-Modified
            调用doGet方法
            这个方法的主要作用是根据请求类型调用响应的请求方法如果GET类型，调用doGet方法；POST类型，调用doPost方法。
            这些方法都是在HttpServlet中定义的，平时我们做web开发的时候主要是继承HttpServlet这个类，然后重写它的doPost或者doGet方法。
            我们的FrameworkServlet这个子类就重写了这些方法中的一部分：doGet、doPost、doPut、doDelete、doOption、doTrace.
            这里我们只说我们最常用的doGet和doPost这两个方法。通过翻开源码我们发现，这两个方法体的内容是一样的，
            都是调用了processRequest这个方法。processRequest这个方法是我们接下来要分析的：*/
        //FrameworkServlet#processRequest(HttpServletRequest request, HttpServletResponse response)
        /*在这个方法里大概做了这样几件事：国际化的设置，创建ServletRequestAttributes对象，初始化上下文holders(即将Request对象放入到线程上下文中)，调用doService方法。我们分析主要的几个：
            国际化的设置主要是在DispatcherServlet#buildLocaleContext这个方法中完成的.
            根据我们之前的分析，如果我们没有配置国际化解析器的话，那么它会使用默认的解析器：AcceptHeaderLocaleResolver，
            即从Header中获取国际化的信息。除了AcceptHeaderLocaleResolver之外，SpringMVC中还提供了这样的几种解析器：
            CookieLocaleResolver、SessionLocaleResolver、FixedLocaleResolver。
            分别从cookie、session中去国际化信息和JVM默认的国际化信息(Local.getDefault())。
            initContextHolders这个方法主要是将Request请求、ServletRequestAttribute对象和国际化对象放入到上下文中*/
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        //DispatcherServlet#doService
        /*doService{
            1. 如果debug开启,输出包含信息的dubug日志
            2. 判断是不是 include 请求  即判断 reqeust 中是否含有以 org.springframework.web.servlet 开头的属性
            3. 保存请求快照  具体指保存 request 中与 SpringMVC 相关的属性到 SnapShot（快照）
            4. 添加到相关属性到请求  包括 SpringMVC 容器、LocaleResolver、ThemeResolver、ThemeSource 等
            5. 从 Session 中获取保存的 FlashMap，并将其添加到 request
            6. 关键 -> 真正的请求处理doDispatch
            7. 判断异步请求是否在正进行,如果没执行,则恢复请求快照具体指将 reqeust 中 SpringMVC 属性恢复成保存 SnapShot 时的样子
            restoreAttributesAfterInclude()
        }*/
        //DispatcherServlet#doDispatch
        /*检查是否是请求是否是multipart（如文件上传），如果是将通过MultipartResolver解析
            步骤2、请求到处理器（页面控制器）的映射，通过HandlerMapping进行映射
            步骤3、处理器适配，即将我们的处理器包装成相应的适配器（从而支持多种类型的处理器）
             304 Not Modified缓存支持
            执行处理器相关的拦截器的预处理（HandlerInterceptor.preHandle）
            步骤4、由适配器执行处理器（调用处理器相应功能处理方法）
            执行处理器相关的拦截器的后处理（HandlerInterceptor.postHandle）
            此处省略具体代码
            步骤5 步骤6、解析视图并进行视图的渲染
            步骤5 由ViewResolver解析View（viewResolver.resolveViewName(viewName, locale)）
            步骤6 视图在渲染时会把Model传入（view.render(mv.getModelInternal(), request, response);）
            执行处理器相关的拦截器的完成后处理（HandlerInterceptor.afterCompletion）*/
    }
}
