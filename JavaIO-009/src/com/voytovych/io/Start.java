package com.voytovych.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Start {
	public static void main(String[] args) {
		String fileName = "D:\\data.txt";
		try (FileWriter fw = new FileWriter(fileName, true);
			 FileReader fr = new FileReader(fileName);
			 BufferedReader br = new BufferedReader(fr);
			 PrintWriter pw = new PrintWriter(fw);	) {
			
			String line1 = "This is line 1";
			String line2 = "This is line 2";
			String line3 = "This is line 3";
			
			pw.println(line1);
			pw.println(line2);
			pw.println(line3);
			pw.flush();
			
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				
			}
			
		} catch (Exception e) {
			
		}
	}
}
