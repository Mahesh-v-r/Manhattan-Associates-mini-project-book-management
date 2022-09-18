package com.sj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import com.sj.model.Book;

public class BookJdbcDao implements IDAOBook {

	@Override
	public TreeSet<Book> displayALL() {
		// TODO Auto-generated method stub
		TreeSet <Book> books = new TreeSet<>();
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/job","root","m1v2r3v1v2r3r1v2n3");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from book");
			while(rs.next()) {
				books.add(new Book(rs.getInt(1),rs.getString(2),rs.getNString(3),rs.getInt(4)));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return books;
	}

	@Override
	public void insert_method(Book b) {
		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/job","root","m1v2r3v1v2r3r1v2n3");
			PreparedStatement stmt = con.prepareStatement("insert into Book  values (?,?,?,?)");
			stmt.setInt(1,b.getId());
			stmt.setString(2,b.getTitle());
			stmt.setString(3,b.getAuthor());
			stmt.setInt(4, b.getPrice());
			int rs = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

	@Override
	public void delete_method(int id) {
		// TODO Auto-generated method stub
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/job","root","m1v2r3v1v2r3r1v2n3");
			PreparedStatement stmt = con.prepareStatement("delete from Book where bookid = ?");
			stmt.setInt(1,id);
			int rs = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void exit_method() {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void find_method(int id) {
		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/job","root","m1v2r3v1v2r3r1v2n3");
			PreparedStatement stmt = con.prepareStatement("select * from Book where bookid = ?");
			stmt.setInt(1,id);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println("book id: "+rs.getInt(1)+" Book Title: "+rs.getString(2)+" Book author: "+rs.getString(3)+" Book price: "+rs.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update(int id, int price) {
		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/job","root","m1v2r3v1v2r3r1v2n3");
			PreparedStatement stmt = con.prepareStatement("update Book set price = ? where bookid = ? ");
			stmt.setInt(1,price);
			stmt.setInt(2,id);
			int rs = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
