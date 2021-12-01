package NullPointerException;

public class PlayerBO {
	
	public PlayerBO() {
		
	}
	
	public void displayPlayerDetails(Player []playerList,Player playerCap)
	{
		try 
		{
			System.out.println(playerCap.toString());
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception Occured : "+e.getClass().toString().substring(6));
			System.out.println("Captian details not available");
		}
				
		finally {
			for(int i = 0;i<playerList.length;i++)
			{
				System.out.println("Player Details ");
				System.out.println(playerList[i].toString());
			}
		}
	}
}
