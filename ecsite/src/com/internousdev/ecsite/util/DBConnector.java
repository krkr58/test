package com.internousdev.ecsite.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static String driverName="com.mysql.jdbc.Driver"; //ドライバー名

	private static String url="jdbc:mysql://localhost/ecsite"; //接続先データーベース

	private static String user="root"; //ユーザー名
	private static String password="mysql"; //パスワード

	public Connection getConnection(){
		Connection con=null;

		try{
			Class.forName(driverName);
			con=DriverManager.getConnection(url,user,password);
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}catch (SQLException e){
			e.printStackTrace();
		}
		return con;
	}
}