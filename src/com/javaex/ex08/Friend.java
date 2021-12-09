package com.javaex.ex08;

public class Friend {

	// 필드
	private String name;
	private String hp;
	private String schoolName;

	// 생성자
	public Friend() {
	}

	public Friend(String name, String hp, String schoolName) {
		this.name = name;
		this.hp = hp;
		this.schoolName = schoolName;
	}

	// 메소드-g/s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	// 메소드-일반
	@Override
	public String toString() {
		return "Friend [name=" + name + ", hp=" + hp + ", schoolName=" + schoolName + "]";
	}

}
