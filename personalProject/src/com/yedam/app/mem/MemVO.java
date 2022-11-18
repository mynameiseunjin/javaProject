package com.yedam.app.mem;

public class MemVO {

	private String Man_num;
	private String Man_id;
	private String Man_pw;
	private String Man_name;
	private String Man_gender;
	private String Man_birth;
	private int Man_tel;

	public String getMan_num() {
		return Man_num;
	}

	public void setMan_num(String man_num) {
		Man_num = man_num;
	}

	public String getMan_id() {
		return Man_id;
	}

	public void setMan_id(String man_id) {
		Man_id = man_id;
	}

	public String getMan_pw() {
		return Man_pw;
	}

	public void setMan_pw(String man_pw) {
		Man_pw = man_pw;
	}

	public String getMan_name() {
		return Man_name;
	}

	public void setMan_name(String man_name) {
		Man_name = man_name;
	}

	public String getMan_gender() {
		return Man_gender;
	}

	public void setMan_gender(String man_gender) {
		Man_gender = man_gender;
	}

	public String getMan_birth() {
		return Man_birth;
	}

	public void setMan_birth(String man_birth) {
		Man_birth = man_birth;
	}

	public int getMan_tel() {
		return Man_tel;
	}

	public void setMan_tel(int man_tel) {
		Man_tel = man_tel;
	}

	@Override
	public String toString() {
		return "MemVO [Man_num=" + Man_num + ", Man_id=" + Man_id + ", Man_pw=" + Man_pw + ", Man_name=" + Man_name
				+ ", Man_gender=" + Man_gender + ", Man_birth=" + Man_birth + ", Man_tel=" + Man_tel + "]";
	}

}
