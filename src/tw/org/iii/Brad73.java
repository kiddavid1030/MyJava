package tw.org.iii;

import java.util.LinkedList;

public class Brad73 {

	public static void main(String[] args) {
 		LinkedList<String> list1 = new LinkedList<>();
        list1.add(0,"A");
        list1.add(0,"B");
        list1.add(0,"C");  //index <= list1.size()
        System.out.println(list1.get(1));
	}

}
