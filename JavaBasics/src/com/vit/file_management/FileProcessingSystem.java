package com.vit.file_management;

import java.io.*;

public class FileProcessingSystem {

	static void readFile(String fileName) throws IOException {
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);

		try {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} finally {
			br.close();
		}
	}

	public static void main(String[] args) {

		String[] files = { "file1.txt", "file2.txt", "file3.txt" };

		for (String file : files) {
			System.out.println("\nReading: " + file);

			try {
				try {
					readFile(file);
				} catch (IOException e) {
					System.out.println("Error reading " + file);
					throw e;
				}
			} catch (IOException e) {
				System.out.println("Exception propagated to main: " + e.getMessage());
			}
		}

		System.out.println("\nFile processing completed.");
	}
}