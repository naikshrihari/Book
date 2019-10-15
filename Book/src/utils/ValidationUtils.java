package utils;

import java.util.HashMap;

import com.app.core.Book;

import cust_exc.BookHandlingException;

public class ValidationUtils {

	
	public static String checkBookAvailable(HashMap<String, Book> book, String title) throws BookHandlingException
	{
		HashMap<String, Book> hm = new HashMap<>();
		if(!book.containsKey(title))
		{
			throw new BookHandlingException("Book Not Found!!!!!");
		}
		
		System.out.println("Book added to cart.");
		return "Book available";
	}
}
