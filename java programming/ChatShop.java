class ChatShop
{
	static String ChatNames[]={null, null, null, null, null, null};
	static double Chatprices[]={0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
	static int chatindex;
	static int priceindex;
	public static boolean createChatNames(String chatName)
	{
		
		boolean ischatnamecreated=false;
		if(chatName != null)
		{
			
			ChatNames[chatindex] =chatName;
			chatindex++;
			ischatnamecreated=true;
		}
			else System.out.println("Only Provide a added chatName");
			return ischatnamecreated;
	}
	
	public static boolean createprice(double chatprice)
	{
		boolean ischatnamepricecreated=false;
		if(chatprice > 0.0)
		{
			
			Chatprices[priceindex] =chatprice;
			priceindex++;
			ischatnamepricecreated=true;
		}
			else System.out.println("Only Provide a valid price");
			return ischatnamepricecreated;
	}
	public static void getChat()
	{
		for(String chatName : ChatNames)
		{
			System.out.println("The available chat names are: "+chatName);
		}
	}
	public static void getChatprice()
	{
		for(double chatprice : Chatprices)
		{
			System.out.println("The available chat price are: "+chatprice);
		}
	}
	public static boolean updateChatName(String oldChatName, String newChatName)
	{
		boolean isChatNameUpdated=false;
		for(int index=0; index < ChatNames.length ; index++)
		{
			if(oldChatName == ChatNames[index])
			{
				ChatNames[index] = newChatName;
				isChatNameUpdated=true;
			}
		}
		if(isChatNameUpdated == false)
		{
			System.out.println(oldChatName + "Not added");
		}return isChatNameUpdated;
	}
}