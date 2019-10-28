package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class itemCreateConfirmAction extends ActionSupport implements SessionAware{

	private String i_Name;
	private String i_Price;
	private String i_Stock;
	private String errorMessage;
	private Map<String,Object> session;

	public String execute(){

		String result=SUCCESS;

		if(!(i_Name.equals(""))
				&&!(i_Price.equals(""))
				&&!(i_Stock.equals(""))){
			session.put("i_Name", i_Name);
			session.put("i_Price", i_Price);
			session.put("i_Stock", i_Stock);
		}else{
			setErrorMessage("正しく入力されていません");
			result=ERROR;
		}
		return result;

	}


	public String getI_Name() {
		return i_Name;
	}

	public void setI_Name(String i_Name) {
		this.i_Name = i_Name;
	}

	public String getI_Price() {
		return i_Price;
	}

	public void setI_Price(String i_Price) {
		this.i_Price = i_Price;
	}

	public String getI_Stock() {
		return i_Stock;
	}

	public void setI_Stock(String i_Stock) {
		this.i_Stock = i_Stock;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	}
