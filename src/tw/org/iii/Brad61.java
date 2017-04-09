package tw.org.iii;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Brad61 {
     public Static void main(String[] arg){
    	 Brad613 obj = new Brad613();
    	 //序列
    	 try {
		     ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("./dir1/Brad611"));
		     oout.writeObject(obj);
		     oout.flush();
		     oout.close();
		     System.out.println("OK1");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
    	 System.out.println("------");
    	 //解序
     }
}
class Brad611 {
	Brad611(){System.out.println("Brad611");}
}
class Brad612 implements Serializable{
	Brad612(){System.out.println("Brad612");}
}
class Brad613 {
	Brad613(){System.out.println("Brad613");}
}
