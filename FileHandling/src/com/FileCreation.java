package com;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\Files/Hi.txt");
		
		try {
		
		file.createNewFile();
		
		System.out.println("created a new file");
		}
		catch(IOException exc) {
			System.out.println(exc.getMessage());
		}
		
		
	}

}
