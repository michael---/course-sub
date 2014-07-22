package com.course.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.client.HttpServerErrorException;

import com.course.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		
		HttpServletRequest request=ServletActionContext.getRequest();
		
		System.out.println(request.getCharacterEncoding());
		
		if("root".equals(user.getName()) && "11331048".equals(user.getPassword()))
		{
			Map<String, Object> session=ActionContext.getContext().getSession();
			session.put("user.name", user.getName());
			
			System.out.println("��¼�ɹ�,�û���=" + user.getName());
			return "success";
		}
		
		System.out.println("��¼ʧ�ܣ��û���=" + user.getName());
		return "fail";
	}
	
}
