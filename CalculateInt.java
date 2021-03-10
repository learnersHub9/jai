package com.jai;

public class CalculateInt {
	public double total;
	public double rate;
	public double totalint;
	CalculateInt(String Bname,double amount){
		
		BankInterest bnkInt=new BankInterest();
		if (Bname==null) {
			System.out.println("enter valid bank name");
			System.exit(0);
		}	
		else if(Bname.equalsIgnoreCase("SBI"))
			rate=bnkInt.SBI();
		else if(Bname.equalsIgnoreCase("ANDB"))
			rate=bnkInt.ANDB();
		else if(Bname.equalsIgnoreCase("INDIANBANK"))
			rate=bnkInt.IndianBank();
		else {
			System.out.println("enter above banks only");
			System.exit(0);
		}
		totalint=(rate*amount)/100;
		total=totalint+amount;
		
		
	
	}
	
	
	

}
