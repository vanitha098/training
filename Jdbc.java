package com.org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc {

 public static void main(String[] args) throws Exception, SQLException {
  Class.forName("com.mysql.cj.jdbc.Driver");
  String url="jdbc:mysql://localhost:3306/motivity";
  String username="root";
  String password="root";
  Connection connection=DriverManager.getConnection(url, username, password);
  if(connection!=null)
  {
   System.out.println("Connection established");
  }
  
  
	
 }
 
}

