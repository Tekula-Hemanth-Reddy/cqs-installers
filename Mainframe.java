package CQS_Installers;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Mainframe  {
	JFrame jfmf;
	JLabel l1,l2,l3,lc,lt;
	JButton ta,tv,te,tc,ca,cv,ce,cc,ext;
	ArrayList <Technician> techn ;
	ArrayList <Customer> cust ;
	JDialog jdg;
	JTextField jtf;
	String nam;
	
	Mainframe(ArrayList<Technician> ten,ArrayList<Customer> cut)
	{
		techn=ten;
		cust=cut;
		jfmf = new JFrame();
		jfmf.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		jfmf.getContentPane().setBackground(Color.CYAN);
		jfmf.getContentPane().setLayout(null);
		jfmf.setBounds(100, 100, 652, 520);
		jfmf.setVisible(true);
		jfmf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1 = new JLabel("CQ");
		l1.setFont(new Font("Tahoma", Font.BOLD, 30));
		l1.setForeground(Color.RED);
		l1.setBounds(271, 50, 70, 44);
		jfmf.getContentPane().add(l1);
		
		l2 = new JLabel("Solar Power Systems Installers");
		l2.setForeground(Color.RED);
		l2.setFont(new Font("Tahoma", Font.BOLD, 30));
		l2.setBounds(84, 107, 481, 28);
		jfmf.getContentPane().add(l2);

		l3 = new JLabel("CQS");
		l3.setForeground(Color.MAGENTA);
		l3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		l3.setBounds(270, 161, 94, 44);
		jfmf.getContentPane().add(l3);
		
		lt = new JLabel("Technician's Details");
		lt.setFont(new Font("Tahoma", Font.BOLD, 20));
		lt.setBounds(23, 255, 208, 28);
		jfmf.getContentPane().add(lt);

		lc = new JLabel("Customer Details");
		lc.setFont(new Font("Tahoma", Font.BOLD, 20));
		lc.setBounds(432, 260, 190, 19);
		jfmf.getContentPane().add(lc);
		
		ext = new JButton("EXIT");
		ext.setBounds(271, 423, 97, 25);
		jfmf.getContentPane().add(ext);
		ext.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					jfmf.dispose();
			
		}});

		ta = new JButton("ADD");
		ta.setBounds(44, 296, 97, 25);
		jfmf.getContentPane().add(ta);
		ta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new Tecadd(techn,cust);
		
		
			}});

		ca = new JButton("ADD");
		ca.setBounds(468, 292, 97, 25);
		jfmf.getContentPane().add(ca);
		ca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Cusadd(techn,cust);
		
			}});
		
		tv = new JButton("View");
		tv.setBounds(44, 334, 97, 25);
		jfmf.getContentPane().add(tv);
		tv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
				String[][] array=new String[100][3];
				int i=0;
				for(Technician a:techn)
				{
					array[i][0]=a.name;
					array[i][1]=a.phno;
					array[i][2]=a.address;
					i=i+1;
				}
				new Tecdetails(array);
		
			}});
		
		cv = new JButton("View");
		cv.setBounds(468, 334, 97, 25);
		jfmf.getContentPane().add(cv);
		cv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String[][] yrra = new String[100][8];
				int i=0;
				for(Customer c : cust)
				{
					yrra[i][0]=c.name;
					yrra[i][1]=c.address;
					yrra[i][2]=c.wps;
					yrra[i][3]=c.ins;
					yrra[i][4]=c.solar;
					yrra[i][5]=c.start;
					yrra[i][6]=c.end;
					yrra[i][7]=c.tec.name;
					i=i+1;
				}
				new Cusdetails(yrra);
		
		
			}});
	
		te = new JButton("Edit");
		te.setBounds(44, 372, 97, 25);
		jfmf.getContentPane().add(te);
		te.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jdg=new JDialog(jfmf,"enter name");
				jtf = new JTextField();
				jdg.add(jtf);
				jdg.setSize(200, 200);
				jdg.setVisible(true);
				jdg.addWindowListener(new WindowListener() {
					public void windowClosing(WindowEvent we) 
					{	
						nam=jtf.getText();
					}
					public void windowActivated(WindowEvent arg0) {	
					}
					public void windowClosed(WindowEvent arg0) {
						
				
					}
					public void windowDeactivated(WindowEvent arg0) {
						for(Technician te :techn)
						{
							if(te.name.equalsIgnoreCase(nam))
							{
								techn.remove(te);
								break;
							}
						}
						JOptionPane.showMessageDialog(jfmf, "Re-enter detail's");
						new Tecadd (techn,cust);
					}
					public void windowDeiconified(WindowEvent arg0) {	
					}
					public void windowIconified(WindowEvent arg0) {	
					}
					public void windowOpened(WindowEvent arg0) {
					}
				});
				
			}});
		
		ce = new JButton("Edit");
		ce.setBounds(468, 372, 97, 25);
		jfmf.getContentPane().add(ce);
		ce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jdg=new JDialog(jfmf,"enter name");
				jtf = new JTextField();
				jdg.add(jtf);
				jdg.setSize(200, 200);
				jdg.setVisible(true);
				jdg.addWindowListener(new WindowListener() {
					public void windowClosing(WindowEvent we) 
					{	
						nam=jtf.getText();
					}
					public void windowActivated(WindowEvent arg0) {	
					}
					public void windowClosed(WindowEvent arg0) {
						
					}
					public void windowDeactivated(WindowEvent arg0) {	
						for(Customer cu :cust)
						{
							if(cu.name.equalsIgnoreCase(nam))
							{
								cust.remove(cu);
								break;
							}
						}
						JOptionPane.showMessageDialog(jfmf, "Re-enter detail's");
						new Cusadd (techn,cust);
					}
					public void windowDeiconified(WindowEvent arg0) {	
					}
					public void windowIconified(WindowEvent arg0) {	
					}
					public void windowOpened(WindowEvent arg0) {
					}
				});
				
		
		
			}});
		
		tc = new JButton("Clear");
		tc.setBounds(44, 410, 97, 25);
		jfmf.getContentPane().add(tc);
		tc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jdg=new JDialog(jfmf,"enter name");
				jtf = new JTextField();
				jdg.add(jtf);
				jdg.setSize(200, 200);
				jdg.setVisible(true);
				jdg.addWindowListener(new WindowListener() {
					public void windowClosing(WindowEvent we) 
					{	
						nam=jtf.getText();
					}
					public void windowActivated(WindowEvent arg0) {	
					}
					public void windowClosed(WindowEvent arg0) {	
					}
					public void windowDeactivated(WindowEvent arg0) {	
						for(Technician te :techn)
						{
							if(te.name.equalsIgnoreCase(nam))
							{
								techn.remove(te);
								break;
							}
						}
					}
					public void windowDeiconified(WindowEvent arg0) {	
					}
					public void windowIconified(WindowEvent arg0) {	
					}
					public void windowOpened(WindowEvent arg0) {
					}
				});
				
		
		
		
			}});
		
		cc = new JButton("Clear");
		cc.setBounds(468, 410, 97, 25);
		jfmf.getContentPane().add(cc);
		cc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jdg=new JDialog(jfmf,"enter name");
				jtf = new JTextField();
				jdg.add(jtf);
				jdg.setSize(200, 200);
				jdg.setVisible(true);
				jdg.addWindowListener(new WindowListener() {
					public void windowClosing(WindowEvent we) 
					{	
						nam=jtf.getText();
					}
					public void windowActivated(WindowEvent arg0) {	
					}
					public void windowClosed(WindowEvent arg0) {	
					}
					public void windowDeactivated(WindowEvent arg0) {
						for(Customer cu :cust)
						{
							if(cu.name.equalsIgnoreCase(nam))
							{
								cust.remove(cu);
								break;
							}
						}
					}
					public void windowDeiconified(WindowEvent arg0) {	
					}
					public void windowIconified(WindowEvent arg0) {	
					}
					public void windowOpened(WindowEvent arg0) {
					}
				});
				
		
		
			}});
		
	}

}
