package com.org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ScannerwithUpdate {

 public static void main(String[] args) throws ClassNotFoundException, SQLException {
  Scanner sc=new Scanner(System.in);
  Class.forName("com.mysql.cj.jdbc.Driver");
  String url="jdbc:mysql://localhost:3306/motivity";
  String username="root";
  String password="root";
  Connection connection=DriverManager.getConnection(url, username, password);
  System.out.println("Enter the amount of salary you want to add");
  int esalary=sc.nextInt();
  System.out.println("Enter the employees id want to add");
  int eid=sc.nextInt();
  String qry="update employee set esalary=esalary+? where eid=?";
  PreparedStatement stmt=connection.prepareStatement(qry);
  stmt.setInt(1, esalary);
  stmt.setInt(2,eid);
  int i=stmt.executeUpdate();
  if(i!=0)
  {
   System.out.println("table updated successfully");
  }
  else
  {
   System.out.println("Table not updated successfully");
  }
  }

}

