package com.classprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f1=new File("D://student.txt");
		FileInputStream fis=new FileInputStream(f1);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student s=(Student)ois.readObject();
		s.Display();
		ois.close();
		fis.close();
		
		

	}
  
 }
