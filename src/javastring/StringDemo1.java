package javastring;

public class StringDemo1 {

	public static void main(String[] args) {
		String s1 =new String("Ashutosh");//2 object
		String s2 =new String("Ashutosh");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		String s3= "Nikhil";
		String s4= "Nikhil";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		String s5 =new String();
        System.out.println(s5.length());
        //StringBuffer sb =new StringBuffer("Ashutosh");
//        StringBuilder sb = new StringBuilder("Ashutosh");
//        String s6 =new String(sb);
//        System.out.println(s6);
        //byte [] b = {-120,102,103};
        char[] s7=new char[] {'a','b','c'};
        String s6 =new String("abc");
        System.out.println("s1: " +s6);
        System.out.println("s7: " + s7);
        
	}

}
