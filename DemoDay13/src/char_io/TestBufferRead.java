package char_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class TestBufferRead {

	public static void main(String[] args) {
		//reading data from  Source file into Java Application.
		
		//Java application<---Buffered Reader<---File Reader<---File
		System.out.println("Enter the file name: ");
		try(
				Scanner sc = new Scanner(System.in);
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))		
				
			)
		{
			//read the data till End of File(end of String in file)
			
			String line = null;
			while((line = br.readLine())!=null)
			{
				System.out.println(line);
			}
			System.out.println("File read over...!!!");
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("End of the main function");
	}
	
}
