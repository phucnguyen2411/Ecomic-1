package com.phucng.DATA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.phucng.beans.category;

public class categoryDAO {
	public static List<category> loadCategory(int product_cate_id, String userDB, String passDB, String pathDB){
		List<category> list = new ArrayList<>();
try {
			
			Connection connection = DatabaseUtil.getConnecting(userDB, passDB, pathDB);
			
			String query = "Select a.product_category_id, a.category_name, a.description from ecom_product_category a, ecom_product b where b.product_category_id = a.product_category_id and a.product_category_id = ?";
			PreparedStatement preS = connection.prepareStatement(query);
			preS.setInt(1, product_cate_id);
			ResultSet resultSet = preS.executeQuery();
			while (resultSet.next()){
				int id = resultSet.getInt("product_category_id");
				String category_name = resultSet.getString("category_name");
				String description = resultSet.getString("description");
				category cate = new category(id, category_name, description);
				list.add(cate);
			}
			
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();	
		}
		
		return list;
		
	}
}
