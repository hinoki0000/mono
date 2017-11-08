package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.dao.SearchDAO2;
import com.internousdev.template.dto.SearchDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SearchAction2 extends ActionSupport{
	public SearchDAO2 searchDAO2 = new SearchDAO2();

	public ArrayList<SearchDTO> searchDTO = new ArrayList<SearchDTO>();

private String item_name;
	 String result;
		public String execute() throws SQLException{

System.out.println(item_name);
			String info = null;
			//
//			String message ;
//	        message = "服 mens" ;
//	        String[] resultArray = message.split(" ");//[2]
//
//	        for (int i = 0; i < resultArray.length; i++) {//[3]
//	            System.out.println(resultArray[i]);//[4]
//

			searchDTO= searchDAO2.getProject(item_name);
    	return info;



}
//		public void validate() {
//			//////////////////条件指定/////////////////
//			if (item_name == null || item_name.length() == 0) {
//				addFieldError("name", "The name is required");
//			}
//
//			if (!(item_name.length() < 10 && item_name.length() > 3 || item_name== null || item_name.length() == 0)) {
//				addFieldError("name", "The name must be less than 10 and more than 3");
//			}
//			int len = item_name.length();
//
//			byte[] bytes = item_name.getBytes();
//			if (len != bytes.length) {
//				addFieldError("name", "The name must be Half size");
//			}
//
//
//		}


		public String getItem_name() {
			return item_name;
		}
		public void setItem_name(String item_name) {
			this.item_name = item_name;
		}
}