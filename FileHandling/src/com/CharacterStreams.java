package com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreams {
	
	public static void main(String[] args) {
		
		
		
		File file = new File("C:\\\\Files/Hi2.txt");
		
		try {
		FileWriter fw = new FileWriter(file);
		
		fw.write("Hi Guyss...");
		fw.close();
		System.out.println("saved");
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
