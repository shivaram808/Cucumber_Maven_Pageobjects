package JavaPrograms;

import java.util.HashMap;

import org.testng.annotations.Test;
public class Frequently_Asked_Programs{

// Number of Alphabets repeting in a word
	//@Test
	public void charcount()
	{
		String str = "Programming";
		HashMap<Character, Integer> map = new HashMap<>();
		for (char key : str.toCharArray()) {
			if (map.containsKey(key)) {
				int val = map.get(key);
				map.put(key, val + 1);
			} else {
				map.put(key, 1);
			}
		}
		System.out.println(map);
	}
	
	
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
	
	@Test
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
	
	
	
	
}