package com.threads;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class WaterTank extends Frame {

	Thread inletThread, outletThread, controllerThread;
	float waterPercentage = 70.00f;

	public WaterTank() {
		super("Ball game");
		setBackground(Color.CYAN);
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		inletThread = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
//					waterPercentage += 16.67;
					waterPercentage += 0.50;
					try {
						Thread.sleep(50);
//						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					repaint();
				}
			}
		});
		outletThread = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
//					waterPercentage -= 23.34;
					waterPercentage -= 0.50;
					try {
						Thread.sleep(50);
//						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					repaint();
				}
			}
		});
		controllerThread = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					if (waterPercentage < 75) {
						outletThread.suspend();
						inletThread.resume();
					}
					if (waterPercentage > 85) {
						outletThread.resume();
						inletThread.suspend();
					}
				}
			}
		});
		inletThread.start();
		outletThread.start();
		controllerThread.setDaemon(true);
		controllerThread.start();
	}

	public void paint(Graphics g) {
		g.drawRect(150, 100, 200, 300); // tank
		g.setColor(Color.RED);
		g.fillRect(350, 400, -200, -(int) ((300 * (waterPercentage / 100)))); // water
		g.drawString(waterPercentage + "%", 380, 200);
	}

	public static void main(String[] args) {
		Frame mf = new WaterTank();
		mf.setSize(500, 500);
		mf.setVisible(true);
	}
}
