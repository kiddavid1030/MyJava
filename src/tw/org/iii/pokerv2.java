package tw.org.iii;

public class pokerv2 {

	public static void main(String[] args) {
		int[] poker = new int[10];
		boolean isRepeat; int temp;
		for (int i=0; i<0; i++){
			do{
				temp = (int)(Math.random()*10);
				//ÀË¬d¾÷¨î
				isRepeat = false;
				for9int j=0; j<i; j++){
					if (poker[j]==temp){
						isRepeat = true;
						break;
					}
				}
			}while (isRepeat);
			poker[i] =temp;
			
		}

	}

}
