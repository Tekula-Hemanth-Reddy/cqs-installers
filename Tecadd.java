package CQS_Installers;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Tecadd implements ActionListener {
	JFrame jfta;
	JLabel lt,ln,lp,la;
	JButton bs,ba,bb;
	JTextField tfn,tfp,tfa;
	ArrayList<Technician> teal;
	ArrayList<Customer> cmer;
	
	Tecadd(ArrayList<Technician> ta,ArrayList<Customer> cm)
	{
		teal=ta;
		cmer=cm;
		
		jfta= new JFrame();
		jfta.getContentPane().setBackground(Color.ORANGE);
		jfta.setBounds(100, 100, 650, 520);
		jfta.setVisible(true);
		jfta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfta.getContentPane().setLayout(null);
		
		lt = new JLabel("Technician");
		lt.setForeground(Color.RED);
		lt.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lt.setBounds(203, 38, 201, 41);
		jfta.getContentPane().add(lt);

		ln = new JLabel("Name :");
		ln.setFont(new Font("Tahoma", Font.BOLD, 25));
		ln.setBounds(71, 112, 103, 31);
		jfta.getContentPane().add(ln);

		lp = new JLabel("Ph no :");
		lp.setFont(new Font("Tahoma", Font.BOLD, 25));
		lp.setBounds(71, 173, 86, 23);
		jfta.getContentPane().add(lp);

		la = new JLabel("Address :");
		la.setFont(new Font("Tahoma", Font.BOLD, 25));
		la.setBounds(43, 232, 131, 23);
		jfta.getContentPane().add(la);
		
		tfn= new JTextField();
		tfn.setColumns(10);
		tfn.setBounds(173, 117, 431, 31);
		jfta.getContentPane().add(tfn);

		tfp = new JTextField();
		tfp.setColumns(10);
		tfp.setBounds(173, 174, 431, 31);
		jfta.getContentPane().add(tfp);

		tfa = new JTextField();
		tfa.setColumns(10);
		tfa.setBounds(173, 224, 431, 31);
		jfta.getContentPane().add(tfa);

		bb = new JButton("Back");
		bb.setBounds(29, 372, 97, 25);
		jfta.getContentPane().add(bb);
		bb.addActionListener(this);

		bs = new JButton("Submit");
		bs.setBounds(490, 330, 97, 25);
		jfta.getContentPane().add(bs);
		bs.addActionListener(this);

		ba = new JButton("ADD");
		ba.setBounds(490, 372, 97, 25);
		jfta.getContentPane().add(ba);
		ba.setVisible(false);
		ba.addActionListener(this);
		
	}

	
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str.equalsIgnoreCase("Back"))
		{
			jfta.dispose();
			new Mainframe(teal,cmer);
		}
		else if(str.equalsIgnoreCase("ADD"))
		{
			jfta.dispose();
			new Tecadd(teal,cmer);
		}
		else if(str.equalsIgnoreCase("Submit"))
		{
			ba.setVisible(true);
			Technician tec = new Technician(tfn.getText(),tfp.getText(),tfa.getText());
			teal.add(tec);
		}
		
	}

}
