package CQS_Installers;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Cusadd {

	JFrame jfca;
	JLabel lc,ln,la,lw,li,lst,ls,le,lt;
	JTextField tfn,tfa,tfw,tfs,tfe,tft;
	JButton bb,bs,ba;
	JRadioButton ong,ofg,sa,da,st;
	ButtonGroup bgg,bgst;
	Technician tec;
	String in,sot;
	ArrayList<Technician> teal;
	ArrayList<Customer> cmer;
	
	Cusadd(ArrayList<Technician> ta,ArrayList<Customer> cm)
	{
		teal=ta;
		cmer=cm;
		
		jfca = new JFrame();
		jfca.getContentPane().setBackground(Color.ORANGE);
		jfca.setBounds(100, 100, 650, 520);
		jfca.setVisible(true);
		jfca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfca.getContentPane().setLayout(null);
		
		lc = new JLabel("Customer");
		lc.setBackground(Color.RED);
		lc.setFont(new Font("Tahoma", Font.BOLD, 30));
		lc.setBounds(188, 13, 179, 29);
		jfca.getContentPane().add(lc);

		ln = new JLabel("Name :");
		ln.setFont(new Font("Tahoma", Font.BOLD, 18));
		ln.setBounds(36, 78, 85, 16);
		jfca.getContentPane().add(ln);

		tfn = new JTextField();
		tfn.setBounds(118, 70, 471, 29);
		jfca.getContentPane().add(tfn);
		tfn.setColumns(10);

		la = new JLabel("Address :");
		la.setFont(new Font("Tahoma", Font.BOLD, 18));
		la.setBounds(22, 119, 85, 16);
		jfca.getContentPane().add(la);

		tfa = new JTextField();
		tfa.setBounds(118, 113, 471, 29);
		jfca.getContentPane().add(tfa);
		tfa.setColumns(10);

		lw = new JLabel("Watt Power of sp :");
		lw.setFont(new Font("Tahoma", Font.BOLD, 20));
		lw.setBackground(new Color(240, 240, 240));
		lw.setBounds(22, 173, 196, 39);
		jfca.getContentPane().add(lw);

		tfw = new JTextField();
		tfw.setBounds(230, 184, 137, 22);
		jfca.getContentPane().add(tfw);
		tfw.setColumns(10);

		li = new JLabel("Installation :");
		li.setFont(new Font("Tahoma", Font.BOLD, 20));
		li.setBounds(24, 240, 144, 29);
		jfca.getContentPane().add(li);

		bgg = new ButtonGroup();

		ong = new JRadioButton("On Grid");
		ong.setBounds(211, 221, 127, 25);
		bgg.add(ong);
		jfca.getContentPane().add(ong);


		ofg = new JRadioButton("Off Grid");
		ofg.setBounds(211, 251, 127, 25);
		bgg.add(ofg);
		jfca.getContentPane().add(ofg);

		lst = new JLabel("Solar Tracker");
		lst.setFont(new Font("Tahoma", Font.BOLD, 20));
		lst.setBounds(427, 187, 168, 25);
		jfca.getContentPane().add(lst);
		
		bgst = new ButtonGroup();

		sa = new JRadioButton("Single axis");
		sa.setBounds(427, 221, 127, 25);
		bgst.add(sa);
		jfca.getContentPane().add(sa);

		da = new JRadioButton("Dual axis");
		da.setBounds(427, 261, 127, 25);
		bgst.add(da);
		jfca.getContentPane().add(da);

		st = new JRadioButton("Stationary");
		st.setBounds(427, 301, 127, 25);
		bgst.add(st);
		jfca.getContentPane().add(st);

		lt = new JLabel("Technician :");
		lt.setFont(new Font("Tahoma", Font.BOLD, 20));
		lt.setBounds(22, 348, 146, 29);
		jfca.getContentPane().add(lt);

		tft = new JTextField();
		tft.setBounds(157, 354, 448, 29);
		jfca.getContentPane().add(tft);
		tft.setColumns(10);

		bs = new JButton("Submit");
		bs.setBounds(483, 396, 97, 25);
		jfca.getContentPane().add(bs);
		bs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				ba.setVisible(true);
				for(Technician tc:teal)
				{
					if(tc.name.equalsIgnoreCase(tft.getText()))
					{
						tec=tc;
						break;
					}
				}
				if(ong.isSelected())
				{
					in="OnGrid";
				}
				else if(ofg.isSelected())
				{
					in="OffGrid";
				}
				if(sa.isSelected())
				{
					sot="SingleAxis";
				}
				else if(da.isSelected())
				{
					sot="DualAxis";
				}
				else if(st.isSelected())
				{
					sot="Stationary";
				}
				Customer as=new Customer(tfn.getText(),tfa.getText(),tfw.getText(),in,sot,tfs.getText(),tfe.getText(),tec);
				cmer.add(as);
			}
		});

		ba = new JButton("ADD");
		ba.setBounds(483, 434, 97, 25);
		jfca.getContentPane().add(ba);
		ba.setVisible(false);
		ba.addActionListener(new ActionListener()
				{

					public void actionPerformed(ActionEvent e) {
						jfca.dispose();
						new Cusadd(teal,cmer);
						
					}
			
				});

		bb = new JButton("Back");
		bb.setBounds(22, 415, 97, 25);
		jfca.getContentPane().add(bb);
		bb.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent e) {
				jfca.dispose();
				new Mainframe(teal,cmer);
			}
	
		});

		ls = new JLabel("Start :");
		ls.setFont(new Font("Tahoma", Font.BOLD, 15));
		ls.setBounds(22, 291, 56, 16);
		jfca.getContentPane().add(ls);

		le = new JLabel("End :");
		le.setFont(new Font("Tahoma", Font.BOLD, 15));
		le.setBounds(32, 320, 36, 16);
		jfca.getContentPane().add(le);

		tfs = new JTextField();
		tfs.setBounds(77, 289, 116, 22);
		jfca.getContentPane().add(tfs);
		tfs.setColumns(10);

		tfe = new JTextField();
		tfe.setBounds(77, 320, 116, 22);
		jfca.getContentPane().add(tfe);
		tfe.setColumns(10);
		
	}
	
}
