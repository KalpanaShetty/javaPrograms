package group3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class PositionOfCharInString2 {

	public static void main(String[] args) {
		String s ="Tester";
		s=s.toLowerCase();
		
//LinkedHashSet<Character> set = new LinkedHashSet<Character>();
ArrayList<Character> set = new ArrayList<Character>();	
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		
		for (Character ch : set) 
		{
			
			
			
			for (int i = 0; i < s.length(); i++) {
				if (ch==s.charAt(i))
				{
					System.out.println(ch+" "+(i+1)); 
					break;
				}
			}
			
			
			/*for (int i = s.length()-1; i >=0; i--)
			{
				if (ch==s.charAt(i))
				{
					System.out.println(ch+" "+(i+1)); 
					break;
				}
				
			}*/
			
			//Test
			
		}
	}

}
