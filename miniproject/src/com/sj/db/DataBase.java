package com.sj.db;
import java.util.*;
import com.sj.model.*;
import com.sj.model.Book;
public class DataBase  {
	public static TreeSet<Book> data;
	static{
	data = new TreeSet<>();
	data.add(new Book(1,"Harry Potter","jk rowling",2000));
	data.add(new Book(2,"Simp : the sad phase","pritish",2000));
	data.add(new Book(3,"The life of nitish","nitish",2000));
	data.add(new Book(4,"Man united","erik ten hag",2000));
	}
}
