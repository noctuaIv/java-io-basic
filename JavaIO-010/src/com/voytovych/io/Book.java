package com.voytovych.io;

import java.io.Serializable;

public class Book implements Serializable{
	private int ID;
	private String name;
	private String author;
	
	public Book(int iD, String name, String author) {
		super();
		ID = iD;
		this.name = name;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return ID + " | " + name + " | " + author;
	}
}
