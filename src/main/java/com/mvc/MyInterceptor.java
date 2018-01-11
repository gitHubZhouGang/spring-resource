package com.mvc;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {
    /** 
     * @Title: preHandle 
     * @Description: 在执行controller之前运行 
     * @param request 
     * @param response 
     * @param handler 
     * @return 
     * @throws Exception  
     */   
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;  
    }  
    /** 
     * @Title: postHandle 
     * @Description: 在执行完controller之后，ModelAndView渲染之前开始运行 
     * @param request 
     * @param response 
     * @param handler 
     * @param modelAndView 
     * @throws Exception  
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
            throws Exception {  
    }  
    /** 
     * @Title: afterCompletion 
     * @Description: 该方法将在整个请求完成之后，也就是DispatcherServlet渲染了视图后执行 
     * @param request 
     * @param response 
     * @param handler 
     * @param ex 
     * @throws Exception  
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)  
            throws Exception {  
    }  
      
} 