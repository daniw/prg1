package formaladdress;

import formaladdress.FormalAddress;

public class Main
{
	public static void main(String[] args)
	{
		FormalAddress me = new FormalAddress("Daniel", "Winz", 1991, true);
		System.out.println(me.createFormalFormOfAddress(2013));
		System.out.println(me.createFormalFormOfAddress());
	}
}
