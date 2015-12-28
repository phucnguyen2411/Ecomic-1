package com.phucng.controler;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.phucng.DATA.accountDAO;

/**
 * Servlet implementation class doCheckLogin
 */
@WebServlet("/doCheckLogin")
public class doCheckLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public doCheckLogin() {
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
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		boolean kq = accountDAO.checkAccount(username, password, userDB, passDB, pathDB);
		if(kq){
			System.out.println("OK");
			request.getSession().setAttribute("StaLog", 1);
			System.out.println(request.getSession().getAttribute("StaLog"));
			response.sendRedirect(request.getContextPath() + "/index");
			request.getSession().setAttribute("username", username);
			System.out.println(username);
			
		}else{
			System.out.println("Err");
			request.getSession().setAttribute("StaLog", 0);
			request.getRequestDispatcher("/checkLogin").forward(request, response);
		}
	}

}
