package getRequest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


public class TestCase1 implements Runnable {
	
	public void run()
	{
		
	}
public void add(String... arg)

{ }
	//int sum =Integer.parseInt(a)+Integer.parseInt(b);
	//System.out.println("Sum is: "+sum);
	/*try {
	System.out.println(10/1);
	String s2="abc";
	System.out.println(s2.charAt(10));
	}catch(ArithmeticException ex)
	{
		ex.printStackTrace();
		
	}catch(ArrayIndexOutOfBoundsException ex)
	{
		ex.printStackTrace();
		
	}catch(Exception ex)
	{
		ex.printStackTrace();
		
	}
	
}
	public static void main(String[] args) {
String s1="1";int i1=4;
String s2= "2"; String s3="3";
TestCase1 t= new TestCase1();
t.add(s1,s2);
s1=null;
Collection c1;//interface
Collections c2;//class		


HashMap<Character,Integer>hmap= new HashMap<Character,Integer>();
*/
	public static void main(String[] args)
	{
	int a[]= new int[]{0,1,5,0,2};
	String s[]= {"Str","Abc","sdf"};
	List<String> slist = Arrays.asList(s);
	System.out.println("Initial ArrayList " + slist);
	List<Integer> lstt = Arrays.asList(0,1,5,0,2);
	List<Object> lst =  Arrays.stream(a).boxed().collect(Collectors.toList());
	
	
	for(int i=0;i<lst.size();i++)
	{
	if(lst.contains(0))
	{
		int k=lst.indexOf(0);
		lst.remove(k);
		lst.add(0);
	}
	}
	
	System.out.println(lst);
	Collections.sort(lstt);
	System.out.println(lstt);
	
	

	}

}
