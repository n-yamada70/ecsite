package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.itemInfoDTO;
import com.internousdev.ecsite.util.DBConnector;

public class itemListDAO {

	List<itemInfoDTO> iDTOList=new ArrayList<itemInfoDTO>();

	public List<itemInfoDTO> selectDAO() throws SQLException{

		DBConnector db=new DBConnector();
		Connection con=db.getConnection();


		String sql="SELECT*FROM item_info_transaction";

		try{
			PreparedStatement ps=con.prepareStatement(sql);

			ResultSet rs=ps.executeQuery();

        while(rs.next()){
        	itemInfoDTO dto=new itemInfoDTO();
        	dto.setId(rs.getString("id"));
        	dto.setiName(rs.getString("item_name"));
        	dto.setiPrice(rs.getString("item_price"));
        	dto.setiStock(rs.getString("item_stock"));
        	dto.setInsert_date(rs.getString("insert_date"));

        	iDTOList.add(dto);

        }

		}catch (SQLException e){
			e.printStackTrace();
		}finally{
		    con.close();
		}
		return iDTOList;
	}

	public List<itemInfoDTO> getiDTOList() {
		return iDTOList;
	}

	public void setiDTOList(List<itemInfoDTO> iDTOList) {
		this.iDTOList = iDTOList;
	}



}
