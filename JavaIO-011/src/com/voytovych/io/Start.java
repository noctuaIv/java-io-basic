package com.voytovych.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {
		String fileName = "D:\\data.data";
		try (FileInputStream fis = new FileInputStream(fileName);
			 FileOutputStream fos = new FileOutputStream(fileName);
			 ObjectOutputStream oos = new ObjectOutputStream(fos);
			 ObjectInputStream ois = new ObjectInputStream(fis);) {
			
			Book b1 = new Book(111, "Java 1", "James");
			Book b2 = new Book(222, "Java 2", "James");
			Book b3 = new Book(333, "Java 3", "James");
			
			ArrayList list = new ArrayList();
			list.add(b1);
			list.add(b2);
			list.add(b3);  
			
			oos.writeObject(list);
			
			List bookList = (List)ois.readObject();
			for (Object o : bookList) {
				Book book = (Book)o;
				System.out.println(book);
			}
			
		} catch (Exception e) {
			
		}

	}

}
