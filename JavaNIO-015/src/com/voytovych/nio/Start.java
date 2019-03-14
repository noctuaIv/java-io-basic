package com.voytovych.nio;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Start {
	public static void main(String[] args) {
		String fileName = "D:\\data.txt";
		try (FileInputStream fis = new FileInputStream(fileName);
			 FileChannel fc = fis.getChannel()) {
			
			ByteBuffer bBuffer = ByteBuffer.allocate(fis.available());
			System.out.println("Before rewind");
			System.out.println("Capacity: " + bBuffer.capacity());
			System.out.println("Position: " + bBuffer.position());
			System.out.println("Limit: " + bBuffer.limit());
			System.out.println();
			
			fc.read(bBuffer);
			
			bBuffer.position(5);
			bBuffer.flip();
			
//			bBuffer.rewind();
			System.out.println("After rewind");
			System.out.println("Capacity: " + bBuffer.capacity());
			System.out.println("Position: " + bBuffer.position());
			System.out.println("Limit: " + bBuffer.limit());
			
			while (bBuffer.hasRemaining()) {
				System.out.print((char)bBuffer.get());
			}
			System.out.println("");
		} catch (Exception e) {
			
		}

	}
}
