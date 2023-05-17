package ineuron;

import java.util.Scanner;

public class Assignment4P6 {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("user please enter the String value");
		String s1=sc1.next();
		
		String s2="";
		int len=s1.length();
		
		for(int i=len-1;i>=0;i--)
		{
			s2+=s1.charAt(i);
		}
		System.out.println(s2);
		
		if(s1.equals(s2))
		{
			System.out.println("The String is palindrome");
		}else
		{
			System.out.println("The string is not palindrome");
		}
			

	}

}

