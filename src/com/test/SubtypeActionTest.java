package com.test;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.course.dao.ISubtypeDao;
import com.course.entity.Subtype;

public class SubtypeActionTest {

	private static ISubtypeDao subtypeDao;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("/config/applicationContext.xml");
		subtypeDao = (ISubtypeDao) ctx.getBean("subtypeDao");
	}

	
	@Test
	public void addSubtype() {
		//subtypeDao.addSubtype(new Subtype(null, "�γ����ϸ����5", "����ͨʶ","��ѡ","��","��Ժ"));
	}
	
	
	/*
	@Test
	public void modifySubtype() {
		subtypeDao.modifySubtype(new Subtype(2,"���ϸ����9", "һ��ͨʶ","��ѡ","��","��Ժ"));
		System.out.println("test");
	}
	*/
	
	/*
	@Test
	public void deleteSubtype() {
		subtypeDao.deleteSubtype(97);
	}
	*/
	
	@Test
	public void getAllSubtypes() {
		List<Subtype> list = subtypeDao.getAllSubtypes();
		System.out.println("<-- getAllSubtypes() -->");
		System.out.println(list.size());
		for(int i=0;i<list.size();i++){
			System.out.println( list.get(i).getId()+"\t"+list.get(i).getSubtypecode()+"\t"+list.get(i).getSubtypename()+
					"\t"+list.get(i).getBelongtotype()+"\t"+list.get(i).getIspublicsubtype()+"\t"+list.get(i).getDepartment()+"\n");
		}
	}
	
}
