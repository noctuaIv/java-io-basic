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
			fc.read(bBuffer);
//			System.out.println(new String(bBuffer.array()));
			bBuffer.flip();
			while (bBuffer.hasRemaining()) {
				System.out.println((char)bBuffer.get());
				
			}
			
			
		} catch (Exception e) {
			
		}

	}

}
