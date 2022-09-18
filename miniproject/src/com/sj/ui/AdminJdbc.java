package com.sj.ui;

import java.util.Scanner;
import java.util.TreeSet;

import com.sj.dao.BookDAO;
import com.sj.dao.BookJdbcDao;
import com.sj.model.Book;

public class AdminJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String yon ="y";
		while(yon.equals("y")) {
			System.out.println("menu");
			System.out.println("1 for display all books");
			System.out.println("2 for insert book");
			System.out.println("3 for delete book");
			System.out.println("4 for update book");
			System.out.println("5 for find book by id");
			System.out.println("6 for exit");
			System.out.println("enter your choice: ");
			int n = sc.nextInt();
			BookJdbcDao obj = new BookJdbcDao();
			switch(n) {
			case 1:
				TreeSet<Book> books =obj.displayALL();
				System.out.println(books);
				break;
			case 2:
				System.out.println("enter id: ");
				int id=sc.nextInt();
				System.out.println("enter title: ");
				String title = sc.next();
				System.out.println("enter author: ");
				String author = sc.next();
				System.out.println("enter price: ");
				int price=sc.nextInt();
				Book obj1 = new Book(id,title,author,price);
				obj.insert_method(obj1);
				break;
			case 3:
				System.out.println("enter id");
				int id1=sc.nextInt();
				obj.delete_method(id1);
				break;
			case 4:
				System.out.println("enter id: ");
				int id2=sc.nextInt();
				System.out.println("enter price: ");
				int price1=sc.nextInt();
				obj.update(id2, price1);
				break;
			case 5:
				System.out.println("enter id: ");
				int id3=sc.nextInt();
				obj.find_method(id3);
				break;
			case 6:
				obj.exit_method();
				break;
			}
			System.out.println("press y for menu: ");
			String str = sc.next();
			yon=str;
		}
		sc.close();

	}

}
