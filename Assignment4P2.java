package ineuron;

public class Assignment4P2 {

	public static void main(String[] args) {
		String str1="mayur go to gym";
		int count;
		char ch[]=str1.toCharArray();
		System.out.println("Duplicate character in the string are :");
		for(int i=0;i<str1.length();i++) {
			count=1;
			for(int j=i+1;j<str1.length();j++) {
				if(ch[i]==ch[j] && ch[i] !=' ') {
					count++;
					ch[j]=0;
					
				}
			}
			if(count>1 && ch[i]!=0) {
				System.out.println(ch[i]);
			}
		}
	}
}
