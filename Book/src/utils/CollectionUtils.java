package utils;

import static com.app.core.Book.sdf;

import java.text.ParseException;
import java.util.HashMap;

import com.app.core.Book;

public class CollectionUtils {
	
	public static HashMap<String, Book> populateBook() throws ParseException
	{
		HashMap<String, Book> book= new HashMap<>();
		
		book.put("meluha", new Book("meluha", "amish", 250, sdf.parse("19-01-2014")));
		book.put("abc", new Book("abc", "shrihari", 450, sdf.parse("19-01-2010")));
		book.put("world", new Book("world", "hari", 277, sdf.parse("19-01-2018")));
		book.put("elon", new Book("elon", "omkar", 990, sdf.parse("19-01-2011")));
		
		return book;
		
	}

}
