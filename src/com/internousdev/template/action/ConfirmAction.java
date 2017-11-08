package com.internousdev.template.action;

import com.opensymphony.xwork2.ActionSupport;

public class ConfirmAction extends ActionSupport{
    // public boolean login;
    public String login;



		public String execute(){

			   String	result = ERROR;
           if(!(login=="loginsuccess")){
        	 result =SUCCESS;

           }

	      return result;
	}


}