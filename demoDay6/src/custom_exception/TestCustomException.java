
package custom_exception;
import static utils.ValidationRules.validationSpeed;
import java.util.Scanner;

public class TestCustomException {
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in))
		{
			
			System.out.println("Enter Vechile speed: ");
			validationSpeed(sc.nextInt());
			
			System.out.println("End of try.....");
		} 
		catch (SpeedOutOfRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			System.out.println(e);
		}
		System.out.println("Main application over.........");
		
		
	}
	
	
}
