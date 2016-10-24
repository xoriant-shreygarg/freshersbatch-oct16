package com.threads;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class BallGame extends Frame {

	Thread t1, t2, t3;
	int y1 = 400, y2 = 400, y3 = 400;

	public BallGame() {
		super("Ball game");
		setBackground(Color.CYAN);
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				int incrementOrDecrement = 5;
				while (true) {
					if(y1>=450)
						incrementOrDecrement = -5;
					if(y1<=10)
						incrementOrDecrement = 5;
					y1+=incrementOrDecrement;
					repaint();
					try {
						Thread.sleep(25);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				int incrementOrDecrement = 5;
				while (true) {
					if(y2>=450)
						incrementOrDecrement = -5;
					if(y2<=10)
						incrementOrDecrement = 5;
					y2+=incrementOrDecrement;
					repaint();
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				int incrementOrDecrement = 5;
				while (true) {
					if(y3>=450)
						incrementOrDecrement = -5;
					if(y3<=10)
						incrementOrDecrement = 5;
					y3+=incrementOrDecrement;
					repaint();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t1.start();
		t2.start();
		t3.start();
	}

	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(100, y1, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(200, y2, 50, 50);
		g.setColor(Color.BLUE);
		g.fillOval(300, y3, 50, 50);
	}

	public static void main(String[] args) {
		Frame mf = new BallGame();
		mf.setSize(500, 500);
		mf.setVisible(true);
	}

}
