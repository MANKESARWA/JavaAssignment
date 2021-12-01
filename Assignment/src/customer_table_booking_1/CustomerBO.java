package customer_table_booking_1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomerBO {
	
	Customer customer = new Customer();
	Customer []customerList =new Customer[2];
	
	public void settingValue(String data) 
	{
		String dataList[] = data.split("[,]", 0);
		customer.setId(Long.parseLong(dataList[0]));
		customer.setName(dataList[1]);
		customer.setMobileNumber(dataList[2]);
		try 
		{
			customer.setBirthdate(new SimpleDateFormat("dd-MMyyyy").parse(dataList[3]));
		} 
		catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		customer.setAverageSpendAmount(Double.parseDouble(dataList[4]));
		customer.setTotalAmount(Double.parseDouble(dataList[5]));
		try 
		{
			customer.setDateEnrolled(new SimpleDateFormat("dd-MMyyyy").parse(dataList[6]));
		} 
		catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		customer.setRating(Double.parseDouble(dataList[7]));
		
		for(int i=0;i<2;i++)
		{
			customerList[i] = new Customer(customer.getId(),customer.getName(), customer.getMobileNumber(), customer.getBirthdate(), customer.getAverageSpendAmount(), customer.getTotalAmount(), customer.getDateEnrolled(), customer.getRating());
		}			
	}
	public void displayCustomer()
	{
		for(int i= 0 ;i<2;i++)
		{
			System.out.println("Details of Customer "+(i+1));
			System.out.println(customerList[i].toString());
			System.out.println();
		}
	}
	
}
