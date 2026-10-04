package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingAfile {
	
	public static void main(String[] args) {
		
		//Byte stream
		
		File file = new File("C:\\\\Files/Hi.txt");
		FileInputStream fis = null;
		
		try {
			
		 fis = new FileInputStream(file);//this stream is particularly for this file
		
		int temp;     //stored in temporarily
		while((temp = fis.read()) != -1) {
			System.out.print((char) temp);
			
		}
		
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		
		//fileinputstream because we are reading a file
		
		
		
	}

}
