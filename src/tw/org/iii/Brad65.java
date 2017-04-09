package tw.org.iii;  //TCP 

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Brad65 {

	public static void main(String[] args) {
	  //for (int i=0; i<65536; i++){
		 try {
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);
			socket.close();
		 } catch (Exception e) {
			//System.out.println();
		   }
		
		

	  // }

     }

	
}