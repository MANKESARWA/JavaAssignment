package demo.interfaceDemo;

public class FilePrintable implements Printable{
	@Override
	public void print(String msg) {
		System.out.println("Storing  a message in the file: "+msg);
	}
}
