
package com.org.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class selectMetadata {

 public static void main(String[] args) throws ClassNotFoundException, SQLException {
  Connection con=Connectionest.Connectivity();
    PreparedStatement preparedStatement=con.prepareStatement("select *from employee");
    ResultSet rs=preparedStatement.executeQuery();
    ResultSetMetaData rm=rs.getMetaData();
    System.out.println(rm.getColumnCount());
    System.out.println(rm.getColumnTypeName(1));

 }

}

