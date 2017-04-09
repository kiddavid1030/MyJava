package tw.org.iii;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Brad55 {

	public static void main(String[] args) {
       int a=1, b=2; String c = "Brad", d="資策會";
       try {
    	   FileOutputStream fout = new FileOutputStream("./dir1/data1.dat");
    	   DataOutputStream dout = new DataOutputstream(fout);
    	   dout.writInt(a)
       }

	}

}
