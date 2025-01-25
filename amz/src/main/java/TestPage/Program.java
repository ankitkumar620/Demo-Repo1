package TestPage;

import java.util.*;
import java.util.regex.*;


public class Program {

	
	public static void main(String args[])
	{
		String str = "Location \"Welcome  to india\" Bangalore   Channai IT city \"second\" Mysore";

	//List<String> list = new ArrayList<String>();
	
	Pattern p=Pattern.compile("([^\"]\\S*|\".+?\")\\s*");
	
	//String s[]=p.split(str);
	Matcher m = p.matcher(str);
	while (m.find())
		System.out.println(m.group());
	    //list.add(m.group(1)); // Add .replace("\"", "") to remove surrounding quotes.
	/*System.out.println(list);
	String s[]= new String[list.size()];
	for(String st:list)
	{
		System.out.println(st);
	}*/
		
	
		
	}
}
