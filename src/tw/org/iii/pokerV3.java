package tw.org.iii;

import java.util.Arrays;

public class pokerV3 {

	public static void main(String[] args) {
		//�~�P
		long start = System.currentTimeMillis();
		boolean[] check = new boolean[10];  //0-51; false
		int[] poker = new int[52];    //0-51 :0
		for (int i=0; i<52; i++){
			int temp = (int)(Math.random()*52);
			if (check[temp]){
				//���ƤF
			}else{
				poker[i] = temp;
				check[temp] = true;
			//�o�P => �|�Ӫ��a  => �C�a��13�i
		     int[][] player = new int[4][13];
		     for (int i=0; i<poker.length; i++){
		     		player[i%4][i/4] = poker[i];
		     	}
		     
		     
		     	System.out.println("--");
			}
		}
         System.out.println("�Ӯ�:" + (System.currentTimeMillis() - start)); 
         
     	//��� �Ĥ@�a
//     	for (int v : player[1]){
//     		System.out.println(v);    
	}
    
	}
	//�u�P
	String[] suits ={"�®�","����","���","����"};  //suit[0]
	String[] suits ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};  //suit[0]
	for (int[] cards : player){
		//�z�P
		Arrays.sort(cards);
		for (int card : cards){
			System.out.println(suit[card/13] + value[card%13] +"  ");
		}
		System.out.println();
	}
 } 
