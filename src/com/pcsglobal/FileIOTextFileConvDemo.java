// FILE I/O
// This program Converts a File to another File with some additional information appended in the end

package com.pcsglobal;

import java.io.*;
import java.util.StringTokenizer;

public class FileIOTextFileConvDemo {

	  public static void main ( String[] args ) throws IOException , FileNotFoundException
	  {
	    if (args.length < 2) {
	        System.err.println("Usage is : java FileIOTextFileConvDemo <input> <output>");
	        System.exit(1);
	    }
	    else if (new File(args[1]).exists()) {
	            System.err.println ( "Output file : " +args[1]+" already exists ! Overwriting it...");
	            File file = new File(args[1]);
	            file.delete();
	    }
//	    else
	      try
	      {
	        BufferedReader reader = new BufferedReader ( new FileReader (args[0]));
	        PrintWriter writer = new PrintWriter ( new FileWriter (args[1]));
	        // the try/finally gaurantees the writer is closed
	        try
	        {
	          for (String line = reader.readLine(); line != null; line = reader.readLine())
	          {
	            writer.println(line);
	          }
	          writer.println("The file is converted");
	        }
	        finally
	        {
	          writer.close();
	          reader.close();	        }
	      } catch (IOException e)
	        {
	          System.err.println("Error - " +e.getMessage());
	        }
	  }
	}
