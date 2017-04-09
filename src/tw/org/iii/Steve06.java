package tw.org.iii;

public class Steve06 {
	public static void main(String[] args) {
		int month = (int)(Math.random()*12+1);
		System.out.println(month);
		switch(month){
		case 1 : case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31");
			break;
		default:
			System.out.println("xx");
				break;
		case 4 : case 6: case 9: case 11:
			System.out.println("30");
			break;
		case 2 :
			System.out.println("28");
			break;
		}
	}
	
	
	//public static void main(String[] args) {
		//int a = 10;
		//final int b = 12;
		// 常數就可以
		//switch (a){
		//switch 沒有適合的程式用swift 
		//case 1:
			//System.out.println("A");
			//break;離開的意思 
		//case 5:
			//System.out.println("B1");
		//case b-2:
			//System.out.println("B1");
			//break;
		//case 100:
			//System.out.println("C");
		//default:
			//System.out.println("D");
			//break;
		//}

	//}
	
	

}
