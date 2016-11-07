package com.wordcount.filereader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.filereader.IUserFileReader;
import com.filereader.UserFileReader;

public class UserFileReaderServices {
	
	public static void main(String args[]) throws IOException {

		/* file path, change this your required filePath */
		String filePath = "/home/polmon/Documents/workspace-sts-3.8.2.RELEASE/filereader/src/main/java/com/wordcount/filereader/Soujanya";
		
		IUserFileReader userFileReader = new UserFileReader();
		
		/* 
		 * Reading using Map and List 
		 * */
		Map<Integer, String> readMap = userFileReader.readFileAsMap(filePath);
		List<String> readList = userFileReader.readFileAsList(filePath);
		
		
		System.out.println("Printing from HashMap : \n");
		for (Integer lineNumber : readMap.keySet()) {
			System.out.println(lineNumber+". "+readMap.get(lineNumber));
		}
		
		System.out.println("\nPrinting from List : \n");
		for (String lineData : readList) {
			System.out.println(lineData);
		}
	}
}