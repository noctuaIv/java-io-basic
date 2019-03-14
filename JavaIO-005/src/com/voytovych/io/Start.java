package com.voytovych.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Start {

	public static void main(String[] args) {
		String fileName = "D:\\data.txt";
		
		try (FileOutputStream output = new FileOutputStream(fileName);
			 FileInputStream input = new FileInputStream(fileName);	) {
			
			int i = 5;
			char c = 'a';
			String s = "string data";
			
			output.write(i);
			output.write(c);
			output.write(s.getBytes());
			
			byte[] bytes = new byte[1];
			input.read(bytes);
			System.out.println("int: " + bytes[0]);
			
			input.read(bytes);
			System.out.println("Character code: " + bytes[0]);
			System.out.println("Character: " + new String(bytes));
			
			bytes = new byte[s.length()];
			input.read(bytes);
			System.out.println("String: " + new String(bytes));
			
		} catch (Exception e) {
			
		}
	}

}
