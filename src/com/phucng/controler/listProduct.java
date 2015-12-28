package com.phucng.controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phucng.DATA.accountDAO;
import com.phucng.DATA.productDAO;
import com.phucng.beans.account;
import com.phucng.beans.product;

/**
 * Servlet implementation class listProduct
 */
//@WebServlet("/listProduct")
public class listProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

    String userDB, passDB, pathDB;
    @Override
    public void init(ServletConfig config) throws ServletException {
    	// TODO Auto-generated method stub
    	userDB = config.getServletContext().getInitParameter("userDB");
    	passDB = config.getServletContext().getInitParameter("passDB");
    	pathDB = config.getServletContext().getInitParameter("pathDB");
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username = (String) request.getSession().getAttribute("username");
		System.out.println("This is listPro"+username);
		int sttLog = (int) request.getSession().getAttribute("StaLog");
		List<account> lst4 = accountDAO.loadAccount(username, userDB, passDB, pathDB);
		
		//System.out.println(lst4);
		//get full_name
		String full_name = null;
		for(int i =0; i< lst4.size(); i++){
			full_name = lst4.get(i).getFull_name();
		}
		System.out.println(full_name);	
		
		//cal list product
		List<product> lst = productDAO.loadProduct(userDB, passDB, pathDB);
		
		//System.out.println(lst);
		request.setAttribute("lstPro", lst);
		request.setAttribute("sttLog", sttLog);
		request.setAttribute("fullname", full_name);
		request.getRequestDispatcher("/jsp/index.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
