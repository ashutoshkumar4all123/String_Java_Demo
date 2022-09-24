package javastringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
//		StringBuffer sb= new StringBuffer();
//		System.out.println(sb.capacity());
//		sb.append("Ashutosh");
//		sb.append(" working on core Java");
//		System.out.println(sb.capacity());   //(16*2)+2 or (old capacity+1)*2
//		System.out.println(sb.charAt(2));
//		System.out.println(sb);
//		//System.out.println(sb.delete(2, 5));
//		System.out.println(sb.deleteCharAt(3));
		
		StringBuffer sb1= new StringBuffer("ashutosh Java");
		//StringBuffer sb2= new StringBuffer("Ashutosh");
		//StringBuffer sb3= sb1.append(" HI");
		//System.out.println(sb1.equals(sb3));
//		System.out.println(sb1.indexOf("a"));
//		System.out.println(sb1.lastIndexOf("a"));
//		//System.out.println(sb1.insert(2, "bbb"));
//		//System.out.println(sb1.replace(3, 6, "Kmp"));
//		System.out.println(sb1.reverse());
//		String s= "Ashutosh";
//		StringBuffer sb4= new StringBuffer(s);
//		System.out.println(sb4.reverse());
//		System.out.println(sb1.capacity());
//		sb1.ensureCapacity(100);
//		System.out.println(sb1.capacity());
		sb1.ensureCapacity(100);
		System.out.println(sb1.capacity());
		sb1.trimToSize();
		System.out.println(sb1.capacity());
		
		
	
	}

}
