package tw.org.iii;

import java.io.*;
import java.io.File;
import java.io.FileInputStream;

public class Brad48 {
	public static void main(String[] args) {
		File file = new File("./dir1/file1.txt");  // "."這個檔案的所在地
		try{
			FileInputStream fin =                     //安裝水龍頭
					new FileInputStream(file);
			byte[] buf = new byte[(int)file.length()]; //2G以內
            int len =fin.read(buf);
			System.out.println(new String(buf, 0, len));
			//int len;
			//while ( (len = fin.read(buf)) != -1 ){
				//System.out.print(new String(buf,0,len)); // buf 從0開始到len
			//}
			
			
			//do{
				// temp = fin.read();
			//}while(temp != -1);
			//int data =fin.read();
			//System.out.print((char)fin.read());
			//System.out.print((char)fin.read());
			//System.out.print((char)fin.read());
			//System.out.print((char)fin.read());
			fin.close();                              //關水龍頭
		}catch(FileNotFoundException ee){
			System.out.println(ee.toString());
		}catch(Exception ee){
			System.out.println(ee.toString());
		}
		//if (file.exists()){
			//System.out.println("Ok" + file.getAbsolutePath());
		//}else{
			//System.out.println("XX");
		//}
	}

}
