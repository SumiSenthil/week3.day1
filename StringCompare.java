package week3.day1;

public class StringCompare {
		
			
		public static void main(String[] args) {
			String str= new String("Kutty");
			String str1= new String("Kutty");
			if (str.equals(str1)) {
				System.out.println("Strings are same");
				
			}
			else
			{
				System.out.println("Strings are different");
			}
			System.out.println("*************************");
			
		}
	}


/* Explanation:
==  Compares reference of strings.
equals compare data*/
