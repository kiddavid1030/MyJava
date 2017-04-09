package tw.org.iii;

public class Steve09 {

	public static void main(String[] args) {
	      for (int i=1,j=10;i<10; i++,j--){
	    	  System.out.println(i + ":" + j);
	    	  if (j==7){
	    		  break;
	    	  }
	      }
          System.out.println("----------");
          
          for (int i=0; i<10; i++){
        	  if (i%2==0) continue;
        	  System.out.println(i);
        	  // break 是終止   continue 是繼續
          }
          System.out.println("-----------");
          steve:
        	  //  這是標記回醛 不能加東西 會編譯失敗
          for (int i=0; i<10; i++){
        	  for (int j=9; j>0; j--){
        		  System.out.println(i + ":" + j);
        		  if (j%5==0) continue steve;
        	  }
          }
	}

}
