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
import com.phucng.DATA.categoryDAO;
import com.phucng.DATA.productDAO;
import com.phucng.beans.account;
import com.phucng.beans.category;
import com.phucng.beans.product;

/**
 * Servlet implementation class detailProduct
 */
@WebServlet("/detailProduct")
public class detailProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public detailProduct() {
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
		
		String nameProduct = request.getParameter("namePro");
		String product_cate_id = request.getParameter("cateID"); 
		int cateID = Integer.parseInt(product_cate_id);
		//System.out.println(product_cate_id);
		List<product> lst = productDAO.loadProduct(userDB, passDB, pathDB);
		List<product> lst2 = productDAO.detailProduct(nameProduct, userDB, passDB, pathDB);
		List<category> lst3 = categoryDAO.loadCategory(cateID, userDB, passDB, pathDB);
		
		
		//get_name category 
		String name = null;
		for(int i=0;i<lst3.size();i++){
			name = lst3.get(i).getCategory_name();
		}
		int sttLog = (int) request.getSession().getAttribute("StaLog");
		
		
		//set attribute send jsp
		
		request.setAttribute("sttLog", sttLog);
		request.setAttribute("lstPro", lst);
		request.setAttribute("lstDetail", lst2);
		request.setAttribute("nameCate", name);
		
		
		request.getRequestDispatcher("/jsp/single-product.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	

}
