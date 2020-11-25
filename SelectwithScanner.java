package com.org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectwithScanner {

 public static void main(String[] args) throws ClassNotFoundException, SQLException {
  Scanner sc=new Scanner(System.in);
  Class.forName("com.mysql.cj.jdbc.Driver");
  String url="jdbc:mysql://localhost:3306/motivity";
  String username="root";
  String password="root";
  Connection connection=DriverManager.getConnection(url, username, password);
  System.out.println("enter employee id");
  int eid=sc.nextInt();
  String qry="select ename employee where eid=?";
  PreparedStatement stmt=connection.prepareStatement(qry);
  stmt.setInt(1,eid);
  ResultSet rs=stmt.executeQuery();
  if(rs.next())
  {
   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
   String ename=rs.getString("ename");
   System.out.println("Data Retrieved");
  }
  else {
   System.out.println("Failed......");
  }

  
 }

}

