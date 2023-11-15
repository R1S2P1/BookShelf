package com.BOOKS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class CheckConnection {
	


	    public static void main(String[] args) {
	        String jdbcUrl = "jdbc:mysql://localhost:3306/LoginUser";
	        String username = "root";
	        String password = "root";

	        try {
	            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

	            // Create a simple query to check the connection
	            String query = "SELECT 1";
	            Statement statement = connection.createStatement();
	            statement.execute(query);

	            System.out.println("Connection is valid.");
	            connection.close();
	        } catch (SQLException e) {
	            System.out.println("Connection is not valid.");
	            e.printStackTrace();
	        }
	    }
	}


