package tw.org.iii;

public class Brad19 {

	public static void main(String[] args) {
	        Bike b1 = new Bike();
			Bike b2 = new Bike();
			System.out.println(b1.getSpeed());
			//只要能new出來就代表是有清楚的值 所以可以print出來
			b1.upspeed();
			b1.upspeed();
			b1.upspeed();
			b1.upspeed();
			System.out.println(b1.getSpeed());
		}


}
