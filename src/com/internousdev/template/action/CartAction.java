package com.internousdev.template.action;

import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport{
    // public boolean login;
    public String login;



		public String execute(){

			   String	result = ERROR;
           if(!(login=="loginsuc")){
        	   
        	   
        	   
        	   
        	 result =SUCCESS;

           }

	      return result;
	}


}