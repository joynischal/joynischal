class BarRunner{
	public static void main(String[] args){
	
	boolean isAdded = Bar.addWineBrands("Cabernet Sauvignon");
	System.out.println("is wine brand added : " +isAdded);
	
	 isAdded = Bar.addWineBrands("Chardonnay");
	System.out.println("is wine brand added : " +isAdded);
	
	 isAdded = Bar.addWineBrands("Merlot");
	System.out.println("is wine brand added : " +isAdded);
	
	 isAdded = Bar.addWineBrands("Pinot noir");
	System.out.println("is wine brand added : " +isAdded);
	
	 isAdded = Bar.addWineBrands("Syrah");
	System.out.println("is wine brand added : " +isAdded);
	
	 isAdded = Bar.addWineBrands("Grenache");
	System.out.println("is wine brand added : " +isAdded);
	
	 isAdded = Bar.addWineBrands("Riesling");
	System.out.println("is wine brand added : " +isAdded);
	
	 isAdded = Bar.addWineBrands("Sangiovese");
	System.out.println("is wine brand added : " +isAdded);
	
	isAdded = Bar.addWineBrands("Sauvignon blanc");
	System.out.println("is wine brand added : " +isAdded);
	
	 isAdded = Bar.addWineBrands("Malbec");
	System.out.println("is wine brand added : " +isAdded);
	
	 isAdded = Bar.addWineBrands("Nebbiolo");
	System.out.println("is wine brand added : " +isAdded);
	
	 isAdded = Bar.addWineBrands("Pinto Girgio");
	System.out.println("is wine brand added : " +isAdded);
	
	isAdded = Bar.addWineBrands("Tempranillo");
	System.out.println("is wine brand added : " +isAdded);
	
	 isAdded = Bar.addWineBrands("Zinfandel");
	System.out.println("is wine brand added : " +isAdded);
	
	 isAdded = Bar.addWineBrands("Cabernet Franc");
	System.out.println("is wine brand added : " +isAdded);
	
	
	boolean isUpdated = Bar.updateWineBrandNames("Cabernet Sauvignon", "Red Wine");
	System.out.println("is wine brand name updated : "+isUpdated);
	
	
	Bar.getAllWineBrands();
	
	Bar.deleteWineBrand("Chardonnay");
	
	Bar.getAllWineBrands();
	}
}