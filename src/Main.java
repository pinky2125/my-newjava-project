class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
class BankAccount {
	private String name;
	private double balance;
	
	BankAccount(String name,double balance){
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposited:  "+ amount);
	}
	
	public void withdraw(double amount)throws InsufficientBalanceException {
		if(amount <=0) {
			throw new InsufficientBalanceException("Invalid amount!");
		}
		if(amount > balance) {
			throw new InsufficientBalanceException("Insufficient Balance! ");
		}
		balance = balance - amount;
		System.out.println("Withdrawn : "+amount);
	}
	public void showBalance() {
		System.out.println("Balance: "+balance);
	}
	public void checkAccountHolder() {
	    System.out.println("Account Holder: " + name);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount acc1 = new BankAccount("Pinku",1000);
		BankAccount acc2 = new BankAccount("pinky",2000);
		
		try {
			acc1.checkAccountHolder();
			
			
			acc1.deposit(500);
			acc1.withdraw(300);
			acc1.withdraw(2000); //error part
			
		}catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
		
		
		acc2.checkAccountHolder();
		acc2.showBalance();
		acc2.deposit(500);
//		acc2.withdraw(200);
		acc2.showBalance();
		
		
		
	}

}
