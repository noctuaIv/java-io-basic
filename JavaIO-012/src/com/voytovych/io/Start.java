package com.voytovych.io;

import java.io.*;
import java.util.*;

public class Start {

	public static void main(String[] args) {
		String fileName = "D:\\data.txt";
		
		try {
			File file = new File(fileName);
			Scanner sc = new Scanner(file);
			sc.useDelimiter("line");
			
			while (sc.hasNext()) {
//				System.out.println(sc.nextLine());
				System.out.println(sc.next());
				
			}
		} catch (Exception e) {
			
		}
		
	}

}
