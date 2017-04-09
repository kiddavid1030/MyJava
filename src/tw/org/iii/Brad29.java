package tw.org.iii;    //主題:介面
public class Brad29 {
   public static void main(String[] args) {

	}

}
interface Brad291 {   //介面都會有規格
	void m1();  //都隱含 public 
	abstract void m2();  //在介面中通通都抽象
}
class Brad292 implements Brad291 {    //類別都是要實作   
	public void m1(){}    //大家都可以實作 用 public
	public void m2(){}
}
abstract class Brad293 implements Brad291 {  //失敗了 讓後代再來努力
	public void m1(){}
	public void m2(){}
}

