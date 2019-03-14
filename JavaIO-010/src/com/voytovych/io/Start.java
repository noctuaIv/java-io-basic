package com.voytovych.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Start {

	public static void main(String[] args) {
		String fileName = "D:\\data.data";
		try (FileInputStream fis = new FileInputStream(fileName);
			 FileOutputStream fos = new FileOutputStream(fileName);
			 ObjectOutputStream oos = new ObjectOutputStream(fos);
			 ObjectInputStream ois = new ObjectInputStream(fis);) {
			
			Book b1 = new Book(111, "Java 1", "James");
			oos.writeObject(b1);
			
			Object bookObj = ois.readObject();
			Book book = (Book)bookObj;
			System.out.println(book);
			
		} catch (Exception e) {
			
		}
	}

}
