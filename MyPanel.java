import java.io.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.BufferedImage;

public class MyPanel extends JPanel
{
    	private double appleX, appleY;
	private int i;
	private BufferedImage bi;
	private Graphics g;
	private Image[] imgs = new Image[9];
    
    	public MyPanel(Image imgs[]) 
	{
	
		super();
		setBackground(Color.lightGray);
		setPreferredSize(new Dimension(700, 700));
	
		bi = new BufferedImage(700, 700, BufferedImage.TYPE_INT_ARGB);

		for(int i=0; i<9; i++)
		{
			this.imgs[i] = imgs[i];
		}

    	}	
    
    	public void setAppleX(double appleX) { this.appleX = appleX; }
    	public void setAppleY(double appleY) { this.appleY = appleY; }
    	public void setI(int i){ this.i = i; }
    	public void paintComponent(Graphics g) 
	{

		super.paintComponent(g);
		g.drawImage(imgs[8], 0, 0, this); //背景描画
		g.drawImage(imgs[i], (int)appleX + 200, (int)appleY + 100, this);

	}
}
