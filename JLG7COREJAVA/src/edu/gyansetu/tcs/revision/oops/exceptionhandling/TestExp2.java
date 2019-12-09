package edu.gyansetu.tcs.revision.oops.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestExp2 {

	public static void main(String[] args) {

		// database
		// file
		// networking
		System.out.println("before exp");
		try {
			readPath();
		} catch (IOException e) {
			System.out.println("error 404 not found");
		}
		System.out.println("after exp");

	}

	private static void readPath() throws IOException {
		checkFile();

	}

	private static void checkFile() throws IOException {
		readFile();

	}

	private static void readFile() throws IOException {

		FileInputStream inputStream = new FileInputStream(
				"/Users/mohitmalhotra/JLG7_WKS/JLG7COREJAVA/src/edu/gyansetu/tcs/revision/oops/exceptionhandling/TestExp222.java");
		for (int i = 0; i < inputStream.available(); i++) {
			System.out.print((char) inputStream.read());
		}
		// 404 

	}

}
