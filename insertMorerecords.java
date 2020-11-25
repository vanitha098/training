ackage com.org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insertMorerecords {

 public static void main(String[] args) throws ClassNotFoundException, SQLException {
  Class.forName("com.mysql.cj.jdbc.Driver");
  String url="jdbc:mysql://localhost:3306/motivity";
  String username="root";
  String password="root";
  Connection connection=DriverManager.getConnection(url, username, password);
  String sql="insert into employee values (?,?,?,?)";
  PreparedStatement preparedStatement=connection.prepareStatement(sql);
  Scanner sc=new Scanner(System.in);
  String option;
  do {
   System.out.println("Enter Employye Details");
   int eid=sc.nextInt();
   String ename=sc.next();
   int esalary=sc.nextInt();
   String company_Name=sc.next();
   preparedStatement.setInt(1, eid);
   preparedStatement.setString(2, ename);
   preparedStatement.setInt(3, esalary);
   preparedStatement.setString(4, company_Name);
   int x=preparedStatement.executeUpdate();
   if(x==1)
   {
    System.out.println("Record inserted");
   }
   System.out.println("Do you want more Records y/n");
   option=sc.next();
  }while(option.equalsIgnoreCase("y")); 

 }
}

