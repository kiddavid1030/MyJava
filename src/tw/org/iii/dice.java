package tw.org.iii;

public class dice {
      //��� ����dice�����v
	public static void main(String[] args) {
		int[] p = new int[6];
		for (int i=0;i<100000;i++){
			int dice = (int)(Math.random()*9); //0-8 => 6,7,8
			//[(dice>=6)?dice-3:dice]++;
			//�T���B�⦡   ����if true:false
			//�������Ʀr
			if (dice>=6){
				p[dice-3]++;
			}
			if (dice<6){
				p[dice]++;
			}
			}
		for(int i=0; i<p.length; i++){
			System.out.println( (i+1) + "�I�X�{" + p[i]);
		}
	}

}
