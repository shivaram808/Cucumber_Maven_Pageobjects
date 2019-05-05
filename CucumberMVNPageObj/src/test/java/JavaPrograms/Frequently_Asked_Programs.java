package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import org.testng.annotations.Test;
public class Frequently_Asked_Programs{

//// Number of Alphabets repeting in a word
//	//@Test
//	public void charcount()
//	{
//		String str = "Programming";
//		HashMap<Character, Integer> map = new HashMap<>();
//		for (char key : str.toCharArray()) {
//			if (map.containsKey(key)) {
//				int val = map.get(key);
//				map.put(key, val + 1);
//			} else {
//				map.put(key, 1);
//			}
//		}
//		System.out.println(map);
//	}
//	
	
//Number of words repeating in a sentence 
	
	//@Test
	public void repeted_words()
	{
		String sentence  = "This is Test Program Test Program";
		
		HashMap<String,Integer> map = new HashMap();
		
		String word[] = sentence.split(" ");
		
		for(String key: word)
		{
			if(map.containsKey(key))
			{
				int val = map.get(key);
				map.put(key,val+1);
			}
			
			else
			{
				map.put(key,1);
			}
		}
		
		System.out.println("Number of times each word repeted is : "+ map);
				
	}
	
// Program for constructing a pyramid	
	//@Test
	public void pyramidprogram()
	{
		for(int i=0;i<10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
								
			}
			System.out.println(" " );
		}
	}
	
	
// Program for pallendrome
	
	//@Test
	public void pallendrome()
	
	{
				
		StringBuffer sbf = new StringBuffer("madam");
		StringBuffer reverse = 	sbf.reverse();	
		System.out.println("reverse of :  "+sbf +" is  : "+reverse );
		if(sbf.equals(reverse))
		{
			System.out.println("This is a pallemdrome !! ");
		}
		
		else
		{
			System.out.println("This is Not  a pallemdrome !! ");
		}
				
	}
	

// Reverse of a String 
	
	//@Test
   public void stringreverse()
   {
	   String name = "Shiva";
	   
	   System.out.println("     ");
	   System.out.println("Reverse of String is :  ");
	   
	   for(int i=name.length()-1;i>=0 ;i--)
	   {
		   char rev = name.charAt(i);
		   System.out.print(rev);
		  
	   }
	   
	   System.out.println("    ");
	   System.out.println("    ");
	   
   }
	
	
// Fibonacci Series
	
	//@Test
	public void fibonacci()
	{
		int a = 1;
		int b =2;
		int c;
		
		 System.out.print(a+"   ");
		 System.out.print(b+"   ");
		 
		 
		for (int i=0; i<15;i++)
		{
			 c= a+b;
			 System.out.print(c+"   ");
			 
			 a=b;
			 b=c;
		}
	}	

// Prime numbers from 1 to 100
	//@Test	
	public void primenumber()
	{
		
		System.out.println(" Prime number are :  ");
		
		int j;
		int i;
		int rem;
		
		
		for( i=2;i<=100;i++)
		{
			int count=0;
			
			for(j=2;j<=i;j++)
			{
				rem = i%j;
				if(rem==0)
				{
					count = count+1;
				}
				
		    }
			
			if(count<2)
			{
				System.out.print(i+ " ");
		    }
	    }
	
	}

	
// Working with array list
	
	@Test
	public void arraylist()
	{
		ArrayList al = new ArrayList();
		
		al.add(20);
		al.add("shiva");
		al.add(1.25);
		
		System.out.println("values in array list are : "+al);	
		Collections.reverse(al);
		
		System.out.println("Reverse of array list : "+ al);
		
				
	}
	

	
				
	}
	
