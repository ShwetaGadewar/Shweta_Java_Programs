package assignments;

import java.util.Arrays;

public class Assignment75CheckTheArray 
{

	public static void main(String[] args)
	{
	String input1="ram";
	String input2="arm";
	if(input1.length()!=input2.length())
	{
		System.out.println("They are not anagram");
	}
	else
	{
	char[] c1=			input1.toCharArray();
	char[] c2=			input2.toCharArray();
	System.out.println("Before Sorting->");

	System.out.println(Arrays.toString(c1));
	System.out.println(Arrays.toString(c2));
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	System.out.println("After Sorting->");
	System.out.println(Arrays.toString(c1));
	System.out.println(Arrays.toString(c2));
	
	if(	Arrays.equals(c1, c2)==true)
	{
		System.out.println("They are anagram");
	}
	else
	{
		System.out.println("They are not anagram");
	}
	

	}
	}
}
