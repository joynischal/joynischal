class GiriasRunner{
	public static void main(String[] args){
		
	boolean isAdded = Girias.createHomeAppliance("TV");
	System.out.println("is Appliance added : "+isAdded);
	
	 isAdded = Girias.createHomeAppliance("Fridge");
	System.out.println("is Appliance added : "+isAdded);
	
	 isAdded = Girias.createHomeAppliance("WashingMachine");
	System.out.println("is Appliance added : "+isAdded);
	
	 isAdded = Girias.createHomeAppliance("Oven");
	System.out.println("is Appliance added : "+isAdded);
	
	 isAdded = Girias.createHomeAppliance("Mobile");
	System.out.println("is Appliance added : "+isAdded);
	
	 isAdded = Girias.createHomeAppliance("Laptop");
	System.out.println("is Appliance added : "+isAdded);
	
	 isAdded = Girias.createHomeAppliance("Fan");
	System.out.println("is Appliance added : "+isAdded);
	
	 isAdded = Girias.createHomeAppliance("Storage WardDrop");
	System.out.println("is Appliance added : "+isAdded);
	
	 isAdded = Girias.createHomeAppliance("TubeLight");
	System.out.println("is Appliance added : "+isAdded);
	
	 isAdded = Girias.createHomeAppliance("Mixi");
	System.out.println("is Appliance added : "+isAdded);
	
	 isAdded = Girias.createHomeAppliance("AirConditioner");
	System.out.println("is Appliance added : "+isAdded);
	
	 isAdded = Girias.createHomeAppliance("Kitchen Chimney");
	System.out.println("is Appliance added : "+isAdded);
	
	boolean ishomeApplianceUpdated = Girias.updatedHomeAppliance("Mixi", "Bulb");
	System.out.println("ishomeApplianceUpdated " +ishomeApplianceUpdated);
	
	
	Girias.getHomeAppliances();
	
	Girias.deleteHomeAppliance("Fridge");
	
	Girias.getHomeAppliances();
	
	}


}