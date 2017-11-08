package com.internousdev.template.dto;

public class LoginDTO {

	private String login_id;

	private boolean login_Flg;

	private String login_pass;

	private String user_name;

	private String user_id;

	public String getLogin_pass() {
		return login_pass;
	}
//DTOの値の書き方。
	public void setLogin_pass(String login_pass) {
		this.login_pass = login_pass;
	}

	public String getLogin_id() {
		return login_id;
	}

	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
public String getUser_id(){
	return login_id;

}



public void setUser_id(String string) {
	this.user_name=string;

}
public boolean getLogin_flg() {
	return login_Flg;
}



public void setLoginFlg(boolean b) {
	// TODO 自動生成されたメソッド・スタブ

}
}


