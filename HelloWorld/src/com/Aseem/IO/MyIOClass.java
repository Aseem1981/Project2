package com.Aseem.IO;

public class MyIOClass {
	
	public static void main(String[] args)
	{
		String path = System.getProperty("user.dir"); 
		MyReadWriteClass myFile = new MyReadWriteClass();
		//System.out.println(path+"\\SampleTestTextFile.txt");
	    String input = myFile.readTextFile("SampleTestTextFile.txt");
	    System.out.println(input);
	    
	    myFile.writeTextFile("SampleWriteFile.txt", "Sample Text" + input);

	}

}
