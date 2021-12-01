package demo.interfaceDemo;

public class TesterPrintable {

	public static void main(String[] args) {
//		ControlPrintable cp = new ControlPrintable();
//		cp.print("Hello");
//		FilePrintable fp = new FilePrintable();
//		fp.print("Going to file");
		
		Printable []parr= {new FilePrintable(),new ControlPrintable()};
		for(Printable p:parr)	{
			p.print("Same msg");
				

		}
			
			
	}
}
