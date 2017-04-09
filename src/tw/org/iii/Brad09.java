package tw.org.iii;

public class Brad09 {

	public static void main(String[] args) {
		int[] p = new int[6]; //0-5 => 0
		//int p1,p2,p3,p4,p5,p6;
		//p1 = p2 = p3 = p4 = p5 = p6 = 0;
		for (int i=0;i<10;i++){
			int dice = (int)(Math.random()*6);  //0-5
			p[dice]++;
		}	
		//switch(dice){
		    //case 1: p1++;break;
		    //case 2: p2++;break;
		    //case 3: p3++;break;
		    //case 4: p4++;break;
		    //case 5: p5++;break;
		    //case 6: p6++;break;
		   // default:System.out.println("xxx");break;
			for(int i=0; i<p.length; i++){
				System.out.println( (i+1) + "點出現" +  p[i] +"次");
		}
		
	}

}
