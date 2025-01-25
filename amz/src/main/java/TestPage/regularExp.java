package TestPage;

import java.util.regex.*;

public class regularExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Pattern.matches(
	            "geek*s", "geekss"));
		
		
		
		Pattern pattern = Pattern.compile(
	            "ge*", Pattern.CASE_INSENSITIVE);
		 
        // Search above pattern in "geeksforgeeks.org"
        Matcher m = pattern.matcher("geeksforGeeks.org");
 
        // Finding string using find() method
        while (m.find())
 
            // Print starting and ending indexes
            // of the pattern in the text
            // using this functionality of this class
            System.out.println("Pattern found from "
                               + m.start() + " to "
                               + (m.end() - 1));
        
        
        
        
        
        
        String text = "geeks1for2geeks3";
        
        // Specifies the string pattern
        // which is to be searched
        String delimiter = "\\d";
        Pattern pat = Pattern.compile(
            delimiter, Pattern.CASE_INSENSITIVE);
 
        // Used to perform case insensitive search of the
        // string
        String[] result = pat.split(text);
 
        // Iterating using for each loop
        for (String temp : result)
            System.out.println(temp);

	}

}
