package com.phucng.DATA;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {
	public static Connection getConnecting(String userDB, String passDB, String pathDB){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//Config basic DB
			String URL = pathDB;
			String UserDB = userDB;
			String PassDB = passDB;
			
			Connection connection = DriverManager.getConnection(URL, UserDB, PassDB);
			return connection;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
