package tw.org.iii;

public class Brad42 {
    public static void main(String[] args) {
    	Brad421 b1 = new Brad422();
    	Brad422 b2 = (Brad422)b1;       
    	Brad421 b3 = new Brad423();
    	Brad422 b4 = (Brad422)b3;         //�૬���� �sĶ�|�L ���楢��
	}
}
class Brad421 {
	void m1(){System.out.println("brad421:m1()");}
}
class Brad422 extends Brad421 {
	void m1(){System.out.println("brad422:m1()");}
	void m2(){System.out.println("brad422:m2()");}
}
class Brad423 extends Brad421 {
	void m1(){System.out.println("brad423:m1()");}
	void m2(){System.out.println("brad423:m2()");}
}