package CQS_Installers;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Welcome implements ActionListener{
	JFrame jf;
	JLabel l;
	JButton bn,be;
	ArrayList <Technician> ten ;
	ArrayList <Customer> cut ;
	
	Welcome(ArrayList<Technician> te,ArrayList<Customer> ct)
	{
		ten=te;
		cut=ct;
		jf = new JFrame();
		jf.getContentPane().setForeground(Color.MAGENTA);
		jf.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 50));
		jf.setBounds(100, 100, 650, 520);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.getContentPane().setLayout(null);
		
		l = new JLabel("WELCOME");
		l.setForeground(Color.RED);
		l.setFont(new Font("Tahoma", Font.BOLD, 50));
		l.setBounds(167, 174, 278, 60);
		jf.getContentPane().add(l);
		
		bn = new JButton("NEXT");
		bn.setForeground(Color.MAGENTA);
		bn.addActionListener(this);
		bn.setBounds(441, 323, 97, 25);
		jf.getContentPane().add(bn);

		be = new JButton("EXIT");
		be.setForeground(Color.MAGENTA);
		be.addActionListener(this);
		be.setBounds(75, 323, 97, 25);
		jf.getContentPane().add(be);
		
	}
	public void actionPerformed(ActionEvent ae) {
		String str=ae.getActionCommand();
		if(str.equalsIgnoreCase("EXIT"))
		{
			jf.dispose();
		}
		else if(str.equalsIgnoreCase("NEXT"));
		{
			jf.dispose();
			new Mainframe(ten,cut);
		}
	}

}
