package LibraryApplication.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import LibraryApplication.Book;
import static LibraryApplication.Category.*;
import static java.time.LocalDate.parse;

public interface CollectionUtils {
	

	static List<Book> populateData()
	{
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book(12,"A Song of Ice and Fire","R R Martin",2021.2,SCIENCE_FICTION,12,parse("2017-01-23")));
		books.add(new Book(21,"Harry Porter","R K Rowlings",2021.2,SCIENCE_FICTION,12,parse("2012-09-04")));
		books.add(new Book(1,"Nineteen Eighty-Four","George Orwell",1021.2,LITRATURE,12,parse("1949-01-23")));
		books.add(new Book(42,"Batman: The Killing Joke","Alan Moore",201.2,COMIC,12,parse("1917-01-23")));
		books.add(new Book(2,"Marvel Encyclopedia New Edition","Stan Lee",221.2,COMIC,12,parse("2010-12-23")));
		books.add(new Book(5,"Ghost Story"," Peter Straub",2021.2,HORROR,12,parse("1979-01-01")));
		books.add(new Book(43,"The Guns of August", "Barbara W. Tuchman", 200.1,HISTORY, 12, parse("1962-02-21")));		
		return books;
	}
	
	static HashMap<Integer, Book> populateHashMapFromList(List<Book> list)
	{
		HashMap<Integer, Book> bookMap = new HashMap<>();
		for(Book b : list)
		{
			bookMap.put(b.getBookId(), b);
		}
		return bookMap;
	}

}
