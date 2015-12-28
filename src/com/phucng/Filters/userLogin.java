package com.phucng.Filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class userLogin
 */
@WebFilter("/checkLogin")
public class userLogin implements Filter {

    /**
     * Default constructor. 
     */
    public userLogin() {
        // TODO Auto-generated constructor stub
    	
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Login destroy");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		HttpServletRequest httpReq = (HttpServletRequest) request; 
	    HttpServletResponse httpRes = (HttpServletResponse) response;

	    HttpSession session = httpReq.getSession();
	    int sttLog = (int) session.getAttribute("StaLog");

	    if (sttLog == 0) {
	        httpRes.sendRedirect("/Ecomic-1/checkLogin");    //redirect to LoginServlet
	    } else {        
	        chain.doFilter(request, response);
	    }
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		//log start Fillter
		System.out.println("Login init");
	}

}
