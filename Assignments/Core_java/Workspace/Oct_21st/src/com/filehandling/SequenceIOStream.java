package com.filehandling;

import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceIOStream {

	public static void main(String[] args) throws IOException {
		readFiles();
	}

	private static void readFiles() throws IOException {
		Vector<FileInputStream> fis = new Vector<>();
		fis.add(new FileInputStream(new File("abc.txt")));
		fis.add(new FileInputStream(new File("def.txt")));
		fis.add(new FileInputStream(new File("pqr.txt")));
		SequenceInputStream sis = new SequenceInputStream(fis.elements());
		int i = 0;
		while((i=sis.read())!=-1)
			System.out.print((char)i);
		sis.close();
	}

}
