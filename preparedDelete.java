package com.org.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class preparedDelete {

 public static void main(String[] args) throws ClassNotFoundException, SQLException {
  Connection con=Connectionest.Connectivity();
    PreparedStatement preparedStatement=con.prepareStatement("delete from employee where eid =?");
    preparedStatement.setInt(1, 3);
    int x=preparedStatement.executeUpdate();
    if(x==1)
    {
     System.out.println("Record Deleted");
    }
   

 }

}

