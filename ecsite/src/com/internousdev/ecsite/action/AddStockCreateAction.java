package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.AddStockCreateDAO;
import com.internousdev.ecsite.dto.itemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AddStockCreateAction extends ActionSupport implements SessionAware{

	private String addItemName;
	private int addStock;
	public Map<String,Object> session;

	public String execute() throws SQLException{
    	String result=SUCCESS;

    	System.out.println(addItemName);
    	System.out.println(addStock);

    	session.put("addStockNow",addStock);

    	int trueStock=addStock+Integer.parseInt(session.get("addStock").toString());

    	AddStockCreateDAO dao=new AddStockCreateDAO();
    	dao.addStock(addItemName,trueStock);

    	itemInfoDTO dto=new itemInfoDTO();
    	dto=dao.addDate(addItemName,trueStock);
    	if(!(dto.getiName().equals(""))){
    		session.put("addName", dto.getiName());
    		session.put("addTrueStock", dto.getiStock());

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

	public int getAddStock() {
		return addStock;
	}

	public void setAddStock(int addStock) {
		this.addStock = addStock;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
