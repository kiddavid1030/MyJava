package tw.org.iii

public class Brad45 {
	public static void main(String[] args) {
		Bird b1 = new Bird();
		int n = 4;
		try{
			b1.setLeg(n);
		}catch(MyException ee){
			System.out.println(ee.toString());
			b1 = null;
		}catch(MyExcption2 ee){
			System.out.println(ee.toString());
		}
		System.out.println("End");
	}

}
class Bird {
	private int leg;
	void setLeg(int n) throws MyException, MyException2{
	//void setLeg(int n) throws Exception{
		if (n>2){
			throw new MyException2();
		}else if (n<0){
			throw 
		}
		leg = n;
	}
}