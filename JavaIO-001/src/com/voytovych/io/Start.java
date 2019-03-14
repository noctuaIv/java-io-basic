package com.voytovych.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Start {

	public static void main(String[] args) {
		// String path = "./data.txt";
		// File file = new File(path);
		// System.out.println(file.getAbsolutePath());
		// try {
		// System.out.println(file.getCanonicalPath());
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// String fileName = "D:\\data.txt";
		String fileName = "D:\\";

		File file = new File(fileName);
		System.out.println("File/Directory Name: " + file.getName());
		System.out.println("Parent Name: " + file.getParent());
		System.out.println("Can read? " + file.canRead());
		System.out.println("Can write? " + file.canWrite());
		System.out.println("Existed? " + file.exists());
		if (file.exists()) {
			System.out.println("deleted? " + file.delete());
		}
		if (!file.exists()) {
			try {
				System.out.println("Created? " + file.createNewFile());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("isFile: " + file.isFile());
		System.out.println("isDirectory: " + file.isDirectory());
		System.out.println("Last modified: " + new Date(file.lastModified()));

		File fileList[] = file.listFiles();
		for (int i = 0; i < fileList.length; i++) {
			File fileObj = fileList[i];
			if (fileObj.isFile()) {
				try {
					System.out.println("Files: " + fileObj.getCanonicalPath());
				} catch (IOException e) {
					e.printStackTrace();
				}

			} else if (fileObj.isDirectory()) {
				try {
					System.out.println("Directories: " + fileObj.getCanonicalPath());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}