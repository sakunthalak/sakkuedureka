package day4;



public class DemoGuru99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
			guru99Project ch=new guru99Project();
			
			ch.InvokeBrowser();
			ch.login("mngr155143", "UhyzEvU");
			ch.AddCustomer();
			ch.AddNewCustomer();
	String customerId = ch.getCustomerID();
			
			System.out.println("Customer Id :: "+ customerId);

			ch.getCustomerID();
			ch.addNewAccount(customerId, "Current");

		}


	}

