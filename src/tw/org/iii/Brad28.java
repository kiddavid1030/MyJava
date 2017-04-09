package tw.org.iii;   //主題重點: 多型
public class Brad28 {
	public static void main(String[] args) {
		
	}
}
class Brad281 {
	Brad283 m1(){return new Brad283();}
	String m2(){return "";}
	
}
class Brad282 extends Brad281 {
	Brad284 m1(){return new Brad284();} //我要改寫m1方法  override; 要一模一樣不能兩樣
}
class Brad283 {}
class Brad284 extends Brad283{}