package com.phucng.DATA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.phucng.beans.product;

public class productDAO {
	public static List<product> loadProduct(String userDB, String passDB, String pathDB) {
		List<product> list = new ArrayList<>();
		try {
			
			Connection connection = DatabaseUtil.getConnecting(userDB, passDB, pathDB);
			Statement statement = connection.createStatement();
			
			String query = "Select * from ecom_product";
			statement.execute(query);
			
			ResultSet resultSet = statement.getResultSet();
			while (resultSet.next()){
				int product_id = resultSet.getInt("product_id");
				String product_name = resultSet.getString("product_name");
				double product_price = resultSet.getDouble("product_price");
				double product_price_promotion = resultSet.getDouble("product_price_promotion");
				String description = resultSet.getString("description");
				int product_category_id = resultSet.getInt("product_category_id");
				String product_image = resultSet.getString("product_image");
				String maker_date = resultSet.getString("maker_date");
				String maker = resultSet.getString("maker");
				product pro = new product(product_id, product_name, product_price, product_price_promotion, description, product_category_id, product_image, maker_date, maker);
				list.add(pro);
			}
			
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();	
		}
		return list;
	}
	public static List<product> detailProduct(String nameProduct, String userDB, String passDB, String pathDB){
		List<product> list = new ArrayList<>();
try {
			
			Connection connection = DatabaseUtil.getConnecting(userDB, passDB, pathDB);
			
			String query = "Select * from ecom_product where product_name = ?";
			PreparedStatement preS = connection.prepareStatement(query);
			preS.setString(1, nameProduct);
			ResultSet resultSet = preS.executeQuery();
			while (resultSet.next()){
				int product_id = resultSet.getInt("product_id");
				String product_name = resultSet.getString("product_name");
				double product_price = resultSet.getDouble("product_price");
				double product_price_promotion = resultSet.getDouble("product_price_promotion");
				String description = resultSet.getString("description");
				int product_category_id = resultSet.getInt("product_category_id");
				String product_image = resultSet.getString("product_image");
				String maker_date = resultSet.getString("maker_date");
				String maker = resultSet.getString("maker");
				product pro = new product(product_id, product_name, product_price, product_price_promotion, description, product_category_id, product_image, maker_date, maker);
				list.add(pro);
			}
			
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();	
		}
		
		return list;
		
	}
	
	
}
