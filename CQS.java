package CQS_Installers;


import java.util.*;

public class CQS {

	public static void main(String[] args) {
		try
		{
			ArrayList <Technician> techn = new ArrayList<Technician>();
			ArrayList <Customer> cust = new ArrayList<Customer>();
			new Welcome(techn,cust);
			
		}
		catch(Exception e)
		{
			//not handled
		}

	}

}
