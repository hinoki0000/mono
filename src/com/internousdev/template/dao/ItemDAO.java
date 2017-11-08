package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.template.dto.ItemDTO;
import com.internousdev.template.util.DBConnector;

public class ItemDAO {

//	//mysqlのデーターベース名newecsite,テーブル名product_infoから値を持ってきましょう。
//	//この2行は必須。
	private DBConnector dbConnector = new DBConnector();
    private Connection connection = dbConnector.getConnection();

    public ArrayList<ItemDTO> getKAO(String hiddinid) throws SQLException {
    	ArrayList<ItemDTO> itemDTO = new ArrayList<ItemDTO>();


		String sql = "SELECT * FROM product_info where product_id = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			String product_id = hiddinid;
			preparedStatement.setString(1, product_id);


			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				ItemDTO dto = new ItemDTO();

				dto.setProduct_id(resultSet.getInt("product_id"));
				dto.setProduct_name(resultSet.getString("product_name"));
				dto.setProduct_description(resultSet.getString("product_description"));
				dto.setCategory_id(resultSet.getInt("category_id"));
				dto.setPrice(resultSet.getInt("price"));
				dto.setImage_file_path(resultSet.getString("image_file_path"));
				dto.setImage_file_name(resultSet.getString("image_file_name"));
				dto.setRelease_data(resultSet.getInt("release_data"));
				dto.setRelease_company(resultSet.getString("release_company"));
				System.out.println(resultSet.getString("product_id"));
		itemDTO.add(dto);
			}

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

		return itemDTO;
	}


    }