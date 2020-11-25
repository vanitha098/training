package com.org.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class preparedSelect {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
   Connection con=Connectionest.Connectivity();
     con.setAutoCommit(false);
     PreparedStatement preparedStatement=con.prepareStatement("select *from employee where eid =?");
     preparedStatement.setInt(1, 7);
   ResultSet rs=preparedStatement.executeQuery();
   while(rs.next())
   {
    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
   }
   con.setAutoCommit(true);
    
 }

}

