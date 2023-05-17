package ineuron;

public class Assignment4P8 {

	public static void main(String[] args) {
		String s="aaaabbccc";
		
		int[] arr1=new int[127];
		
		for(int i=0;i<s.length();i++) {
			arr1[s.charAt(i)]=arr1[s.charAt(i)]+1;
		}
		int max=-1;
		char c=' ';
		
		for(int i=0;i<s.length();i++)
		{
			if(max<arr1[s.charAt(i)])
			{
				max=arr1[s.charAt(i)];
				c=s.charAt(i);
			}
		}
		System.out.println("maximum repeated character is "+c);

	}

}
