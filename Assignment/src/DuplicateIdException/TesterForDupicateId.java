package DuplicateIdException;
import java.util.Scanner;

public class TesterForDupicateId {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Player player = new Player();
		System.out.println("Enter the team name");
		player.setTeamName(sc.nextLine());
		System.out.println("Enter the number of players suggested");
		int playerNumber = sc.nextInt();
		int playerIdList[] = new int[playerNumber];
		String playerNameList[] = new String[playerNumber];
		
		for(int i=0;i<playerNumber;i++)
		{
			System.out.println("Enter player "+(i+1)+" details");
			player.setPlayerId(sc.nextInt());
			sc.nextLine();
			player.setPlayerName(sc.nextLine());
			playerIdList[i] = player.getPlayerId();
			playerNameList[i] =player.getPlayerName();
		}
		
		try
		{
			ValidateDupicateId.validationRule(playerIdList);
			for(int i = 0;i<playerNumber;i++)
			{
				System.out.print(playerIdList[i]+" ");
				System.out.println(playerNameList[i]+" ");
			}
		}
		
		catch(DuplicateIdException e)
		{
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
