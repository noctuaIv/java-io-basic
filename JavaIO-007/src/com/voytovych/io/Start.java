package com.voytovych.io;

import java.io.FileReader;
import java.io.FileWriter;

public class Start {

	public static void main(String[] args) {
		String fileName = "D:\\data.txt";
		try (FileWriter fw = new FileWriter(fileName); 
			 FileReader fr = new FileReader(fileName);) {

			char c = 'a';
			String s1 = " string 1";
			String s2 = " string 2";

			fw.write(c);
			fw.write(s1);
			fw.write(s2);
			fw.flush();

			char[] chars = new char[100];
			fr.read(chars);
			System.out.println(chars);

		} catch (Exception e) {

		}

	}

}
