package com.filehandling;

import java.io.*;

public class FileHandling1 {

	public static void main(String[] args) throws IOException {
		writeFile();
//		readFile();
		readAndWriteFile();
	}

	private static void readAndWriteFile() throws IOException {
		File file1 = new File("abc.txt");
		File file2 = new File("pqr.txt");
		FileInputStream fis = new FileInputStream(file1);
		FileOutputStream fos = new FileOutputStream(file2);
		int i = 0;
		while((i=fis.read())!=-1)
			fos.write(i);
		fis.close();
		fos.flush();
		fos.close();
	}

//	private static void readFile() throws IOException {
//		File file = new File("abc.txt");
//		FileInputStream fis = new FileInputStream(file);
//		int i = 0;
//		while((i=fis.read())!=-1)
//			System.out.print((char)i);
//		fis.close();
//	}

	private static void writeFile() throws IOException {
		File file = new File("abc.txt");
		FileOutputStream fos = new FileOutputStream(file);
		fos.write("Hello World".getBytes());
		fos.flush();
		fos.close();
	}

}
