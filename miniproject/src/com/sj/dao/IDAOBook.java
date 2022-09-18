package com.sj.dao;
import java.util.List;
import java.util.TreeSet;

import com.sj.model.Book;
public interface IDAOBook {
	public TreeSet<Book> displayALL();
	public void insert_method(Book b);
	public void delete_method(int id);
	public void exit_method();
	public void find_method(int id);
	public void update(int id,int price);
}
