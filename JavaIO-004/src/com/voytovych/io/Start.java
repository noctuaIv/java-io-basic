package com.voytovych.io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Start {
	public static void main(String[] args) {
		String fileName = "D:\\data.txt";
		String data = "World";
		int BLANK = 32;
		try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {
			raf.seek(raf.length());
			raf.write(BLANK);
			raf.writeBytes(data);
			
			raf.seek(6);
			String remain = raf.readLine();
			raf.seek(6);
			raf.writeBytes("The");
			raf.writeByte(BLANK);
			raf.writeBytes(remain);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
