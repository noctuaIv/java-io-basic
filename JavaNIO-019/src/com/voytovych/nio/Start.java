package com.voytovych.nio;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Start {

	public static void main(String[] args) {
		String fileName = "D:\\data.txt";
		try (FileInputStream fis = new FileInputStream(fileName);
			 FileChannel fc = fis.getChannel()) {
			
			ByteBuffer digits = ByteBuffer.allocate(5);
			ByteBuffer letters = ByteBuffer.allocate(5);
			
			ByteBuffer[] scatteringRead = {digits, letters};
			
			fc.read(scatteringRead);
			
			System.out.println("--Read Digits--");
			digits.flip();
			while (digits.hasRemaining()) {
				System.out.print((char)digits.get());
			}
			System.out.println();
			
			System.out.println("--Read Letters--");
			letters.flip();
			while (letters.hasRemaining()) {
				System.out.print((char)letters.get());
			}
			System.out.println();
			
		} catch (Exception e) {
			
		}

	}

}
