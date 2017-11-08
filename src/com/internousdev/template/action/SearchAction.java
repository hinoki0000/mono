package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.dao.SearchDAO;
import com.internousdev.template.dto.SearchDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SearchAction extends ActionSupport{
	public SearchDAO searchDAO = new SearchDAO();
	 String result;
	 public ArrayList<SearchDTO> search = new ArrayList<SearchDTO>();
	private String product_name ;


		public String execute() throws SQLException{



			String result =SUCCESS;





	search = searchDAO.getProject(product_name);
			System.out.println(search);
	      return result;
	}




		public String getProduct_name() {
			return product_name;
		}


		public void setProduct_name(String product_name) {
			this.product_name = product_name;
		}

}