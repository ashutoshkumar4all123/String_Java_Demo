package javastringbuilder;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuilder sb1= new StringBuilder();
		sb1.append("Ashutosh");
		System.out.println(sb1.capacity());
		System.out.println(sb1.lastIndexOf("s"));
		System.out.println(sb1.indexOf("s"));

	}

}
