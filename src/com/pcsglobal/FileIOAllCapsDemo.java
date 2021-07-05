// FILE I/O Demo 
// A source file converted from all small to all caps
// Source file then replaced with Temp file
// Then on the next run the file converted from all caps to all small
// This keeps repeating for each run
// Log file creation

package com.pcsglobal;

import java.io.*;
import java.util.*;

public class FileIOAllCapsDemo 
{
	public static void main(String[] arguments) 
	{
		AllCaps cap = new AllCaps(arguments[0]);
		//AllCaps cap = new AllCaps();
		cap.convert();
	}
}

class AllCaps 
{
	String sourceName;

	AllCaps(String sourceArg) 
	//AllCaps() 
	{
		sourceName = sourceArg;
	}

    void convert() 
    {
        try 
        {
	    	// Create file objects
	    	File source = new File(sourceName);    // File Class implements Serializable
	    	String sourceNametmp = sourceName.substring(0, sourceName.indexOf("."));
	    	// System.out.println(sourceNametmp);
	
	    	//File temp = new File("cap" + sourceName + ".tmp");
	    	File temp = new File(sourceNametmp + "tmp");
	
	    	// Create input stream
	    	// FileReader fr = new FileReader(source);
	    	// BufferedReader in = new BufferedReader(fr);
	    	BufferedReader in = new BufferedReader(new FileReader(source));    // in a single line
	
	    	// Create output stream
	    	// FileWriter fw = new  FileWriter(temp);
	    	// BufferedWriter out = new BufferedWriter(fw);
	    	BufferedWriter out = new BufferedWriter(new FileWriter(temp));	   // in a single line
	
	    	boolean eof = false;
	    	int inChar = 0;
	
	    	do 
	    	{
	    		inChar = in.read();
	    		char outChar;
	    		if (inChar != -1) 
	    		{
	    			if (Character.isLowerCase(inChar)) 
	    				outChar = Character.toUpperCase( (char)inChar );
	    			else 
	    				outChar = Character.toLowerCase( (char)inChar );
	
	    			System.out.print(outChar);
	    			out.write(outChar);  // write() writes a single character to the output file
	    		} 
	    		else
	    			eof = true;
	    	} while (!eof);
	
	    	in.close();
	    	out.close();
	
	    	boolean deleted = source.delete();
	    	if (deleted) 
	    	{
	    		temp.renameTo(source);
	    		System.out.println(" ");
	    		System.out.println("Source file deleted and replaced by temp file...");
	    	}

	    	// Create the Output LOG FILE
	
	    	Date date = new Date();
	    	System.out.println(date);
	    	String year = date.toString().substring( 24,28 );
	    	String logDate = year+"_"+date.toString().substring( 4, 10 ).replace(' ','_');
	    	String logFile = source+"_" +logDate+".log";
	    	
	    	FileOutputStream file = new FileOutputStream(logFile);

	    	// FileWriter fw = new FileWriter(logFile);
	    	// BufferedWriter logOut = new BufferedWriter(fw);
	    	
	    	PrintStream logOut = new PrintStream(new BufferedOutputStream (file));
	    	PrintWriter writer = new PrintWriter( new FileWriter (logFile));
	    	
	    	//System.out.println(logFile);
	    	byte[] data = {'F', 'i', 'l' , 'e', ' ', 'N', 'a','m','e', ' ', 'i', 's', ' ', ':', ' ' };
	    	//System.out.println("Data Length : " +data.length);

	    	for (int i=0; i<data.length; i++)
	    		//logOut.write(data[i]);
	    		writer.print((char)data[i]);
	    	
            //writer.println();
	    	writer.print(logFile); 
            writer.println("\n");
            writer.println("Date : "+logDate);
            writer.println("--------------------");
            writer.println();
            writer.println("Process of UpperCase / LowerCase conversion is complete.....");
            
            writer.close();
            logOut.close();

        } 
        catch (IOException e) 
        {
            System.out.println("Error -- " + e.toString());
        }
        catch (SecurityException se) 
        {
            System.out.println("Error -- " + se.toString());
        }
    } // convert()
}  // Class AllCaps
