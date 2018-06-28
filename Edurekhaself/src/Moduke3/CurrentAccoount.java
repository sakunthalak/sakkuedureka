package Moduke3;

final class  Current extends Account{

	double intrest;
	final int minimum=1000;
	 void Deposit(int deposit) {
		 Amount=Amount+deposit;
		 		 	 
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
