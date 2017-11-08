package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.Iterator;

public class MyPageAction {
	public String execute(){
		String result= ERROR;//errorの場合はlogin.jsp
		if(session.contanskey(id)){
			String result = SUCCESS;
			if(deleteFlg == null) {
				String id = session.get("id").toString();
				String username = session.get("user_name").toString();

				myPageList = myPageDAO.getMyPageInfo(id, username);

				Iterator<MyPageDTO> iterator = myPageList.iterator();
				if (!(iterator.hasNext())) {
					myPageList = null;
					}
			} else if(deleteFlg.equals("1")) {
					delete();
			}
				return result;
		}
		return result;
	}

	public void delete() throws SQLException {

		String id = session.get("id").toString();
		String username = session.get("user_name").toString();

		int res = myPageDAO.HistoryDelete(id, username);

		if(res > 0) {
			myPageList = null;
			message = "商品情報を正しく削除しました。";
		} else if(res == 0) {
			message = "商品情報の削除に失敗しました。";

		}
	}
}
