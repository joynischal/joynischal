class WatchShopRunner{
	public static void main(String[] args){
	
	boolean isAdded = WatchShop.addWatchBrandNames("FastTrack");
	System.out.println("is watch brand Added :  " +isAdded);
	
	 isAdded = WatchShop.addWatchBrandNames("FireBoult");
	System.out.println("is watch brand Added :  " +isAdded);
	
	 isAdded = WatchShop.addWatchBrandNames("Sonata");
	System.out.println("is watch brand Added :  " +isAdded);
	
	 isAdded = WatchShop.addWatchBrandNames("Titan");
	System.out.println("is watch brand Added :  " +isAdded);
	
	 isAdded = WatchShop.addWatchBrandNames("Pebble");
	System.out.println("is watch brand Added :  " +isAdded);
	
	 isAdded = WatchShop.addWatchBrandNames("Rolex");
	System.out.println("is watch brand Added :  " +isAdded);
	
	 isAdded = WatchShop.addWatchBrandNames("Casio");
	System.out.println("is watch brand Added :  " +isAdded);
	
	 isAdded = WatchShop.addWatchBrandNames("Rado");
	System.out.println("is watch brand Added :  " +isAdded);
	
	 isAdded = WatchShop.addWatchBrandNames("Omega");
	System.out.println("is watch brand Added :  " +isAdded);
	
	 isAdded = WatchShop.addWatchBrandNames("Cartier");
	System.out.println("is watch brand Added :  " +isAdded);
	
	boolean isUpdated = WatchShop.updateWatchBrands("FastTrack", "Casio");
	System.out.println("is watch brand name updated : " +isUpdated);
	
	
	WatchShop.getAllWatchBrands();
	
	WatchShop.deleteWatchBrand("FireBoult");
	WatchShop.getAllWatchBrands();
	
	
	
	}




}