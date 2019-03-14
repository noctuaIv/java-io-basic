package com.voytovych.io;

import java.io.RandomAccessFile;

public class Start {

	public static void main(String[] args) {
		String fileName = "D:\\data.txt";
		try {
			RandomAccessFile raf = new RandomAccessFile(fileName, "rw");

			char c = 'A';
			String str = "string with binary in it";
			int i = 5;
			double d = 3.5;

			raf.write(c);
			raf.writeUTF(str);
			raf.writeInt(i);
			raf.writeDouble(d);
			
			raf.seek(0);
			
			System.out.println(raf.readChar());
			System.out.println(raf.readUTF());
			System.out.println(raf.readInt());
			System.out.println(raf.readDouble());
			
			raf.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}