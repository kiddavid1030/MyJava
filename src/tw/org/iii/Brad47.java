package tw.org.iii;
public class Brad47 {
    public static void main(String[] args) {
    	new Brad471().m1();  //�@�X������� �۳�m1��k
    }
}
class Brad471 {
	void m1(){     //�]�pm1��k
		try{
			System.out.println("do something");   //�դ@�q
			//throw new Exception();
		}catch(Exception ee){                    //��X��  
			System.out.println("catch");
		}finally {
			System.out.println("OK");
		}
		//System.out.println("end");
	}
}