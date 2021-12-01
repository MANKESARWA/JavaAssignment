package tester;

public class TestFinally4 {


public static void main(String[] args) {
		
		System.out.println("1");
		try 
		{
			testMe();
			System.out.println("Back in main");
		}
		catch(Exception e) {
			System.out.println("In main's catch all: "+e);
		}
		finally {
			System.out.println("in main methods finally");
		}
		System.out.println("Main method Ends");
		
	}
	public static void testMe() throws InterruptedException {
		try 
		{
			System.out.println("In methods try...");
			String [] ss= {"aa","bb"};
			Thread.sleep(1000);
			System.out.println(ss[0]);
			boolean flag = true;
			if(flag) {
				System.exit(0);
			}
			System.out.println("End of try");
		}
		finally {
			System.out.println("In the testme Method finally");
		}
		System.out.println("Method Ends");
	}
}
