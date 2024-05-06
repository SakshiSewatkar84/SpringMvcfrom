package com.BankApplication.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BankModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer acnumber;
	private String name;
	private String address;
	private String branch;
	private Integer amount;
	public BankModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankModel(Integer acnumber, String name, String address, String branch, Integer amount) {
		super();
		this.acnumber = acnumber;
		this.name = name;
		this.address = address;
		this.branch = branch;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "BankModel [acnumber=" + acnumber + ", name=" + name + ", address=" + address + ", branch=" + branch
				+ ", amount=" + amount + "]";
	}
	public Integer getAcnumber() {
		return acnumber;
	}
	public void setAcnumber(Integer acnumber) {
		this.acnumber = acnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	

}
