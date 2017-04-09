package tw.org.iii;
public class Brad47 {
    public static void main(String[] args) {
    	new Brad471().m1();  //作出物件實體 招喚m1方法
    }
}
class Brad471 {
	void m1(){     //設計m1方法
		try{
			System.out.println("do something");   //試一段
			//throw new Exception();
		}catch(Exception ee){                    //抓出來  
			System.out.println("catch");
		}finally {
			System.out.println("OK");
		}
		//System.out.println("end");
	}
}