package CQS_Installers;

import java.awt.*;
import javax.swing.*;


public class Cusdetails {

	JFrame jfcd;
	
	
	public Cusdetails(String[][] arry) {
		
		
		
		jfcd = new JFrame();
		jfcd.getContentPane().setBackground(Color.CYAN);
		jfcd.setBounds(100, 100, 650, 520);
		jfcd.setVisible(true);
		//jfcd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		String[] str = {"Name","Address","Watt Power of sp","Installation","Solar Tracker","Start","End","Tec Name"};
		JTable details = new JTable(arry,str);
		JScrollPane jsp = new JScrollPane(details);
		jfcd.add(jsp);
	}

	
}
