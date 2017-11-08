package com.internousdev.template.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.LoginDAO;
import com.internousdev.template.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
private String user_name;
private String login_pass;private LoginDTO loginDTO = new LoginDTO();
private LoginDAO loginDAO = new LoginDAO();
public Map<String,Object> session;

public String execute() {
	String result = ERROR;
	loginDTO = loginDAO.getUserInfo(user_name,login_pass);
	if(user_name.equals(loginDTO.getUser_name())){
		if(login_pass.equals(loginDTO.getLogin_pass())){
			result = SUCCESS;

			session.put("loginDTO",loginDTO);
			return result;
		}
	}
	return result;
}


@Override
public void setSession(Map<String, Object> arg0) {
	// TODO 自動生成されたメソッド・スタブ

}
}
