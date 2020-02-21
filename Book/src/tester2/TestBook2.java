package tester2;

import static com.app.core.Book.sdf;
import static utils.CollectionUtils.populateBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import static utils.ValidationUtils.*;

import com.app.core.Book;

public class TestBook2 
{

	public static void main(String[] args) 
	{


		try(Scanner sc=new Scanner(System.in))
		
		
		{
			HashMap<String, Book> totalBook = populateBook();
			HashMap<String, Book> bookCart = new HashMap<>();
			boolean exit = false;
			
			while(!exit)
			{
				System.out.println("Menu: \n1.Display book Details \n2.Add book to cart \n3.show cart Book \n4. Exit");
				System.out.println("Enter your choice:");
				
				try
				{
				
				switch(sc.nextInt())
				{
				
				case 1:System.out.println("Book Details:");
					
					for(Book b:totalBook.values())
					{
						System.out.println(b);
					}
				
					break;
				
				case 2:
					System.out.println("Enter the data to add Book[title]");
					//int counter = 1;
					String title = sc.next();
					//HashMap<String, Book> newBook = c;
					checkBookAvailable(totalBook, title);
					bookCart.put(title, totalBook.get(title));
					System.out.println(bookCart.values());
					
					break;
					
					
				case 3:
					System.out.println("User cart:");
					for(Book b:bookCart.values())
					{
						System.out.println("\n"+b);
					}
					
					break;
					
				case 4:
					System.in.println("Total selected books: ")
						
					
					exit = true;
					int counter1 = 0;
					double price = 0;
					for(Book b: bookCart.values())
					{
						counter1 += 1;
						System.out.println("\nBook "+counter1+" : "+b.getTitle());
						price = price + b.getPrice();
						
					}
					
					System.out.println("\nTotal number of books:"+ counter1);
					System.out.println("\nTotal price:"+price);
					
					
					break;
					
				}
				
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				sc.nextLine();
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
