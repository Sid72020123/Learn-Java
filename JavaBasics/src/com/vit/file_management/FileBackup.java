package com.vit.file_management;

import java.io.*;

public class FileBackup {
	public static void main(String[] args) {

		String sourceFile = "source.txt";
		String backupFile = "backup.txt";

		try {
			FileInputStream fin = new FileInputStream(sourceFile);
			FileOutputStream fout = new FileOutputStream(backupFile);

			int data;

			while ((data = fin.read()) != -1) {
				fout.write(data);
			}

			fin.close();
			fout.close();

			System.out.println("File backup completed successfully!");
			System.out.println("Source File: " + sourceFile);
			System.out.println("Backup File: " + backupFile);

		} catch (IOException e) {
			System.out.println("Error during file backup: " + e.getMessage());
		}
	}
}
