package com.course.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
 

import org.hibernate.criterion.Restrictions;

import com.course.dao.ICoursetypeDao;
import com.course.entity.Coursetype;

public class CoursetypeDaoImp implements ICoursetypeDao {
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void addCoursetype(Coursetype coursetype) {
		getSession().save(coursetype);
		getSession().flush();
	}
	
	@Override
	public void deleteCoursetype(Coursetype coursetype){
		//根据主键查找 时，可以使用get()和load()方法 
		//Coursetype coursetype = (Coursetype)sessionFactory.getCurrentSession().get(Coursetype.class, id);
		//sessionFactory.getCurrentSession().delete(coursetype);
		
		//根据非主键查找时，使用hql/Criteria
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Coursetype.class);
		//eq:=;lt:<；。。。。
		criteria.add(Restrictions.eq("id", coursetype.getId()));
		//criteria.add(Restrictions.eq("type", type));
		
		coursetype = (Coursetype)criteria.uniqueResult();
		sessionFactory.getCurrentSession().delete(coursetype);
	}
	
	
	@Override
	public void modifyCoursetype(Coursetype coursetype) {
		//根据主键修改
		//getSession().clear();
		//sessionFactory.getCurrentSession().update(coursetype);
		
		//根据非主键修改，hql方法见梁炎的部分，这里改用Criteria
		//Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Coursetype.class);
		//criteria.add(Restrictions.eq("id", coursetype.getId()));
		
		Query query = sessionFactory.getCurrentSession().createQuery("from Coursetype where id=?");
		query.setInteger(0, coursetype.getId());
		Coursetype costype = (Coursetype )query.uniqueResult();
		costype.setCoursetype(coursetype);		
	}
	
	@Override
	public List<Coursetype> getAllCoursetypes(){
		Query query = sessionFactory.getCurrentSession().createQuery("from Coursetype");
		return query.list();
	}
	



}
