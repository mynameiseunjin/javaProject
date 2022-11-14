package com.yedam.chapter11;

public class Member {
	
	public String id;
	public String id2;
	public String id3;
	public String id4;
	public String id5;
	public String id6;
	public String id7;
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", id2=" + id2 + ", id3=" + id3 + ", id4=" + id4 + ", id5=" + id5 + ", id6=" + id6
				+ ", id7=" + id7 + "]";
	}

	
	
	
	
	
	
	
	
	public String id;
	
	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		//object obj = new Member("blue")
	
		Member member = (Member) obj; //강제 타입 변환
		//Member member = new Member("blue")
		
		if(id.equals(member.id)) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		//String a = "1"; // 만약 a 가 10번지에 있다.
		//String b = "1";  // 그럼 b도 같은 10번지에 있는것.
					//string은 같은 값(리터럴)을 갖고있으면 같은 주소값으로 인식.
		return id.hashCode();
	}
	
	
	
	
} 
