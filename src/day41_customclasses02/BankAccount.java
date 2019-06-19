package day41_customclasses02;

public class BankAccount {
	double balance;
	String accountHolder;
	int accountNumber;
	
	public void deposit(double amount) {
		System.out.println("Depoisiting $"+amount+" to "+ accountNumber);
		balance+=amount;

	}
	public void withdraw(double amount) {
		System.out.println("Withdrawing $"+amount+" from "+accountHolder);
		balance-=amount;
		if(balance<0) {
			balance-=35;
		}
	}
	public void showBalance() {
		System.out.println("======");
		System.out.println("Account holder is " + accountHolder);
		System.out.println("Account number: "+ accountNumber);
		System.out.println("Balance: $"+balance);
		System.out.println("Thank you!");
	}
	public void charge(double price, String item) {
		if(balance>=price) {
			System.out.println("Buying "+item+" for $"+price+" from "+accountNumber);
			balance-=price;
		}else {
			System.out.println("Insufficient funds to purchase "+ item+ " from account "+accountNumber); 
		}
		
	}
}
