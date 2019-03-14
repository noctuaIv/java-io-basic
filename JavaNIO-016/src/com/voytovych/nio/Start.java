package com.voytovych.nio;

import java.nio.ByteBuffer;

public class Start {

	public static void main(String[] args) {
		String data1 = "abcde6789";
		String data2 = "12345";
		ByteBuffer bBuffer = ByteBuffer.allocate(10);
		bBuffer.put(data1.getBytes());
		bBuffer.rewind();
		
		while (bBuffer.hasRemaining()) {
			System.out.print((char)bBuffer.get());
		}
		System.out.println("");
		
//		bBuffer.position(4); 
//		bBuffer.flip(); // limit = 4
		bBuffer.clear(); // First, it resets the position to 0. Second, it sets the position to the capacity, which is 10
		bBuffer.put(data2.getBytes());
		System.out.println("--Latest Data In Buffer--");
		bBuffer.rewind();
		while (bBuffer.hasRemaining()) {
			System.out.print((char)bBuffer.get());
		}
		System.out.println("");
	}

}
