package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;

public class StockCountDAO {

	public BuyItemDTO SC() throws SQLException{

		BuyItemDTO dto=new BuyItemDTO();

		DBConnector db=new DBConnector();
		Connection con=db.getConnection();

		String sql="SELECT*FROM item_info_transaction";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();

		if(rs.next()){
			dto.setItemStock(rs.getInt("item_stock"));
		}

		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return dto;
	}
}
