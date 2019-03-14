package com.voytovych.nio;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Start {

	public static void main(String[] args) {
		String fileName = "D:\\data.txt";
		String digits = "12345";
		String letters = "abcde";
		
		try (FileOutputStream fos = new FileOutputStream(fileName);
			 FileChannel fc = fos.getChannel()) {
			
			ByteBuffer digitBuffer = ByteBuffer.allocate(5);
			digitBuffer.put(digits.getBytes());
			
			ByteBuffer letterBuffer = ByteBuffer.allocate(5);
			letterBuffer.put(letters.getBytes());
			
			ByteBuffer[] gatheringWrite = {digitBuffer, letterBuffer};
			
			digitBuffer.flip();
			letterBuffer.flip();
			fc.write(gatheringWrite);
			
		} catch (Exception e) {
			
		}

	}

}
