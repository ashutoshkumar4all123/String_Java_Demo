package importantcode;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
     	String s= "programig";
//		StringBuilder sb1= new StringBuilder();
//		s.chars().distinct().forEach(c -> sb1.append((char) c));
//		System.out.println(sb1);
//		
//		StringBuilder sb2= new StringBuilder();
//		for(int i=0; i<s.length(); i++) {
//			char ch =s.charAt(i);
//			int idx = s.indexOf(ch, i+1);
//			if(idx==-1) {
//				sb2.append(ch);
//			}
//		}
//		System.out.println(sb2);
		
		char [] arr = s.toCharArray();
		StringBuilder sb3= new StringBuilder();
		for(int i=0; i<arr.length; i++){
			boolean repeate = false;
			for(int j=i+1; j<arr.length; j++ ) {
				if (arr[i]==arr[j]) {
					repeate = true;
					break;
				}
			}
			if (!repeate) {
				sb3.append(arr[i]);
			}
		}
		System.out.println(sb3);
        //System.out.println(s.indexOf("a", 6)); 
	}

}
