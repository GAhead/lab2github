package action;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import B3;


import booki.book;

import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String authorname;
	
	private List<book> booklist = new ArrayList<book>();
	

	public String execute() {
		String ret = ERROR;
		Connection conn = null;
		try {
			String URL = "jdbc:mysql://localhost/bookdatabase3";
			String sql1 = new String();
			ResultSet rs,rs1=null;
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, "root", "123456789");			
			String sql = "select AuthorID from Author where Name='"+authorname+"'";
			PreparedStatement ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next())
			{
				sql1 = "select * from Book where AuthorID='"+rs.getString("AuthorID")+"'";
			}
			PreparedStatement ps1 = conn.prepareStatement(sql1);
			rs1 = ps1.executeQuery();
			while (rs1.next()) {
				book tmp = new book();
				tmp.setISBN(rs1.getString(1));
				tmp.setTitle(rs1.getString(2));
				tmp.setAuthorID(rs1.getString(3));
				tmp.setPublisher(rs1.getString(4));
				tmp.setPublishDate(rs1.getString(5));
				tmp.setPrice(rs1.getString(6));
				booklist.add(tmp);
				ret = "success";
			}
			booklist.toArray();

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
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public List<book> getBooklist() {
		return booklist;
	}

	public String getAuthorname() {
		return authorname;
	}


	public void getBooklist(List<book> booklist) {
		this.booklist = booklist;
	}
}
