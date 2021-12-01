package com.app.core;

import static util.AccountValidations.validateBalance;
import java.time.LocalDate;

public class BankAccount {
	private int accNo;
	private String custName;
	private AccountType type;
	private double balance;
	private LocalDate createDate;
	public BankAccount(int accNo, String custName, AccountType type, double balance, LocalDate createDate) {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.type = type;
		this.balance = balance;
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", custName=" + custName + ", type=" + type + ", balance=" + balance
				+ ", createDate=" + createDate + "]";
	}
	
	
	//Bussiness Logicc :deposit,withdraw,transferFund
	
	public void deposit(double amount)
	{
		balance+=amount;
	}	
	
	public void withdraw(double amount)
	{
		validateBalance(balance-amount);
		balance-=amount;
		
	}
	
	public void transferFund(BankAccount dest,double amount)
	{
		this.withdraw(amount);
		dest.deposit(amount);
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public AccountType getType() {
		return type;
	}
	public void setType(AccountType type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	
	
	
	
}
