package com.voytovych.nio;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class Start {

	public static void main(String[] args) {
		String source = "D:\\source.txt";
		String destination = "D:\\destination.txt";
		try (RandomAccessFile sourceFile = new RandomAccessFile(source, "rw");
			 FileChannel sourceChannel = sourceFile.getChannel();
			 RandomAccessFile destinationFile = new RandomAccessFile(destination, "rw");
			 FileChannel destinationChannel = destinationFile.getChannel()) {
			 
//			destinationChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
			sourceChannel.transferTo(0, sourceChannel.size(), destinationChannel);
			System.out.println("Done transferring");
			
		} catch (Exception e) {
			
		}
	}

}
