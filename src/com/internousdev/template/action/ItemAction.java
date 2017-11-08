package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.dao.ItemDAO;
import com.internousdev.template.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemAction extends ActionSupport{


private String hiddinid;
public ItemDAO itemDAO = new ItemDAO();
public ArrayList<ItemDTO> itemDTO = new ArrayList<ItemDTO>();
	 String result;

		public String execute() throws SQLException{

			String result =SUCCESS;

System.out.println(hiddinid);

itemDTO = itemDAO.getKAO(hiddinid);

	      return result;
	}

		public String getLex() {
			return hiddinid;
		}

		public void setLex(String hiddinid) {
			this.hiddinid = hiddinid;
		}


}
