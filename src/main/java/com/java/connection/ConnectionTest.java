package com.java.connection;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConnectionTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("connections.xml");
		JDBCConnection connection=context.getBean("jdbc", JDBCConnection.class);
		connection.displayConnectionData();
		connection.getJDBCConnection();

	}

}
