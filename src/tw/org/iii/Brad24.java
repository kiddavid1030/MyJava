package tw.org.iii;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Brad24 extends JFrame{
	private JButton open, save, exit;
	private MyPainter myPainter;
    Brad24(){
    	//super();
    	super("視窗程式");
    	setLayout(new BorderLayout());
    	open = new JButton("open");
    	save = new JButton("save");
    	exit = new JButton("exit");
    	myPainter = new MyPainter();
    	
    	JPanel top = new JPanel(new FlowLayout());
    	top.add(open); top.add(save); top.add(exit); 
    	
    	add(top, BorderLayout.NORTH);
    	add(myPainter, BorderLayout.CENTER);
    	
//    	add(open, BorderLayout.NORTH);
//    	add(save, BorderLayout.WEST);
//    	add(exit,BorderLayout.CENTER);
    	setSize(640, 480);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    }
	public static void main(String[] args) {     //要載入先 ,main是進入點
		new Brad24();
	}

}
