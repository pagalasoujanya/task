package com.wordcount.filereader;

import java.util.List;
import java.util.Map;

import com.filereader.IUserFileReader;
import com.filereader.UserFileReader;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple UserFileReaderServicesTest
 */
public class UserFileReaderServicesTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public UserFileReaderServicesTest( String  filePath)
    {
    	String filePath1 = "/home/polmon/Documents/workspace-sts-3.8.2.RELEASE/filereader/src/main/java/com/wordcount/filereader/Soujanya";
    	IUserFileReader userFileReader = new UserFileReader();
    	
    	Map<Integer, String> readMap = userFileReader.readFileAsMap(filePath1);
		List<String> readList = userFileReader.readFileAsList(filePath1);
    	
		for (Integer lineNumber : readMap.keySet()) {
			System.out.println(lineNumber+". "+readMap.get(lineNumber));
		}
		
		for (String lineData : readList) {
			System.out.println(lineData);
		}
        super(filePath1);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( UserFileReaderServicesTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
