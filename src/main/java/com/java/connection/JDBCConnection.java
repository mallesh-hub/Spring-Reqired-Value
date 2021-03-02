package com.java.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Value;

public class JDBCConnection {
	
	@Value("${JDBCConnection.driver}")
	private String driver;
	
	@Value("${JDBCConnection.url}")
	private String url;
	
	@Value("${JDBCConnection.userName}")
	private String userName;
	
	@Value("${JDBCConnection.password}")
	private String password;
	
	
	public void getJDBCConnection() throws SQLException, ClassNotFoundException
	{
		 // DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Class.forName(driver);
		    System.out.println("river registered successfully");
		    Connection connection=DriverManager.getConnection(url,userName,password);
		    System.out.println("connection is executed");
		    //Statement statement=connection.createStatement();
		   //System.out.println("statement is executed");
		  // statement.executeUpdate("create table emp(eno number(5),name varchar2(25),address varchar2(25),doj date)");
		  // System.out.println("table is creted");
	}

	public void displayConnectionData()
	{
		System.out.println("driver class name: "+driver);
		System.out.println("driver url is:  "+url);
		System.out.println("user name is :"+userName);
		System.out.println("password is:  "+password);
	}
}
