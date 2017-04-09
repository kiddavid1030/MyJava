package tw.org.iii;

public class dice {
      //賭場 改變dice的機率
	public static void main(String[] args) {
		int[] p = new int[6];
		for (int i=0;i<100000;i++){
			int dice = (int)(Math.random()*9); //0-8 => 6,7,8
			//[(dice>=6)?dice-3:dice]++;
			//三元運算式   類似if true:false
			//切換的數字
			if (dice>=6){
				p[dice-3]++;
			}
			if (dice<6){
				p[dice]++;
			}
			}
		for(int i=0; i<p.length; i++){
			System.out.println( (i+1) + "點出現" + p[i]);
		}
	}

}
