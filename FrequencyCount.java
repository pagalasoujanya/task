import java.io.*;
import java.util.*;
class FrequencyCount
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text;
		System.out.println("Enter a text\n");
		text = br.readLine();
		StringTokenizer st = new StringTokenizer(text);
		String str;
		System.out.println("Enter a string");
		str = br.readLine();
		int count = 0;
		while(st.hasMoreTokens())
		{
			String w = st.nextToken();
			if(w.equals(str))
			{
				count++;
			}
			System.out.println(count);
		}
	}
}
