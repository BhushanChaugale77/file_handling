package com.prowings.file;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResourceEx {

	public static void main(String[] args) {

		try (MyResource resource = new MyResource();
				BufferedReader br = new BufferedReader(new FileReader("abc.txt"));) {
			System.out.println("Inside try block!!");
			throw new NullPointerException();

		} catch (Exception e) {
			System.out.println("Inside Catch block!!");
		}

	}
}
