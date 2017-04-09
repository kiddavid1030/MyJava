package tw.org.iii;

public class Brad41 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = sb1;
		sb1.append("123456789012345678901234567");  //WHY 34
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
        System.out.println(sb1 == sb2); 
	}

}
