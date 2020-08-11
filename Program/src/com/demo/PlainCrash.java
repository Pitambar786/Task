package com.demo;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class PlainCrash extends Applet implements Runnable,ActionListener{

	Thread t;
	Button b1,b2,b3,b4;
	int a=0,b=0;
	TextField tf1;
	Label l1;
	public void init() {
		l1=new Label("Enter speed in ms");
		l1.setForeground(Color.ORANGE);
		tf1=new TextField(5);
		b1=new Button("START");
		b2=new Button("STOP");
		b3=new Button("RESUME");
		b4=new Button("SUSPEND");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		setBackground(Color.black);
		add(l1);
		add(tf1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(a=0;a<650;a++) {
			repaint();
			
			try {
				repaint();
				Thread.sleep(Integer.parseInt(tf1.getText()));
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void paint(Graphics g) {
		if(a>475) {
			try {
				getAudioClip(new URL(getCodeBase(),"bonk.au")).play();
			}catch(Exception e) {
				
			}
		}
		if(a>600) {
			g.setColor(Color.LIGHT_GRAY);
			g.fillRect(650, 390, 130, 750);
			
		}
	}
	

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if((ae.getSource()==b1) && t==null) {
			t=new Thread(this);
			t.start();
		}
		else if((ae.getSource()==b2) && (t!=null)) {
			t.stop();
			t=null;
		}
		else if((ae.getSource()==b3) && (t!=null)) {
			t.suspend();
			
		}
		else if((ae.getSource()==b4) && (t!=null)) {
			t.resume();
		}
		
		
		
	}

}
