package com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingIntoAFile {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\\\\\\\Files/Bye.txt");
		
		try {
		FileOutputStream fos = new FileOutputStream(file);
		
		String data = "Java Full Stack";
		fos.write(data.getBytes());
		System.out.println("Successfully written into a file");
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
