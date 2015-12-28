package com.phucng.DATA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.phucng.beans.account;

public class accountDAO {
	public static boolean checkAccount(String username, String password, String userDB, String passDB, String pathDB){
		try {
			Connection connection = DatabaseUtil.getConnecting(userDB, passDB, pathDB);
			Statement statement = connection.createStatement();
			String query = "SELECT username, password FROM account";
			statement.execute(query);
			ResultSet en = statement.getResultSet();
			
			while (en.next()) {
				String usernameCheck = en.getString("username");
				String passwordCheck = en.getString("password");
				if(username.equals(usernameCheck) && password.equals(passwordCheck)){
					return true;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public static List<account> loadAccount(String userLogin, String userDB, String passDB, String pathDB){
		
		List<account> list = new ArrayList<>();
		try {
			Connection connection = DatabaseUtil.getConnecting(userDB, passDB, pathDB);
			String query = "Select * from account where username = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userLogin);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()){
				int id = rs.getInt("id");
				String username = rs.getString("username");
				String password = rs.getString("password");
				String full_name = rs.getString("full_name");
				account acc = new account(id, username, password, full_name);
				list.add(acc);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
}
