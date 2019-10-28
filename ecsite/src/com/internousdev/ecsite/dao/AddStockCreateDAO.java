package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dto.itemInfoDTO;
import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class AddStockCreateDAO implements SessionAware{

	public Map<String,Object> session;

	public void addStock(String addItemName,int addStock) throws SQLException{

		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		DateUtil dateUtil=new DateUtil();

		String sql="UPDATE item_info_transaction "
				+ "SET item_stock=?, insert_date=? "
				+ "WHERE item_name =?";

		try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, addStock);
		ps.setString(2, dateUtil.getDate());
		ps.setString(3, addItemName);

		int i=ps.executeUpdate();
		System.out.println(i+"件登録されました");

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	}

	public itemInfoDTO addDate(String addItemName,int trueStock) throws SQLException{

		itemInfoDTO dto=new itemInfoDTO();

		DBConnector db=new DBConnector();
		Connection con=db.getConnection();

		String sql="SELECT*FROM item_info_transaction "
				+ "WHERE item_name=? AND item_stock=?";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, addItemName);
			ps.setInt(2, trueStock);

			ResultSet rs=ps.executeQuery();

			if(rs.next()){
				dto.setiName(addItemName);
				dto.setiStock(Integer.toString(trueStock));
			}

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return dto;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
