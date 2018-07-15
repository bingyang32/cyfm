package com.ppcxy.common.web.filter;

import org.springside.modules.web.Servlets;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by weep on 2016-5-19.
 */
public class PreSiteMeshFilter extends BaseFilter implements Filter {
    
    
    /**
     * 子类覆盖
     *
     * @param request
     * @param response
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        
        String header = request.getHeader("User-Agent").toLowerCase();
        
        //Android iphone phone ipad
        if (header.indexOf("android") != -1 || header.indexOf("phone") != -1 || header.indexOf("pad") != -1) {
            Servlets.changeCookie("skin", "mobile", request, response);
        }else{
            Servlets.changeCookie("skin", "content", request, response);
        }
        
        //String requestURI = request.getRequestURI();
        //String contextPath = request.getContextPath();
        //
        //if (contextPath.equals(requestURI) || (contextPath + "/").equals(requestURI)) {
        //    Servlets.changeCookie("skin", "default", request, response);
        //}else if(StringUtils.contains(requestURI,"/manage")){
        //    Servlets.changeCookie("skin", "content", request, response);
        //}
        chain.doFilter(request, response);
    }
    
}
