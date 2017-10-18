package Assignment10;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Draw{
    public static void main(String[] args) {
	JFrame f = new JFrame("그래픽 기초 프로그래");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.add(new MyPanel());
	f.setSize(1100, 500);
	f.setVisible(true);
    }
}

class MyPanel extends JPanel {
    public MyPanel() {
	setBorder(BorderFactory.createLineBorder(Color.black));
	

    }

    protected void paintComponent(Graphics g) {
    	String[] labels = {"drawLine","drawRect","draw3DRect","drawRoundRect","drawOval","drawArc","drawPolygon",
		           "drawPolyline","fillRect","fill3DRect","fillRoundrect","fillOval","fillArc","fillPolygon"};
    	super.paintComponent(g);
    	
    	for (int i = 0; i < labels.length; i++) {
			if (i % 2 == 0) 
				g.drawString(labels[i], i*50, 70);
			else 
				g.drawString(labels[i], (i-1)*50, 150);
    	}
    	g.drawLine(0, 50, 100, 150);
    	g.drawRect(150, 50, 100, 100);
    	g.draw3DRect(300, 50, 100, 100, true);
    	g.drawRoundRect(450, 50, 100, 100, 20, 20);
    	g.drawOval(600, 50, 100, 100);
    	g.drawArc(750, 50, 100, 100, 20,150);
    	int[] x1 = {900,1000,900,1000};
    	int[] y1 = {50,50,150,150};
    	int[] x2 = {900,1000,900,1000};
    	int[] y2 = {300,300,400,400};
    	int[] x3 = {0,100,0,100};
    	int[] y3 = {300,400,400,300};
    	g.drawPolygon(x1,y1,4);
    	g.drawPolyline(x2,y2,4);
    	g.fillRect(150, 300, 100, 100);
    	g.fill3DRect(300, 300, 100, 100, true);
    	g.fillRoundRect(450, 300, 100,100,20,20);
    	g.fillOval(600, 300, 100, 100);
    	g.fillArc(750, 300, 100, 100 ,20,150);	
    	g.fillPolygon(x3,y3,4);
    }
}