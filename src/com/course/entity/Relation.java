package com.course.entity;

public class Relation {
	private Integer id;
	private Integer grade;
	private String devtype;
	private String type;
	
	//Ĭ�Ϲ��캯��
	public Relation(){
		
	}
	
	public void setRelation (Relation temp) {
		this.id = temp.id;
		this.grade = temp.grade;
		this.devtype = temp.devtype;
		this.type = temp.type;
	}
	
	public Relation(Integer grade,String devtype,String type) {
		this.id = id;
		this.grade = grade;
		this.devtype = devtype;
		this.type = type;
	}
	
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	
	
	public String getDevtype() {
		return devtype;
	}
	public void setDevtype(String devtype) {
		this.devtype = devtype;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}

