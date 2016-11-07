package com.filereader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface IUserFileReader {
	
	/**
 	 * This method reads the given file and constructs a Map from 
 	 * line number to the fetched line.
	 * 
	 * @param filePath - complete path of the file
	 * @return A Map from Integer to String
	 * @throws IOException If the named file does not exist, is a directory 
	 * rather than a regular file, or for some other reason cannot be opened for reading
	 */
	public Map<Integer, String> readFileAsMap(String filePath) throws IOException;
	
	/**
	 * This method reads the given file and returns a list of string. 
	 * Here each element in the list represent a Line that has been read.
	 * 
 	 * @param filePath - complete path of the file
	 * @return a list of String
	 * @throws IOException If the named file does not exist, is a directory 
	 * rather than a regular file, or for some other reason cannot be opened for reading
	 */	
	public List<String> readFileAsList(String filePath) throws IOException;
}