package com.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.filereader.IUserFileReader;

public class UserFileReader implements IUserFileReader{

	public Map<Integer, String> readFileAsMap(String filePath)throws IOException {
		
		/* Map to be returned finally */
		Map<Integer, String> resultMap = new HashMap<Integer, String>();
		
		/* open the file for reading */
		BufferedReader bufferedInput = new BufferedReader(new FileReader(filePath));

		/*
		 * read each line from file and add it to Map.
		 * Increment the lineNumber count after reading each line.
		 */
		String inputLine;
		Integer lineNumber = 1;
		while ((inputLine = bufferedInput.readLine()) != null) {
			resultMap.put(lineNumber, inputLine);
			lineNumber++;
		}
		
		bufferedInput.close();
		return resultMap;
	}

	public List<String> readFileAsList(String filePath)throws IOException {
		
		/* Map to be returned finally */
		List<String> resultList = new ArrayList<String>();
		
		/* open the file for reading */
		BufferedReader bufferedInput = new BufferedReader(new FileReader(filePath));

		/*
		 * read each line from file and add it to the List.
		 */
		String inputLine;
		while ((inputLine = bufferedInput.readLine()) != null) {
			resultList.add(inputLine);
		}
		bufferedInput.close();
		return resultList;
	}
}
