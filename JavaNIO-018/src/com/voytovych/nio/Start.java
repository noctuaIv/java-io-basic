package com.voytovych.nio;

import java.nio.ByteBuffer;

public class Start {

	public static void main(String[] args) {
		String data1 = "abcde67890";
		String data2 = "12345";
		ByteBuffer bBuffer = ByteBuffer.allocate(10);
		bBuffer.put(data1.getBytes());
		bBuffer.rewind();
		
		while (bBuffer.hasRemaining()) {
			System.out.print((char)bBuffer.get());
			if(bBuffer.position() == 5) break;
		}
		System.out.println("");
		
		bBuffer.mark();
		System.out.println((char) bBuffer.get());
		System.out.println((char) bBuffer.get());
		bBuffer.reset();
		System.out.println((char) bBuffer.get());
		

	}

}
