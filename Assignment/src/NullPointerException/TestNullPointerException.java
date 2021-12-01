package NullPointerException;
import java.util.Scanner;

public class TestNullPointerException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of players: ");
		int playerNumber = sc.nextInt();
		sc.nextLine();
		
		
		Player playerCap = new Player();
		PlayerBO playerbo = new PlayerBO();
		Player player = new Player();
		
		Player playerList[] = new Player[playerNumber];
		
		System.out.println("Do you know the details of the caption? Type Yes/No");
		String choice = sc.nextLine();
		
		
		if(choice.toLowerCase().equals("yes"))
		{
			System.out.println("Enter name of the captian :");
			playerCap.setName(sc.nextLine());
			
			System.out.println("Enter country name of caption");
			playerCap.setCountry(sc.nextLine());
			
			System.out.println("Enter skillset of caption");
			playerCap.setSkill(sc.nextLine());
			
			playerCap = new Player(playerCap.getName(),playerCap.getCountry(),playerCap.getSkill());
		}
		else
		{
			playerCap= null;
		}	
			
		for(int i=0;i<playerNumber;i++)
		{
			System.out.println("Enter name of player "+i);
			player.setName(sc.nextLine());
			
			System.out.println("Enter country name of player "+i);
			player.setCountry(sc.nextLine());
			
			System.out.println("Enter skillset of player "+i);
			player.setSkill(sc.nextLine());
						
			playerList[i] = new Player(player.getName(), player.getCountry(), player.getSkill());
		}
		
		playerbo.displayPlayerDetails(playerList, playerCap);	
			
		
		sc.close();

	}

}
