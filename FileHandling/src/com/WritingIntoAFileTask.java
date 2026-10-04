package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingIntoAFileTask {
	
	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++) {
      File file = new File("C:\\\\Task/file" + i+".txt");
      FileOutputStream fos = null;
	try {
		fos = new FileOutputStream(file);
		String data = " Created file " + i ;
		fos.write(data.getBytes());
		System.out.println(" file "+ i +" successfully written ");
	
				fos.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
