package tw.org.iii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad66 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9999);
			Socket socket = server.accept();
			
			System.out.println(socket.getInetAddress().getHostAddress());
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			InputStream in =socket.getInputStream();
			int i; String line;
			while ( (line = read.reader()) != -1){
				System.out.println((char)i);
			}
			in.close();
			
			sever.close();
//			System.out.println("before");
//			sever.accept();
//			System.out.println("After");
//			sever.close();
//			System.out.println("OK");
		} catch (IOException e) {
			System.out.println(e.toString());
		}

	}

}
