package com.sj.dao;
import java.util.Iterator;
import java.util.TreeSet;

import javax.xml.crypto.Data;
import com.sj.db.DataBase;
import com.sj.model.Book;
public class BookDAO  {
	public BookDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*TreeSet<Book> obj1;
	public BookDAO(TreeSet<Book> obj) {
		this.obj1=obj;
	}*/
	public void displayAll() {
		/*Iterator itr = obj1.iterator();
		while(itr.hasNext()) {
			itr.next();
		}*/
		System.out.println(DataBase.data);
	}
	public void insert_method(Book b) {
		DataBase.data.add(b);
	}
	public void delete_method(int id) {
		TreeSet<Book> b=DataBase.data;
		Iterator<Book> itr = b.iterator();
		while(itr.hasNext()) {
			if((itr.next()).getId()==id) {
				itr.remove();
			}
		}
	}
	public void exit_method() {
		System.exit(0);
	}
	public void find_method(int id) {
		Iterator<Book> itr = DataBase.data.iterator();
		while(itr.hasNext()) {
			Book b = itr.next();
			if((b).getId()==id) {
				System.out.println(b);
			}
		}
	}
	public void update(int id,int price) {
		TreeSet<Book> b=DataBase.data;
		Iterator<Book> itr = DataBase.data.iterator();
		while(itr.hasNext()) {
			Book b1 = itr.next();
			if((b1).getId()==id) {
				b1.setPrice(price);
			}
		}
	}
}
