package com.vit.file_management;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fileName = "test.txt";

		try {
			FileWriter writer = new FileWriter(fileName);
			System.out.println("=== *** Simple Text Editor *** ===\n");

			while (true) {
				System.out.print("Enter text (enter END to exit): ");
				String line = sc.nextLine();
				if (line.equalsIgnoreCase("END")) {
					break;
				}
				writer.write(line);
				writer.write(System.lineSeparator());
			}

			writer.close();
			
			System.out.println("\n[*] Text File Saved Succesfully to " + fileName);
			
			FileReader reader = new FileReader(fileName);
			System.out.println("\n[*] Contents of the file " + fileName + ":\n");
			
			int character;
			while ((character = reader.read()) != -1) {
				System.out.print((char) character);
			}
			
			reader.close();
		}

		catch (IOException e) {
			System.out.println("Error occurred while reading / writing the file: " + e.getMessage());
		}
		sc.close();
	}

}