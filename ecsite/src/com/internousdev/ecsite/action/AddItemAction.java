package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.AddItemDAO;
import com.internousdev.ecsite.dto.itemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AddItemAction extends ActionSupport implements SessionAware{

	private String addItemName;
	public Map<String,Object> session;

	public String execute() throws SQLException{
		String result=SUCCESS;

		AddItemDAO dao=new AddItemDAO();
		itemInfoDTO dto=new itemInfoDTO();

		dto=dao.addDate(addItemName);

		if(!(dto.getiName().equals(""))){
    		session.put("addName", dto.getiName());
    		session.put("addStock", dto.getiStock());
    		if(dto.getiName().equals("no_date")){
    			result=ERROR;
    		}
    	}else{
    		result=ERROR;
    	}
		return result;
	}

  public String getAddItemName() {
	return addItemName;
  }

  public void setAddItemName(String addItemName) {
	this.addItemName = addItemName;
  }

  public Map<String, Object> getSession() {
	return session;
  }

  @Override
  public void setSession(Map<String, Object> session) {
	this.session = session;
  }

}
