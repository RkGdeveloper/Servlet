package com.cg.bank.dto;

public class BankDetails {

	@Override
	public String toString() {
		return "BankDetails [uName=" + uName + ", phone=" + phone
				+ ", password=" + password + "]";
	}
	private String uName;
	private long phone;
	private String password;
	private String rePassword;
	
	
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRePassword() {
		return rePassword;
	}
	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}
	
	
}
