package com.course.service;

import com.course.entity.Relation;

import java.util.List;


public interface IRelationManage {
	public void modifyRelation(Relation relation);
	
	
	
	public List<Relation> getAllRelations();
	public List<Relation> findByGrade(Relation relation);
	
	//test
	public void addRelation(Relation relation);
}
