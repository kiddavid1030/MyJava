package tw.org.iii;

public class Brad27 {

	public static void main(String[] args) {
		Brad271 b1 = new Brad272();
		Brad271 b2 = new Brad273();
		b1.m1();

	}    //�������O���i�H���غc��

}
abstract class Brad271 {
	Brad271(){System.out.println("Brad271()");}
	void m1(){System.out.println("Brad271:m1()");}
	abstract void m2();   //�㦳��H��k�����O�n�k���b��H
}
class Brad272 extends Brad271 {
	void m2(){System.out.println("Brad272:m2()");}
}
abstract class brad273 extends Brad271 {
	void m3(){System.out.println("Brad273:m3()");}
}
abstract class brad274 extends Brad271 {
	void m4(){System.out.println("Brad273:m4()");}
}