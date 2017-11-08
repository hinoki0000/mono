package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.template.dto.LoginDTO;
import com.internousdev.template.util.DBConnector;

public class LoginDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private LoginDTO loginDTO = new LoginDTO();
	public LoginDTO getUserInfo(String user_name,String login_pass) {

		String sql = "SELECT * FROM user_info where user_name = ? AND login_pass = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user_name);
			preparedStatement.setString(2, login_pass);


			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {
				loginDTO.setUser_id(resultSet.getString("user_id"));
				loginDTO.setLogin_pass(resultSet.getString("login_pass"));
				loginDTO.setUser_name(resultSet.getString("user_name"));
				loginDTO.setLogin_id(resultSet.getString("login_id"));

				if(!(resultSet.getString("login_id").equals(null))) {
					loginDTO.setLoginFlg(true);
				}
			}

		} catch(Exception e) {
			e.printStackTrace();
		}

		return loginDTO;
	}

	public LoginDTO getLoginDTO() {
		return loginDTO;
	}
}

