package com.voytovych.io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Start {

	public static void main(String[] args) {
		String fileName = "D:\\data.txt";
		try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {
			raf.seek(0);
			System.out.println(raf.readLine());
			
			raf.seek(0);
			int c;
			while ((c = raf.read()) != -1) {
				System.out.println((char)c);
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
