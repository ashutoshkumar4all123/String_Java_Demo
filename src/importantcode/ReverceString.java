package importantcode;

import java.util.Scanner;

public class ReverceString {

	public static void main(String[] args) {
		String s= "madam";
		String rev ="";
		for(int i=s.length()-1; i>=0; i--) {
			rev= rev+s.charAt(i);
		}
		if (s.equals(rev)) {
			System.out.println("Palendrome String");
		}else {
			System.out.println("Not a Palendrome String");
		}
		
//		Scanner sc = new Scanner(System.in) ;
//		String str= sc.nextLine();
//		StringBuilder sb = new StringBuilder();
//		for(int i= str.length()-1; i>=0; i--) {
//			sb.append(str.charAt(i));
//			
//		}
//		System.out.println(sb);
		
//		String s1= "nikhil";
//		StringBuilder sb1=new StringBuilder(s1);
//		System.out.println(sb1.reverse());

	}

}
