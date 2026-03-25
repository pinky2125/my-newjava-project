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
	
	public void withdraw(double amount) {
		if(amount <=balance) {
			balance = balance - amount;
			System.out.println("Withdrawn : "+amount);
		}else {
			System.out.println("Insufficient Balance");
		}
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
		acc1.checkAccountHolder();
		acc1.showBalance();
		acc1.deposit(500);
		acc1.withdraw(300);
		acc1.showBalance();
		acc2.checkAccountHolder();
		acc2.showBalance();
		acc2.deposit(500);
		acc2.withdraw(200);
		acc2.showBalance();
		
		
		
	}

}
