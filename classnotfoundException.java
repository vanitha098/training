package com.classprograms;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class classnotfoundException {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  try {
   Class.forName("com.classprograms.dowhile");
   System.out.println("class loaded successfully......");
  } catch (ClassNotFoundException e) {
   // TODO Auto-generated catch block
   System.out.println("unable to load class due to="+e);
   
    }
    
    
   }
   
  }
