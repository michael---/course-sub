package com.course.service;

import javax.annotation.Resource;

import java.util.List;

import com.course.dao.IRelationDao;
import com.course.entity.Relation;


public class RelationManageImp implements IRelationManage {

	@Resource
	private IRelationDao relationDao;

	public IRelationDao getRelationDao() {
		return relationDao;
	}

	public void setRelationDao(IRelationDao relationDao) {
		this.relationDao = relationDao;
	}
	
	
	@Override
	public void modifyRelation(Relation relation) {
		relationDao.modifyRelation(relation);
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List getAllRelations() {
		return relationDao.getAllRelations();
	}
	
	
	//test
	@Override
	public void addRelation(Relation relation) {
		relationDao.addRelation(relation);
	}
}
