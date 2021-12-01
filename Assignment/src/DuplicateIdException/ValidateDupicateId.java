package DuplicateIdException;

public class ValidateDupicateId {
	
	public  static void validationRule(int playerIdList[]) throws DuplicateIdException
	{
		for(int i = 0;i<playerIdList.length;i++)
		{
			for(int j =i+1;j<playerIdList.length;j++)
			{
				if(playerIdList[i] ==(playerIdList[j]))
				{
					throw new DuplicateIdException("DuplicateIdException: Player Id must be unique");
				}
			}
		}
	}

}
