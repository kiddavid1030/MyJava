package tw.org.iii;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class MyPainter extends JPanel implements MouseListener {
     public MyPainter(){
    	 setBackground(Color.yellow);
    	 addMouseListener(this);
     }
     @Override
     protected void paintComponent(Graphics g) {
    	 super.paintComponent(g);
    	 
    	 Graphics2D g2d = (Graphics2D)g;
    	 g2d.setStroke(new BasicStroke(4));
    	 g2d.setColor(Color.RED);
    	 g2d.drawOval(x, y, w, h);
    	 //g2d.setColor(Color.BLUE);
    	// g2d.drawLine(0, 0, 200, 200);
    	 System.out.println("paint");
     }
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Clicked");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		x0 = e.getX(); y0 = e.getY();
	}	
	@Override
	public void mouseReleased(MouseEvent e) {
		x1 = e.getX(); y1 = e.getY();
		int r = Math.abs(x0-x1);
		w = h = 2*r;
		x = x0 - r;
		y = y0 - r;
		
	}
}

class MyMouseAdapter extends MouseAdapter {
	
}
