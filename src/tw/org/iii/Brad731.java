package tw.org.iii;

import java.util.LinkedList;

public class Brad731 {

	public static void main(String[] args) {          //  remove 資源回收桶
 		LinkedList<String> list1 = new LinkedList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("B");
        System.out.println(list1.get(1));
        list1.remove(1);
        System.out.println(list1.get(1));
        list1.remove(1);
        System.out.println(list1.get(1));
	}

}
