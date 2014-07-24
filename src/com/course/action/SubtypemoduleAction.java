package com.course.action;

import java.util.List;

import javax.annotation.Resource;

import com.course.entity.Subtypemodule;
import com.course.service.ISubtypemoduleManage;
import com.opensymphony.xwork2.ActionSupport;

public class SubtypemoduleAction extends ActionSupport  {
	
	public List<Subtypemodule> getAllsubtypemodules() {
		return allsubtypemodules;
	}

	public void setAllsubtypemodules(List<Subtypemodule> allsubtypemodules) {
		this.allsubtypemodules = allsubtypemodules;
	}

	public ISubtypemoduleManage getSubtypemoduleM() {
		return SubtypemoduleM;
	}

	public void setSubtypemoduleM(ISubtypemoduleManage subtypemoduleM) {
		SubtypemoduleM = subtypemoduleM;
	}

	private Subtypemodule subtypemodule;
	private List<Subtypemodule> allsubtypemodules;
	private Integer id;
	
	@Resource
	private ISubtypemoduleManage SubtypemoduleM;

	public void setISubtypemoduleM (ISubtypemoduleManage subtypemoduleM) {
		this.SubtypemoduleM = subtypemoduleM;
	}
	
	public ISubtypemoduleManage getISubtypemoduleM() {
		return SubtypemoduleM;
	}
	
	
	public Subtypemodule getSubtypemodule() {
		return subtypemodule;  
	}

	public void setSubtypemodule(Subtypemodule subtypemodule) {
		this.subtypemodule = subtypemodule;
	}

	public List<Subtypemodule> getSubtypemodules() {
		return allsubtypemodules;
	}

	public void setSubtypemodules(List<Subtypemodule> subtypemodules) {
		this.allsubtypemodules = subtypemodules;
	}
	
	public String addSubtypemodule()
	{		
		System.out.println("print "+subtypemodule.getId()+subtypemodule.getModule_name());
		SubtypemoduleM.addSubtypemodule(subtypemodule);	
		return "success";
	}
	
	public String deleteSubtypemodule()
	{
		SubtypemoduleM.deleteSubtypemodule(id);
		return "success";
	}

	public String modifySubtypemodule()
	{
		SubtypemoduleM.modifySubtypemodule(subtypemodule);
		return "success";
	}
	
	public String getAllSubtypemodules(){
		allsubtypemodules = SubtypemoduleM.getAllSubtypemodules();
		return "allsubtypemodule";
	}
	
}
