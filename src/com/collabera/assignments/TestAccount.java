package com.collabera.assignments;

public class TestAccount {

	public static void main(String[] args) {
		Account smith = new Account();
		smith.setAccNum((long) (Math.random()) * 50 + 1);
		smith.setAccHolder(new Person("Smith", 22));
		smith.setBalance(2000);

		Account kathy = new Account();
		kathy.setAccNum((long) (Math.random()) * 50 + 1);
		kathy.setAccHolder(new Person("Kathy", 24));
		kathy.setBalance(3000);

		smith.deposit(1000);
		kathy.deposit(2000);

		System.out.println("After Deposit Kathy Balance : " + kathy.getBalance());
		System.out.println("After Deposit Smith Balance: " + smith.getBalance());
		
		smith.withdraw(500);
		kathy.withdraw(4600);
		
		System.out.println("After Withdraw Kathy Balance : " + kathy.getBalance());
		System.out.println("After Withdraw Smith Balance: " + smith.getBalance());

	}

}
//min balance 500
