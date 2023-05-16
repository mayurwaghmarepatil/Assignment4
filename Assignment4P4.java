package ineuron;

import java.util.Scanner;

//to count the number of consonant ,vowels and special character
public class Assignment4P4 {

	public static void main(String[] args) {
		int con=0;
		int vow = 0;
		int spc=0;
		Scanner sc2=new Scanner(System.in);
		System.out.println("user please enter the string which is having not numbers and space");
		String strr=sc2.next();
		
		strr=strr.toLowerCase();
		
		for(int i=0;i<strr.length();i++)
		{
			char ch= strr.charAt(i);
			if(ch>='a' && ch <='z')
			{
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					vow++;
					con++;
				}else {
					con++;
				}
			}
			else
			{
				spc++;
			}
		}System.out.println("the number of consonant present in the string is  "+con);
		System.out.println("the number of vowels present in the string "+vow);
		System.out.println("the number of special character present in the string is "+spc);

	}

}
