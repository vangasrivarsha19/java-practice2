package com;

import java.io.File;
import java.io.IOException;

public class FileCreation2 {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\Task/file1.txt");
		try {
			
			file.createNewFile();
			
			System.out.println("created task file");
			}
			catch(IOException exc) {
				System.out.println(exc.getMessage());
			}
	}

}
