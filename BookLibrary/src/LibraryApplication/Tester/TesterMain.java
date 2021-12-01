package LibraryApplication.Tester;
import static LibraryApplication.utils.CollectionUtils.*;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import LibraryApplication.*;

public class TesterMain {
	
	public static void main(String[] args) {
		
		Book book = new Book();
		
		
		List<Book> bookList = populateData();
//		bookList.forEach((Book b)->System.out.println(b.toString()));
		
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter the book title");
			book.setTitle(sc.nextLine());
			System.out.println("Enter the quantity");
			book.setQuantity(sc.nextInt());
			LibraryApplication.utils.ValidationRule.validationRule(book.getTitle(), book.getQuantity());
			
//			bookList.forEach((Book b) -> );
						
		}
		catch(BookHandling e)
		{
			System.out.println(e.getMessage());
		}
		
	}
//
}
