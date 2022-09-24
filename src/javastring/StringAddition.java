package javastring;

public class StringAddition {

	public static void main(String[] args) {
		String s1= "Ashutosh";
		String s2= "Java";
		System.out.println(s1+s2+10);
		System.out.println(10+s1+s2+10);
		System.out.println(10+20+s1+s2+10+20);
		System.out.println(s1+s2+20/10);
		System.out.println(s1+s2+20*10);
		//System.out.println(s1+s2+20-10);
		System.out.println(s1.concat(s2));
		//System.out.println(String.join(null, s1,s2));
		System.out.println(String.join("-", s1,s2));
		
		String s= "This is Java";
//		System.out.println(s.subSequence(3, 9));//s is J
//		System.out.println(s.substring(3));//s is Java
//		System.out.println(s.subSequence(3, 9));//s is J
//		//System.out.println(s.subSequence(3, -1));//exception  java.lang.StringIndexOutOfBoundsException
//		System.out.println(s.subSequence(0, 0));//blank output
//		System.out.println("...");
//		
		System.out.println(s.replace("is", "was"));//Thwas was Java
		System.out.println(s.replaceFirst("is", "was"));//Thwas is Java
		System.out.println(s.replaceAll("is", "was"));//Thwas was Java
		System.out.println(s.replaceAll("is(.)", "was"));//ThwaswasJava  removed spaces
		System.out.println(s.replaceAll("is(.*)", "was"));//Thwas  this will replace all string  after 1stt regex with was

	}

}
