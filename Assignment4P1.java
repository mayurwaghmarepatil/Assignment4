package ineuron;

import java.util.Scanner;

public class Assignment4P1 {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("use please enter the string");
		String str=sc1.next();
		
		StringBuilder sb1=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int idx=str.indexOf(ch, i+1);
			if(idx==-1)
			{
				sb1.append(ch);
			}
		}
          System.out.println(sb1);
	}
}
