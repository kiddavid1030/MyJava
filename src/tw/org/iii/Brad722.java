package tw.org.iii;     //型別泛型

import java.util.TreeSet;   //HashSet   TreeSet

public class Brad722 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();   //如何把元素一個一個拿出來
		set.add("1");
		set.add("12");
		set.add("2");
		
		System.out.println(set);
		for(String obj:set){
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

}
