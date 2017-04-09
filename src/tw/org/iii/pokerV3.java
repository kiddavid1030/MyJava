package tw.org.iii;

import java.util.Arrays;

public class pokerV3 {

	public static void main(String[] args) {
		//洗牌
		long start = System.currentTimeMillis();
		boolean[] check = new boolean[10];  //0-51; false
		int[] poker = new int[52];    //0-51 :0
		for (int i=0; i<52; i++){
			int temp = (int)(Math.random()*52);
			if (check[temp]){
				//重複了
			}else{
				poker[i] = temp;
				check[temp] = true;
			//發牌 => 四個玩家  => 每家有13張
		     int[][] player = new int[4][13];
		     for (int i=0; i<poker.length; i++){
		     		player[i%4][i/4] = poker[i];
		     	}
		     
		     
		     	System.out.println("--");
			}
		}
         System.out.println("耗時:" + (System.currentTimeMillis() - start)); 
         
     	//驗算 第一家
//     	for (int v : player[1]){
//     		System.out.println(v);    
	}
    
	}
	//攤牌
	String[] suits ={"黑桃","紅心","方塊","梅花"};  //suit[0]
	String[] suits ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};  //suit[0]
	for (int[] cards : player){
		//理牌
		Arrays.sort(cards);
		for (int card : cards){
			System.out.println(suit[card/13] + value[card%13] +"  ");
		}
		System.out.println();
	}
 } 
