package com.Aseem.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyReadWriteClass {

	
	public String readTextFile(String path)
	{
		String returnValue="";
		FileReader file = null;
		String line = "";
		try
		{
			file = new FileReader(path);
			BufferedReader reader = new BufferedReader(file);
			while((line = reader.readLine()) != null)
			{
				returnValue+= line + "\n";
			}
		}
		catch (FileNotFoundException e) {
		      throw new RuntimeException("File not found");
		    } catch (IOException e) {
		      throw new RuntimeException("IO Error occured");
		    } finally {
		      if (file != null) {
		        try {
		          file.close();
		        } catch (IOException e) {
		          e.printStackTrace();
		        }
		      }
		    }		
		return returnValue;
	}
	
	
	public void writeTextFile(String fileName, String s)
	{
		FileWriter output = null;
		
		try {
		      output = new FileWriter(fileName);
		      BufferedWriter writer = new BufferedWriter(output);
		      writer.write(s);
		      writer.close();
		}
		catch (IOException e) {
		      e.printStackTrace();
		    } finally {
		      if (output != null) {
		        try {
		        	
		          output.close();
		        } catch (IOException e) {
		          e.printStackTrace();
		        }
		      }
		    }

		  }

}
