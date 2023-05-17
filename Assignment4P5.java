package ineuron;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment4P5 {

	public static void main(String[] args) {
		System.out.println("user please enter 1st input");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		System.out.println("user please enter 2nd input");
		Scanner sc1=new Scanner(System.in);
		String s2=sc1.nextLine();
		
		//String s1="a man";
		//String s2="am an";
		
		String s3=s1.replace(" ","");
		String s4=s2.replace(" ","");
		
		//s1=s1.toLowerCase();
		//s2=s2.toLowerCase();
		
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='A'&& s1.charAt(i)<='Z')
			{
			s3+=(char)(s1.charAt(i)+32);
		}
		}
		
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(i)>='A'&& s2.charAt(i)<='Z')
			{
			s4+=(char)(s2.charAt(i)+32);
		}
		}

		
		//Arrays.sort(ch1);
		//Arrays.sort(ch2);
		
		char[] arr=s3.toCharArray();
		char[] arr2=s4.toCharArray();
		char temp;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr2.length;i++) {
			for(int j=i+1;j<arr2.length;j++) {
				if(arr2[i]>arr2[j])
				{
					temp=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=temp;
				}
			}
		}
		
		if(Arrays.equals(arr, arr2))
		{
			System.out.println("Its Anagram");
		}else
		{
			System.out.println("Its not Anagram");
		}

	}

}
