package CQS_Installers;

import java.awt.*;
import javax.swing.*;


public class Tecdetails {
	
	JFrame jftd;
	
	Tecdetails(String[][] tecdet)
	{
		
		jftd = new JFrame();
		jftd.getContentPane().setBackground(Color.CYAN);
		jftd.setBounds(100, 100, 650, 520);
		jftd.setVisible(true);
		//jftd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String[] str= {"Name","Phone number","Address"};
		JTable details = new JTable(tecdet,str);
		JScrollPane jsp = new JScrollPane(details);
		jftd.add(jsp);
	}
	
}
