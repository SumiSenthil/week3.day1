package week3.day1;

public class StringCompare1 {	
	

	public static void main(String[] args) {
		
		String str="I am Learning Java";
		String str1="I am learning Java";
		
				//==Operator
		if (str==str1) {			
			System.out.println("Strings are matching");
		}
		else
		{
			System.out.println("Strings are not matching");
			
		}
		
		//compare by equals
		 if (str.equals(str1)) {
			
			System.out.println("Strings are matching");
		 }
		 else
		 {
			System.out.println("Strings are not matching");
		}
		
		//compare by equalsIgnorecase
	
		 if (str.equalsIgnoreCase (str1)) {			
			System.out.println("Strings are matching");
		 }
		 else
		 {
			System.out.println("Strings are not matching");
			
		}
		
		
		}
	}


