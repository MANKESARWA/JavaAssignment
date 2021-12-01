package LibraryApplication.utils;
import LibraryApplication.*;
import LibraryApplication.Tester.BookHandling;

public class ValidationRule {
	
	Book book = new Book();
	
	public static void validationRule(String title, int quantity ) throws BookHandling
	{
		if(title.equals(null))
		{
			throw new BookHandling("Book is not available.");
		}
		else if(quantity>12)
		{
			throw new BookHandling("Insufficient quantity.");
		}
		
	}

}
