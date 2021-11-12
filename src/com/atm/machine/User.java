package com.atm.machine;

public class User {
	
	private long id;
	private String name;
	private String password;
	private double amount;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public User(long id, String name, String password, double amount) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.amount = amount;
	}
	public User(String name, String password, double amount) {
		super();
		this.name = name;
		this.password = password;
		this.amount = amount;
	}
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", amount=" + amount + "]";
	}
	
	

}
