package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite.dto.itemInfoDTO;
import com.internousdev.ecsite.util.DBConnector;

public class AddItemDAO {

	public itemInfoDTO addDate(String addItemName) throws SQLException{

		itemInfoDTO dto=new itemInfoDTO();

		DBConnector db=new DBConnector();
		Connection con=db.getConnection();

		String sql="SELECT*FROM item_info_transaction "
				+ "WHERE item_name=?" ;

		try{
			PreparedStatement ps=con.prepareStatement(sql);

			ps.setString(1, addItemName);

			ResultSet rs=ps.executeQuery();

			if(rs.next()){
				dto.setiName(addItemName);
				int x=rs.getInt("item_stock");
				dto.setiStock(String.valueOf(x));
			}else{
				dto.setiName("no_date");
			}

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return dto;
	}

}
