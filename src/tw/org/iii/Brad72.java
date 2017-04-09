package tw.org.iii;     //型別泛型

import java.util.TreeSet;   //HashSet   TreeSet

public class Brad72 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();   //如何把元素一個一個拿出來
		while (set.size()<6){
			set.add((int)(Math.random()*49+1));  //樂透
		}
		System.out.println(set);
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
