package com.course.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.course.dao.ICoursetypeDao;
import com.course.entity.Coursetype;
import com.course.service.ICoursetypeManage;

public class CoursetypeManageImp implements ICoursetypeManage {
	
	@Resource
	private ICoursetypeDao coursetypeDao;
	
	public ICoursetypeDao getCoursetypeDao() {
		return coursetypeDao;
	}
	
	public void setCoursetypeDao (ICoursetypeDao coursetypeDao) {
		this.coursetypeDao = coursetypeDao;
	}
	
	@Override
	public void addCoursetype(Coursetype coursetype) {
		//System.out.println("ctmIMP"+coursetype.getQuality());
		coursetypeDao.addCoursetype(coursetype);
	}
	
	@Override
	public void deleteCoursetype (Coursetype coursetype) {
		coursetypeDao.deleteCoursetype (coursetype);
	}
	
	@Override
	public void modifyCoursetype (Coursetype coursetype) {
		coursetypeDao.modifyCoursetype (coursetype);
	}
	
	@Override
	public List<Coursetype> getAllCoursetypes() {
		return coursetypeDao.getAllCoursetypes();
	}
	
}
