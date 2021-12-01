package assignment.Inningsdelivery;

public class DeliveryBO {
	
	public Delivery createDelivery(String data,Innings []inningsList)
	{
		String deliveryDetails[] = data.split("[,]", 0);
		Delivery delivery = new Delivery();
		
		delivery.setDeliveryNumber(Long.parseLong(deliveryDetails[0]));
		delivery.setBatsman(deliveryDetails[1]);
		delivery.setBowler(deliveryDetails[2]);
		delivery.setRuns(Long.parseLong(deliveryDetails[3]));
		delivery.setInningsNumber(Long.parseLong(deliveryDetails[4]));
		for(int i = 0;i<inningsList.length;i++)
		{
			delivery = new Delivery(delivery.getDeliveryNumber(), delivery.getBatsman(), delivery.getBowler(), delivery.getRuns(), delivery.getInningsNumber());
		}
		
		return delivery;
	}
	
	public String findInninngNumber(Delivery []deliveryList, long deliveryNumber)
	{
		int count = 0;
		
				
		for(int i=0;i<deliveryList.length;i++)
			
		{
			
			if(deliveryList[i].getDeliveryNumber()==deliveryNumber)
			{
				System.out.println("Innings :"+deliveryList[i].getInningsNumber());
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("Inning not found");
		}
		return null;
	}
	
	
}
