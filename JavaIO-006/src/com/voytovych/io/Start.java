package com.voytovych.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Start {
	public static void main(String[] args) {
		String fileName = "D:\\data.txt";
		try (FileOutputStream fos = new FileOutputStream(fileName);
			 DataOutputStream dos = new DataOutputStream(fos);
			 FileInputStream fis = new FileInputStream(fileName);
			 DataInputStream dis = new DataInputStream(fis);) {
			
			int i = 5;
			char c = 'a';
			double d = 5.5;
			String s = "string data";
			
			dos.writeInt(i);
			dos.writeChar(c);
			dos.writeDouble(d);
			dos.writeUTF(s);
			
			System.out.println("Int: " + dis.readInt());
			System.out.println("Int: " + dis.readChar());
			System.out.println("Double: " + dis.readDouble());
			System.out.println("String: " + dis.readUTF());
			
		} catch (Exception e) {
			
		}
	}
}
