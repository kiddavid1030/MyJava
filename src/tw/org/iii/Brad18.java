package tw.org.iii;

public class Brad18 {

	public static void main(String[] args) {
		String a = new String("abc");
		String b = new String("abc");
		String c = "abc";
		String d = "abc";
		String e = a;
		System.out.println(a == b);
		// 當都是物件時,==是比對是不是相同物件
		//  當都是字串  , 是比其值
		// 
	}

}
