package AnagaramPrg;

import java.util.ArrayList;
import java.util.Arrays;
//This program for the given set of words, forms a ArrayList ,takes the first element and compares with the rest for anagram.
//if anagram pair is found, adds the same to the AnagramList and removes from the original list too avoid comparison in the next iteration.This will be repeated 
//till there are only two elements left in the original list which are not anagrams.
public class Anagram {

	public static void main(String[] args) {
		// Create an Array list of the word given
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("listen");
		str.add("pot"); // part, opt, trap, silent, top, this, hello, hits, what, shit"
		str.add("part");
		str.add("opt");
		str.add("trap");
		str.add("silent");
		str.add("top");
		str.add("this");
		str.add("hello");
		str.add("hits"); str.add("what"); str.add("shit");
		  
		
		do
		{
			
			int flag =0;
			String First= str.get(0);
			ArrayList<String> anagramList = new ArrayList<String>();//Define anagram list using ArrayList
				for (int k= 1; k<str.size(); k++)
				{
			
					String Next = str.get(k);
					if (First.length()== Next.length())
					{
				
						boolean isAnagram = AnagramCheck(First,Next);
						if (isAnagram)
						{
							anagramList.add(Next);//add to the list of anagram .
							str.remove(Next);// remove the anagram pair of first element from the original list
							flag =1;
						}
					}
		
		
				}
		
			if(flag==1)//if first string is having anagrams in the list, remove the first from the original list
			{
				anagramList.add(First);// add first to the anagram list
				str.remove(First);//remove first from the original list
				System.out.println("Anagram list is" +anagramList);
		
				System.out.println("Original list without Anagram word " +str );
					}	
		}
		while ((str.size()>2));//check whether there are only two elements in the list to check for anagram and or not anagram
		
			
			
		}
		

	



static boolean AnagramCheck(String s1,String s2)
{
	//Changing the case of characters of both s1 and s2 and converting them to char array
	 
    char[] s1Array = s1.toLowerCase().toCharArray();

    char[] s2Array = s2.toLowerCase().toCharArray();

    //Sorting both s1Array and s2Array

    Arrays.sort(s1Array);

    Arrays.sort(s2Array);

    //Checking whether s1Array and s2Array are equal

    if( Arrays.equals(s1Array, s2Array)) return true;
    else return false;
}
}


