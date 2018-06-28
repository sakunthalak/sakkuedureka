package Moduke3;



final class  SBAccount extends Account{

	double intrest;
	final int minimum=500;
	 void Deposit(int deposit) {
		 Amount=Amount+deposit;
		 		 	 
	 }
	 
	 void intrest() {
		 Amount=Amount*0.4;
	 }
	 void WithDrawl(int withdraw) {
		 Amount=Amount-withdraw;
	 }
	
	 
	void creation() {
		System.out.println("Enter your name");
		AccountName=bank.next();  
		System.out.println("Enter Age");
		int age=bank.nextInt();
		System.out.println("Eneter Adress");
		String Adress=bank.next();
		System.out.println("Enter Deposit amount");
		Amount=bank.nextFloat();
		
		
	}
	
	

}
