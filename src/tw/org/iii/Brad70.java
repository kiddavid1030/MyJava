package tw.org.iii;

public class Brad70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Brad701 {
	public void m1();
}
interface Brad702 {
	public void m2();
}
interface Brad703 extends Brad701 {
	public void m3();
}
interface Brad704 extends Brad701,Brad702 {
	public void m3()
}
class Brand705 implements Brad703 {   
    public void m1(){}
    public void m3(){}
} 
class Brand706 implements Brad704 {   
    public void m1(){}
    public void m2(){}
    public void m3(){}
}
    