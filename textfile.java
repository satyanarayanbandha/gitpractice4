package com.DataFlair.FileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class CreateFile {
   public static void main(String[] args) throws IOException
      {
     try 
     {
          FileWriter fw=new FileWriter("/home/dfuser/Desktop/dataflair.txt");
          fw.write("Welcome to DataFlair's Tutorial of Java");
          fw.close();
       }
     catch(Exception e)
     {
        System.out.println(e);
        }
     System.out.println("File Created Sucessfully");
     }
  }