package tw.org.iii;

public class Steve {

	public static void main(String[] args) {
		//  字串跟陣列都是物件 而且是特殊陣列
		int[] a;
		//宣告一個整數陣列叫 a
		int b[];
        a = new int[3]; // 0,1,2
        //new 也是物件  , 看到new是很清楚做出來的物件
         System.out.println(a.length);
        for (int i=0; i<a.length; i++){
        	System.out.println(a[i]);
        	//為什麼是[]從開始因為是偏移量 offset 
        }
        
	}

}
