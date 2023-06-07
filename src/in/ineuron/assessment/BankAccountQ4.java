package in.ineuron.assessment;

import java.util.Scanner;

public class BankAccountQ4 {

	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		BankAccount ba=new BankAccount();
		while(true){
			System.out.println("***********MENU**************");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Balance");
			System.out.println("4. Exit");
			System.out.println("Enter choice between 1 and 4");
			int choice=s.nextInt();
			switch (choice) {
			case 1: 
				System.out.println("Enter amount to be deposited");
				int amount= s.nextInt();
				ba.deposit(amount);
				break;
			case 2:
				System.out.println("Enter amount to withdraw");
				int withdrawAmount= s.nextInt();
				ba.withDraw(withdrawAmount);
				break;
			case 3:
				ba.checkBalance();
				break;
			case 4:
	            System.out.println("Thank you for using the Bank Account Simulator. Goodbye!");
	            System.exit(0);
	        default:
	            System.out.println("Invalid choice. Please try again.");
			}
		}
		
		
	}
}

class BankAccount{
	
	private double balance;
	BankAccount(){
		balance=0.0;
	}
	
	public void checkBalance() {
		System.out.println("Your account balance is: "+this.balance);
	}

	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
			System.out.println("Amount added successfully.....");
		}else {
			System.out.println("Invalid ammount entered....");
		}
	}
	
	public void withDraw(double amount) {
		if(amount>0) {
			if(balance>=amount) {
				balance-=amount;
				System.out.println("Successfuly debited.....");
			}else {
				System.out.println("Insufficient balance.....");
			}
		}else {
			System.out.println("Invalid ammount entered....");
		}
	}
}
