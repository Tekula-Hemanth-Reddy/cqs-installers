package CQS_Installers;



public class Customer {
	
	String name;
	String address;
	String wps;
	String ins;
	String solar;
	String start;
	String end;
	Technician tec;

	public Customer(String n,String a,String w,String i,String so,String s,String e,Technician t) {
		name=n;
		address=a;
		wps=w;
		ins=i;
		solar=so;
		start=s;
		end=e;
		tec=t;
	}

}
