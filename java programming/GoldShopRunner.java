class GoldShopRunner{

	public static void main(String[] Aj){
	
	boolean isAdded = GoldShop.addGoldItem("Necklace");
	System.out.println("is gold name added : "+isAdded);
	
	 isAdded = GoldShop.addGoldItem("Bangels");
	System.out.println("is gold name added : "+isAdded);
	
	 isAdded = GoldShop.addGoldItem("Crystal Necklace");
	System.out.println("is gold name added : "+isAdded);
	
	 isAdded = GoldShop.addGoldItem("Earrings");
	System.out.println("is gold name added : "+isAdded);
	
	 isAdded = GoldShop.addGoldItem("Beads");
	System.out.println("is gold name added : "+isAdded);
	
	 isAdded = GoldShop.addGoldItem("Bracelets");
	System.out.println("is gold name added : "+isAdded);
	
	 isAdded = GoldShop.addGoldItem("Anklets");
	System.out.println("is gold name added : "+isAdded);
	
	//boolean isUpdated = GoldShop.updateGoldItem("Necklace", "Chain");
	//System.out.println("is the gold name is updated : "+isUpdated);
	
	
	
	GoldShop.getAllGoldItems();
	
	GoldShop.deleteGoldName("Bangels");
	
	GoldShop.getAllGoldItems();
	
	}

}