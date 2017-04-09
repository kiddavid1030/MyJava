package tw.org.iii;
// Exception ¦C¥~
public class Brad44 {
    public static void main(String[] args) {
	    int a = 10, b = 4;
	    int[] c = {1,2,3,4};
        try {
        	System.out.println(a / b);
        	System.out.println(c[4]);
        }catch(ArithmeticException ae){
        	System.out.println("87");
        }catch(ArrayIndexOutOfBoundsException ee){
        	System.out.println("XX");
        }catch (RuntimeException re){
        	System.out.println("OK");
        }
	    System.out.println("Hello, World");
	}

}
