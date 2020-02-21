package tester;

import static com.app.core.Book.sdf;
import static utils.CollectionUtils.*;

import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Book;

public class TestBook1 {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in))
		{
			HashMap<String, Book> book = populateBook();
			boolean exit = false;
			
			while(!exit)
			{
				System.out.println("Menu: \n1.Add Book \n2.Show Book Details \n3.exit");
				System.out.println("Enter your choice");
				
				try
				{
				
				switch(sc.nextInt())
				{
				
				case 1: 
					System.out.println("Enter the date to add Book[title, author price, publish date(dd-MM-yyyy)]");
					String title = sc.next();
					book.put(title, new Book(title, sc.next(), sc.nextDouble(), sdf.parse(sc.next())));
					break;
				
				case 2:
					for(Book e: book.values())
						System.out.println(e);
					break;
				
				case 3:
					exit = true;
					System.out.println("Thank You for visiting.");
					break;
				
				
				}
				
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
