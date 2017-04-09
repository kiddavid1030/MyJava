package tw.org.iii;    //HashSet   TreeSet

import java.util.TreeSet;

public class Brad721 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();   //如何把元素一個一個拿出來
		set.add(12);
		set.add(56);
		byte a = 13;
		set.add(a)   //byte => int => Integer  不能轉兩次  認證考
		System.out.println(set);
		}
		
//        set.add(12000000);
//        set.add(12000000);
//        set.add(12000000);
//        set.add(12.3);
//        set.add(56);
//        set.add(12.3);
//        set.add("Brad");
//        set.add(12.3);
//        System.out.println(set);
	}


