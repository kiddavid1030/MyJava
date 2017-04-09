package tw.org.iii;

public class Brad25 {

	public static void main(String[] args) {
		Brad253 b1 = new Brad253();

	}

}
class Brad251 {   //檔案可以多個class  但是只能有一個public
	static {System.out.println("s1");}
	  Brad251(){System.out.println("Brad251()");}
	  Brad251(int a){System.out.println("Brad251(int)");}
}
class Brad252 extends Brad251 {      //Brad251有個參數類別會影響繼承
	static {System.out.println("s2");}
	Brad252(String a){                 //要嬤不傳叁數   傳了就都要有
		//super();
		super(2);
		System.out.println("Brad252(String)");
	}
}
class Brad253 extends Brad252 {
	static {System.out.println("s3");}
	Brad253(){
		super("brad");
		System.out.println("Brad253()");
		
	}
}