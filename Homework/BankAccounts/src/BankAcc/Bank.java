package BankAcc;

import customers.*;

public abstract class Bank {

	public double balance;
	private double interestRate;
	private Customer customer;
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Bank(double balance,double interestRate,Customer customer ) {
		setBalance(balance);
		setInterestRate(interestRate);
		setCustomer(customer);
	}
	
	public  void deposit(double sum){
		this.balance+=sum;
		System.out.printf("Succsesuful deposit! \n Sum=%s \n Ammount=%s \n",sum,this.balance);
	}
	
	public double calcInterestAmount(double months){
		double interest=this.interestRate;
		interest*=months;
		return interest;
	}
	
}
