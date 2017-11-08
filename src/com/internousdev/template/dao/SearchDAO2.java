package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.dto.SearchDTO;
import com.internousdev.template.util.DBConnector;

public class SearchDAO2 {

//	//mysqlのデーターベース名newecsite,テーブル名product_infoから値を持ってきましょう。
//	//この2行は必須。
	private DBConnector dbConnector = new DBConnector();
    private Connection connection = dbConnector.getConnection();

    public ArrayList<SearchDTO> getProject(String item_name) throws SQLException {
    	ArrayList<SearchDTO> searchDTO = new ArrayList<SearchDTO>();


//  	if(item_name.contains(" ")){
		String itemname =item_name.replaceAll(" ","　");
  		System.out.println(itemname);
//	}
//    	System.out.println(item_name);



      String[] resultArray = itemname.split("　");//[2
      for (int i = 0; i < resultArray.length; i++) {//[3]
          System.out.println(resultArray[i]);//[4]
       }


//splitの複数指定、

		String tempsql = "SELECT * FROM ai where ";
		System.out.println(tempsql);
		String sql = "" ;
		int p =0;
		while(p<resultArray.length){

			sql = sql + "item_word like \"%"+resultArray[p]+"%\"";
					if((p+1)<resultArray.length){
						sql = sql + " or ";
					}
					p++;
		}
		String mainsql = tempsql + sql +";";
		System.out.println(mainsql);
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(mainsql);


			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
			
				
				SearchDTO dto = new SearchDTO();


		searchDTO.add(dto);
			}

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

		return searchDTO;
	}


    }