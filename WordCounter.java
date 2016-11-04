import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class WordCounter 
{
	public static void main(String args[]) throws Exception 
	{
	try 
	{
	BufferedReader br = new BufferedReader (new FileReader ("1.txt"));
	String line = null;
	int linecount = 0;
	String searchFor = "polmon";
	int searchLength=searchFor.length();
	String thisLine;
	int searchCount = 0;
	while ((line = br.readLine()) != null) 
	{
		linecount++;
		for(int searchIndex=0;searchIndex<line.length();) 
		{
			int index=line.indexOf(searchFor,searchIndex);
			if(index!=-1) 
			{
			System.out.println("Line number " + linecount);
			searchCount++;
			searchIndex+=index+searchLength;
			} 
			else { break; }
		}
	}
	System.out.println("SearchCount = "+searchCount);
	} 
	catch(Exception e) 
	{ System.out.println(e); }
	}
}
