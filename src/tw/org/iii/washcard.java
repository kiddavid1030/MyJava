package tw.org.iii;

public class washcard {

	public static void main(String[] args) {
		int[] poker = new int[52];  //0-5
		for (int i=0; i<52; i++){
			int temp = (int)(Math.random()*52);
			//ÀË¬d¾÷¨î
		boolean isRepeat = false;
		for(int j=0; j<i; j++){
			if(poker[j]==temp){
				isRepeat = true;
			   break;
			}
		}
		if (!isRepeat){
			poker[i] = temp;
		    //System.out.println(poker[i]);
		}else{
		    i--;
		}
			System.out.println(poker[i]);
		}

	}

}
