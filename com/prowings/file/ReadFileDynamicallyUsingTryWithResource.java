package com.prowings.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ReadFileDynamicallyUsingTryWithResource {
	
	public static void main(String[] args) {
		
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		
		try (InputStream inputStream = classloader.getResourceAsStream("myfile.txt");
				InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
				BufferedReader reader = new BufferedReader(streamReader);) {
			String line = "";
			line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
				
			}
			
		}
		
//		catch (IOException e) {
//			System.out.println("Error while reading file!!");
//			e.printStackTrace();
//		}
				
		catch (IOException | ArithmeticException e) {
			System.out.println("Some exception occured!!");
			e.printStackTrace();
		}
	}

}
