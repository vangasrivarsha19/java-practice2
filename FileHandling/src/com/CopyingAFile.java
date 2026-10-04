package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingAFile {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\\\\\\\\\\\\\\\Files/Bye.txt");
		File file2 = new File("C:\\\\\\\\\\\\\\\\Files/Copy.txt");
		
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(file2);
			
			int temp;
			while((temp = fis.read()) != -1) {
				fos.write(temp);
				
			}
			
			System.out.println("copied files");
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		finally {

			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
				
			}
		}
		
	}

}
