package action;

import java.sql.*;

import com.opensymphony.xwork2.ActionSupport;

import B3;

public class BookDelete extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String bkID = new String();
	
	
	public String execute() {
		String ret = ERROR;
		Connection conn = null;
		try {
			String URL = "jdbc:mysql://localhost/bookdatabase3";
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(bkID);
			conn = DriverManager.getConnection(URL, "root", "123456789");	
			String sql = "delete from Book  where ISBN = '" + bkID + "'";
			System.out.println(sql);
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.executeUpdate();
			ret = SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			ret = ERROR;
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
				}
			}
		}
		return ret;
	}
	public void setBkID(String bkID) {
		this.bkID = bkID;
	}
	public String getBkID() {
		return bkID;
	}


}
