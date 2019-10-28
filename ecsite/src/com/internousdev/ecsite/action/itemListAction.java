package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dao.itemListDAO;
import com.internousdev.ecsite.dto.itemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class itemListAction extends ActionSupport{

	List<itemInfoDTO> iDTOList=new ArrayList<itemInfoDTO>();

	public String execute() throws SQLException{
		itemListDAO dao=new itemListDAO();

        iDTOList=dao.selectDAO();

		String result=SUCCESS;

		return result;
	}

	public List<itemInfoDTO> getiDTOList() {
		return iDTOList;
	}

	public void setiDTOList(List<itemInfoDTO> iDTOList) {
		this.iDTOList = iDTOList;
	}

}
