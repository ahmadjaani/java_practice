package com.collabera.assignments;

public class Account {

	private long accNum;
	private double balance;
	private Person accHolder;

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void deposit(long amount) {
		this.balance += amount;
	}

	public void withdraw(long amount) {
		if ((balance-amount) >= 500) {
			this.balance -= amount;
		}
		else {
			System.out.println("Insufficient Balance!");
		}
	}

}
