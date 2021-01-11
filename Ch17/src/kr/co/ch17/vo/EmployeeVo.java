package kr.co.ch17.vo;

public class EmployeeVo {
	// VO(Value Object) 객체
	//  - Model2에서 사용하는 Bean객체
	//  - Model2 컴포넌트간의 데이터 전달에 사용되는 객체
	private String uid;
	private String name;
	private int    gender;
	private String hp;
	private String email;
	private String pos;
	private int    dep;
	private String rdate;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGender() {
		return gender;
	}
	
	public void setGender(int gender) {
		this.gender = gender;
	}
	public void setGender(String gender) {
		this.gender = Integer.parseInt(gender);
	}
	
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public int getDep() {
		return dep;
	}
	public void setDep(int dep) {
		this.dep = dep;
	}
	public void setDep(String dep) {
		this.dep = Integer.parseInt(dep);
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
}
