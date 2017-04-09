package tw.org.iii;   //泛型

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Brad71 {
	public static void main(String[] args) {
	    HashSet set = new HashSet();
	    
	    int i1 = 12;
	    Integer i2 = new Integer(34);
	    set.add(i2);
	    set.add(i1);  // i1 => auto-boxing => new Integer(i1)
	    System.out.println(set);
	    System.out.println("===");
	    //is-a Collection => for-each
	    for (Object obj : set){
	    	System.out.println((Integer)obj);
	    }
//        
//	    Bike b1 = new Bike();
//	    String s1 = "Brad";
//	    Integer i1 = new Integer(12);
//	    Integer i2 = new Integer("34");
//	    int ii3 = 56;
//	    Integer i3 = ii3;
//	    System.out.println(i3.floatValue());
	}

}
//class Bike {
//	@Override
//	public String toString() {
//		return "Brad";
//		
//	}
//}
