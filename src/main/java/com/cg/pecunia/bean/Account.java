package com.cg.pecunia.bean;

public class Account {
	String accountNumber;
	String accountName;
	String accountName2;
	double accountBalance;
	String accountAadhar;
	String accountPan;
	String accountDob;
	Address accountAddress;
	String accountGender;
	String accountContact;
	public Account() {
		super();
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountAadhar() {
		return accountAadhar;
	}
	public void setAccountAadhar(String accountAadhar) {
		this.accountAadhar = accountAadhar;
	}
	public String getAccountPan() {
		return accountPan;
	}
	public void setAccountPan(String accountPan) {
		this.accountPan = accountPan;
	}
	public String getAccountDob() {
		return accountDob;
	}
	public void setAccountDob(String accountDob) {
		this.accountDob = accountDob;
	}
	public Address getAccountAddress() {
		return accountAddress;
	}
	public void setAccountAddress(Address accountAddress) {
		this.accountAddress = accountAddress;
	}
	public String getAccountGender() {
		return accountGender;
	}
	public void setAccountGender(String accountGender) {
		this.accountGender = accountGender;
	}
	public String getAccountContact() {
		return accountContact;
	}
	public void setAccountContact(String accountContact) {
		this.accountContact = accountContact;
	}
	public String getAccountName2() {
		return accountName2;
	}
	public void setAccountName2(String accountName2) {
		this.accountName2 = accountName2;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", firstName=" + accountName + ", lastName="
				+ accountName2 + ", accountBalance=" + accountBalance + ", accountAadhar=" + accountAadhar
				+ ", accountPan=" + accountPan + ", accountDob=" + accountDob + ", accountAddress=" + accountAddress
				+ ", accountGender=" + accountGender + ", accountContact=" + accountContact + "]";
	}
	
	
	

}
