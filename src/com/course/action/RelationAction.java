package com.course.action;

import javax.annotation.Resource;

import com.course.entity.Relation;
import com.course.service.IRelationManage;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

public class RelationAction extends ActionSupport {
	
	private Relation relation;
	
	private List<Relation> relations;
		
	@Resource
	private IRelationManage relationManage;

	public Relation getRelation() {
		return relation;
	}

	public void setRelation(Relation relation) {
		this.relation = relation;
	}

	public List<Relation> getRelations() {
		return relations;
	}

	public void setRelations(List<Relation> relations) {
		this.relations = relations;
	}

	public IRelationManage getRelationManage() {
		return relationManage;
	}

	public void setRelationManage(IRelationManage relationManage) {
		this.relationManage = relationManage;
	}
	
	
	/*   -----------------     �ָ���          -----------------------*/
	
	

	public String getAllRelations() {
		//relationManage.getAllRelations(relation);
		relations = relationManage.getAllRelations();
		return "success";
	}

	public String modifyRelation() {
		relationManage.modifyRelation(relation);
		return "success";
	}
	
	public String addRelation() {
		relationManage.addRelation(relation);
		return "success";
	}
		
	public String findByGrade() {
		relations = relationManage.findByGrade(relation);
		return "success";
	}
}
