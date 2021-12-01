package demo.interfaceDemo;

public class ControlPrintable implements Printable {
	@Override
	public void print(String msg)
	{
		System.out.println("Printing message on console: "+msg);
	}
}
