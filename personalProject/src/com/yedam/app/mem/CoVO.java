package com.yedam.app.mem;

public class CoVO {

	private String Co_code;
	private String Co_name;
	private String Co_teacher;
	private String Co_date;
	private String Co_price;
	
	
	public String getCo_code() {
		return Co_code;
	}
	public void setCo_code(String co_code) {
		Co_code = co_code;
	}
	public String getCo_name() {
		return Co_name;
	}
	public void setCo_name(String co_name) {
		Co_name = co_name;
	}
	public String getCo_teacher() {
		return Co_teacher;
	}
	public void setCo_teacher(String co_teacher) {
		Co_teacher = co_teacher;
	}
	public String getCo_date() {
		return Co_date;
	}
	public void setCo_date(String co_date) {
		Co_date = co_date;
	}
	public String getCo_price() {
		return Co_price;
	}
	public void setCo_price(String co_price) {
		Co_price = co_price;
	}
	@Override
	public String toString() {
		return "CoVO [Co_code=" + Co_code + ", Co_name=" + Co_name + ", Co_teacher=" + Co_teacher + ", Co_date="
				+ Co_date + ", Co_price=" + Co_price + ", getCo_code()=" + getCo_code() + ", getCo_name()="
				+ getCo_name() + ", getCo_teacher()=" + getCo_teacher() + ", getCo_date()=" + getCo_date()
				+ ", getCo_price()=" + getCo_price() + ", getClass()=" + "]";
	}
	
	
	
	
	
	
}
