package com.voytovych.nio;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Start {

	public static void main(String[] args) {
		String fileName = "D:\\data.txt";
		String data = "This is a text\n";
		try (FileOutputStream fos = new FileOutputStream(fileName);
			 FileChannel fc = fos.getChannel()	) {
			
			ByteBuffer bBuffer = ByteBuffer.allocate(1024);
			bBuffer.put(data.getBytes());
			bBuffer.flip();
			fc.write(bBuffer);
			bBuffer.rewind(); 
			fc.write(bBuffer);
			
		} catch (Exception e) {
			
		}

	}

}
