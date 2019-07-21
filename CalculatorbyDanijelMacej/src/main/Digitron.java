package main;

import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;
import javax.swing.border.Border;

import org.omg.CORBA.SetOverrideType;

public  class Digitron extends JFrame implements ActionListener{
	
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4;
	JPanel p1,p2,p3,p4;
	
	
	//MainPanel mainPanel = new MainPanel(); //JPanel subclass

	//JFrame mainFrame = new JFrame();
	//mainFrame.setTitle("main window title");
	//mainFrame.getContentPane().add(mainPanel);
	//mainFrame.setLocation(100, 100);
	//mainFrame.pack();
	//mainFrame.setVisible(true);
	//mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	public  Digitron() {
		
		p1 = new JPanel();

		
		
		p1.setBounds(20, 20, 200,300);
		p1.setLayout(new GridLayout(4, 1,30, 30));
		l1 = new JLabel("Digitron");
		l1.setFont(new Font("ariel", Font.BOLD, 30));
		
		
		
		
		
		
		
		
		
		t1 = new JTextField();
		t1.setFont(new Font("ariel",Font.BOLD,30));
		t1.setForeground(Color.red);
		
		
		t2 = new JTextField();
		t2.setFont(new Font("ariel",Font.BOLD,30));
		t2.setForeground(Color.red);

		t3 = new JTextField();
		t3.setEditable(false);
		t3.setBackground(Color.black);
		t3.setFont(new Font("ariel",Font.BOLD,30));
		t3.setForeground(Color.WHITE);
		p1.add(l1);
		p1.add(t1);
		p1.add(t2);
		p1.add(t3);
		
		
		
		p2 = new JPanel();
		p2.setBounds(250, 20, 200, 400);
		p2.setLayout(new GridLayout(4, 2, 20, 20));
		b1 = new JButton("+");
		l2 = new JLabel("SABIRANJE");
		
		b2 = new JButton("-");
		
		
		
		b3 = new JButton("*");
		l4 = new JLabel("MNOZENJE");
		l3 = new JLabel("ODUZIMANJE");
		b4 = new JButton("/");
		l5 = new JLabel("DELJENJE");
		
		//p2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		
		
		
		
		
		
		
		
		p2.add(b1);
		p2.add(l2);    // KAD POSTOJI PANEL BITAN JE RASPORED U SUPROTNOM NE
		p2.add(b2);
		p2.add(l3);
		p2.add(b3);
		p2.add(l4);
		p2.add(b4);
		p2.add(l5);
		
		
		ImageIcon slika = new ImageIcon("C:/Users/Danijel/Desktop/java-logo13.png");
		
		p3 = new JPanel();
		p3.setVisible(true);
	
		p3.setBounds(20, 330,150, 100);
		l6 = new JLabel();
		p3.add(l6);
	
		l6.setIcon(slika);
		
		p4 = new JPanel();
		p4.setBounds(0, 0, 480,460);
		
		Border border = BorderFactory.createLineBorder(Color.red, 3);
		
		p4.setBorder(border);
		
		
		
		
		add(p1);
		
		
		add(p2);
		add(p3);
		add(p4);
		
		
		
		
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		setSize(500, 500);
		
		setTitle("Made by Danijel Macej");
		setAlwaysOnTop(isAlwaysOnTop());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		

		
		
		
	
		setLayout(null);
		setVisible(true);
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String prvibroj = t1.getText();
		String drugibroj = t2.getText();
		
		int a = Integer.parseInt(prvibroj);
		int b = Integer.parseInt(drugibroj);
		double c = 0;
		
		if(e.getSource()==b1) {
			c = a+b;
		}else if (e.getSource()==b2) {
			c=a-b;
		}else if(e.getSource()==b3) {
			c=a*b;
		}else if(e.getSource()==b4) {
			c=(double)a/b;
		}
		String rezultat = String.format("%.3f",c);
		t3.setText(rezultat);
		
		
	}
		public static void main(String[] args) {
			
		
		new Digitron(); // instancirali smo celu klasu Digitron umainu da bi pokrenuli sve sto smo radli
		
		
}

		







	

}
