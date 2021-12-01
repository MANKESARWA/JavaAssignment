package char_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BufferFileCopy {
	public static void main(String[] args) {
		
		System.out.println("Enter source and detination file name on separete line: ");
		
		//java app<--BufferReader<--FileReader<--Source File
		//java application-->BufferWriter/PrintWriter--->FileReader-->Destination file.
		
		try(
				Scanner sc = new Scanner(System.in);
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()));
				PrintWriter pw = new PrintWriter(new FileWriter(sc.nextLine()))
				)
		{
			String line = null;
			while((line = br.readLine())!=null)
			{
				pw.println(line);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("File printing done.");
		
		
	}

}
