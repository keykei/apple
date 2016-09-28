import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;

public class MyFrame extends JApplet implements ActionListener
{
    	private MyPanel panel;
    	private Apple apple;
    	private double time;
	private Timer timer1;
	private boolean flag = false;
	private double fall = 0;
    	private int i = 0;

   	public void init()
	{
		apple = new Apple();
		apple.setV0(100);
		apple.setTheta(Math.PI / 2.5);
		time = 0.0;
		
		timer1 = new Timer(17, this); // 1秒約60フレーム
		timer1.start();

		Image[] imgs = new Image[9];
		URL[] url = new URL[9];
	
	
		for(int i=0; i<7; i++)
		{	

			url[i]  = MyPanel.class.getResource("apple" + (i+1) + ".png");
			imgs[i] = getImage(url[i]);
			
			
		}
		
		url[8] = MyPanel.class.getResource("tree.png");
		imgs[8] = getImage(url[8]);

		panel = new MyPanel(imgs);
		getContentPane().add(panel);
    	
	}
    
    	public void actionPerformed(ActionEvent e) 
	{
		apple.setTime(time);
		double appleX = apple.getX();
		double appleY = apple.getY();
		
		
		if (fall > 500) 
		{ 
			if( !flag ) 
			{	
				time = 0.0;
				flag = true;
				apple.setTime(time);
				appleX = apple.getX();
			}
			time += 0.05;
			panel.setAppleX(appleX);
			panel.setI(i);
			i++;
			if(i == 8){ i=0; }
			if(appleX > 165){ timer1.stop(); }
		}
		else 
		{  
			time += 0.2;
			fall = appleY;
			panel.setAppleY(appleY);
		}

		panel.repaint();
    	}
}
