package com.filehandling;

import java.io.*;
import java.text.SimpleDateFormat;

public class FileHandling2 {
	
	public static void main(String[] args) {
		listFilesForFolder(new File("d:/Setups"));
	}
	
	public static void listFilesForFolder(File folder) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    for (File file : folder.listFiles()) {
	        	System.out.println("Name: "+ file.getName());
	        	System.out.println("Size: "+ file.length()/(1024*1024)+" MB");
	        	System.out.println("Last modified: "+ sdf.format(file.lastModified()));
	        	System.out.println("File permissions: "+ (file.canRead()?"Read":"") + (file.canWrite()?", Write":"") + (file.canExecute()?", Execute":""));
	        	System.out.println("File/Directory: "+(file.isFile()?"File":"Directory"));
	        	System.out.println("");
	    }
	}
	
}
