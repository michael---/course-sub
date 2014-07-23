package com.course.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
 

import org.hibernate.criterion.Restrictions;

import com.course.entity.Subtype;

public class SubtypeDaoImp implements ISubtypeDao {

	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void addSubtype(Subtype subtype) {
		this.getSession().save(subtype);
		
	}
	
	@Override
	public void deleteSubtype(Integer id){
		
		System.out.println(id);
		
		Subtype subtype = (Subtype)getSession().get(Subtype.class, id);
		getSession().delete(subtype);
		
		/*
		Criteria criteria = getSession().createCriteria(Subtype.class);
		criteria.add(Restrictions.eq("id", subtype.getId()));	
		subtype = (Subtype)criteria.uniqueResult();
		getSession().delete(subtype);
		*/
	}
	
	@Override
	public void modifySubtype(Subtype subtype) {
		getSession().update(subtype);
		/*
		Criteria criteria = getSession().createCriteria(Subtype.class);
		criteria.add(Restrictions.eq("id", subtype.getId()));
		*/
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Subtype> getAllSubtypes(){
		String hql = "from Subtype";
		Query query = getSession().createQuery(hql);
		return query.list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Subtype> findBySubtypename(String name){ 
		String hql = "from Subtype where subtypename like ?";
		Query query = getSession().createQuery(hql);
		query.setString(0, "%"+name+"%");
		return query.list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Subtype> findByBelongtotype(String name){ 
		String hql = "from Subtype where belongtotype like ?";
		Query query = getSession().createQuery(hql);
		query.setString(0, "%"+name+"%");
		return query.list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Subtype> findByDepartment(String name){ 
		String hql = "from Subtype where department like ?";
		Query query = getSession().createQuery(hql);
		query.setString(0, "%"+name+"%");
		return query.list();
	}
	
}
