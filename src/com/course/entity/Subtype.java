package com.course.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sub_type")
public class Subtype {
	private int id;				//���
	private String subtypecode;		//�γ�ϸ����
	private String subtypename;		//�γ�ϸ����
	private String belongtotype;	//�����γ����
	private String ispublicsubtype;	//�Ƿ񹫹�ϸ��
	private String department;		//������λ
	/*
	public Subtype(Integer id,String subtypecode,String subtypename,String belongtotype,String ispublicsubtype,String department){
		this.id = id;
		this.subtypecode = subtypecode;
		this.subtypename = subtypename;
		this.belongtotype = belongtotype;
		this.ispublicsubtype = ispublicsubtype;
		this.department = department;
	}
	*/
	@Column(name="subtypecode", length=10, nullable=false)
	public String getSubtypecode(){
		return subtypecode;
	}
	
	public void setSubtypecode(String subtypecode) {
		this.subtypecode = subtypecode;
	}
	
	@Column(name="subtypename", length=30, nullable=false)
	public String getSubtypename() {
		return subtypename;
	}
	
	public void setSubtypename(String subtypename) {
		this.subtypename = subtypename;
	}
	
	@Column(name="belongtotype", length=30, nullable=false)
	public String getBelongtotype() {
		return belongtotype;
	}
	
	public void setBelongtotype(String belongtotype) {
		this.belongtotype = belongtotype;
	}
	
	@Column(name="ispublicsubtype", length=10, nullable=false)
	public String getIspublicsubtype() {
		return ispublicsubtype;
	}
	
	public void setIspublicsubtype(String ispublicsubtype) {
		this.ispublicsubtype = ispublicsubtype;
	}
	
	@Column(name="department", length=10, nullable=false)
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Id
	//�������ݿ�������ʽ��������
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
