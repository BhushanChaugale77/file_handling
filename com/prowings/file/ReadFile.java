package com.prowings.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Bhushan\\.eclipse\\myfile.txt");
		FileReader fr = new FileReader(file);
		
		int i;
		while ((i = fr.read()) != -1)
			System.out.println((char)i);
		
		
	}
	
	
}
