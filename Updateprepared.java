package com.org.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Updateprepared {

 public static void main(String[] args) throws ClassNotFoundException, SQLException {
  Connection con=Connectionest.Connectivity();
   con.setAutoCommit(false);
  PreparedStatement preparedStatement=con.prepareStatement("Update employee set esalary=esalary+? where eid =?");
  preparedStatement.setInt(1, 1000);
  preparedStatement.setInt(2,5);
  int x=preparedStatement.executeUpdate();
  con.setAutoCommit(true);
  if(x==1)
  {
   System.out.println("Record updated");
  }
 }

}

