package com.classprograms;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
 {
  int Id;
  String name;
  double marks;

public Student(int id, String name, double marks) {
  super();
  Id = id;
  this.name = name;
  this.marks = marks;
 }
    public void Display()
    {
     System.out.println("Id is :"+ this.Id);
     System.out.println(("Name is :"+this.name));
     System.out.println("Marks are :"+this.marks);
    }}
public class Sample {

 public static void main(String[] args) throws IOException {
  System.out.println("===========Student Details===========");
  Student siddu=new Student(100,"Prasad Mld",75.00);
  File f1=new File("D://student.txt");
  f1.createNewFile();
  FileOutputStream fos=new FileOutputStream(f1);
  ObjectOutputStream oos=new ObjectOutputStream(fos);
  siddu.Display();
  oos.writeObject(siddu);
  oos.flush();
  oos.close();
  fos.close();
  
  
  

 }
 
}
