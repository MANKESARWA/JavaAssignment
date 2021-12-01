package tester;

public class TestCHeckedException {
	
	public static void main(String []args) throws InterruptedException
	{
		System.out.println("Before");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread.sleep(1000);
		
		System.out.println();
	}
}
