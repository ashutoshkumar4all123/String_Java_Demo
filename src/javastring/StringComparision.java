package javastring;

public class StringComparision {

	public static void main(String[] args) {
		String s1= "Ashutosh";
		String s2= "ashuTosh";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		if(s1.equals("")) {
			System.out.println("name can not be empty");
		}else {
			System.out.println("Valid");
		}
		
		System.out.println(s1.compareTo(s2));
		
		String s3= "ab";
		String s4= "Ac";
		System.out.println(s3.compareToIgnoreCase(s4));
		System.out.println(20+10+s3+s4+10+20);
		System.out.println(String.join(" ", s3,s4));
	}

}
