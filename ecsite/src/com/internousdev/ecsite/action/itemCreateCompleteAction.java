package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.itemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class itemCreateCompleteAction extends ActionSupport implements SessionAware{

	private Map<String,Object> session;

	public String execute() throws SQLException{

		itemCreateCompleteDAO dao=new itemCreateCompleteDAO();

		String box_n=session.get("i_Name").toString();
		String box_p=session.get("i_Price").toString();
		String box_s=session.get("i_Stock").toString();

		dao.insertDb(box_n,box_p,box_s);

        String result=SUCCESS;

        return result;
	}


public Map<String, Object> getSession() {
	return session;
}

@Override
public void setSession(Map<String, Object> session) {
	this.session = session;
}

}
