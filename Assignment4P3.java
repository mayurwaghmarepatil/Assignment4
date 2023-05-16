package ineuron;

public class Assignment4P3 {
	    public static class LaunchPalindrom {
	        public static void main(String[] args) {
	            
	            String s1="2552";
	            String s2="";

	            for(int i=s1.length()-1;i>=0;i--)
	            {
	                s2+=s1.charAt(i);
	            }
	            System.out.println(s2);
	            if (s1.equalsIgnoreCase(s2))
	            {
	                System.out.println("the string is palindrom");
	            }else
	            {
	                System.out.println("the string is not palindrom");
	            }
	        }
	    }

	}



