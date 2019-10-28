package com.internousdev.ecsite.dto;

public class itemInfoDTO {

	private String id;
	private String iName;
	private String iPrice;
	private String iStock;
	private String insert_date;


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getiName() {
		return iName;
	}
	public void setiName(String iName) {
		this.iName = iName;
	}
	public String getiPrice() {
		return iPrice;
	}
	public void setiPrice(String iPrice) {
		this.iPrice = iPrice;
	}
	public String getiStock() {
		return iStock;
	}
	public void setiStock(String iStock) {
		this.iStock = iStock;
	}
	public String getInsert_date() {
		return insert_date;
	}
	public void setInsert_date(String insert_date) {
		this.insert_date = insert_date;
	}

}
