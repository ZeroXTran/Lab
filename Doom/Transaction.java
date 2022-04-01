import java.text.NumberFormat;

public class Transaction {

	public static void main(String[] args) {
		Account acct1 = new Account("Bob", 10,100.00);
		Account acct2 = new Account("Sam");
		
		 Account.close(acct1); 
		 System.out.println(acct1);
	    acct2.deposit(100.00);
	    
	    acct2.withdraw(50);
	    
	    acct2.withdraw(10, 1);
	   

	  acct2.addInterest();
	  System.out.println(acct2);
	  
		
	   acct2.addInterest(5.0);
	   
		
	   acct2.addInterest(3.0);
	  

	   System.out.println(acct2.getBalance());
	   
	   Account.join(acct1,acct2); 

	    
		
		/*
		public void test() {
			Transactions.accountsOutput(this, new Account("Tim"), new Account("Bob"));
		}
		*/
		
		 Account.reset( acct1); 
		

	}

}
