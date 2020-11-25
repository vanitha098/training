package com.org.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class Metadata {

 public static void main(String[] args) throws ClassNotFoundException, SQLException {
  Connection con=Connectionest.Connectivity();
  DatabaseMetaData data=con.getMetaData();
  System.out.println(data.getDatabaseProductName());
  System.out.println(data.getDatabaseProductVersion());
  System.out.println(data.getURL());
  System.out.println(data.getUserName());

 }

}
