package ineuron;

import java.util.Scanner;

public class Assignment4P7 {

	public static void main(String[] args) {
		System.out.println("User please enter the string");
		Scanner sc2=new Scanner(System.in);
		String s=sc2.next();
		s=s.toLowerCase();
		int len=s.length();
		int count=0;
		
		for(int i=0;i<s.length()-1;i++) {
			char ch=s.charAt(i);
			
			for(int j=i+1;j<len;j++) {
				char ch1=s.charAt(j);
				if(ch==ch1)
				{
				    count++;
					break;
				}
			}
		}
		if(count>=1)
		{
			System.out.println("it is not a unique string");
		}else
		{
			System.out.println("it is a unique string");
		}

	}

}
