class LibertyRunner{
	public static void main(String[] args){
		
		boolean isAdded = Liberty.addShoeBrandNames("Coolers");
		System.out.println("is shoe brand added : " +isAdded);
		
		 isAdded = Liberty.addShoeBrandNames("Gliders");
		System.out.println("is shoe brand added : " +isAdded);
		
		 isAdded = Liberty.addShoeBrandNames("Fortune");
		System.out.println("is shoe brand added : " +isAdded);
		
		 isAdded = Liberty.addShoeBrandNames("AHA");
		System.out.println("is shoe brand added : " +isAdded);
		
		 isAdded = Liberty.addShoeBrandNames("Windsor");
		System.out.println("is shoe brand added : " +isAdded);
		
		 isAdded = Liberty.addShoeBrandNames("Leap7X");
		System.out.println("is shoe brand added : " +isAdded);
		
		 isAdded = Liberty.addShoeBrandNames("Warrior");
		System.out.println("is shoe brand added : " +isAdded);
		
		 isAdded = Liberty.addShoeBrandNames("Force 10");
		System.out.println("is shoe brand added : " +isAdded);
		
		 isAdded = Liberty.addShoeBrandNames("Freedom");
		System.out.println("is shoe brand added : " +isAdded);
		
		 isAdded = Liberty.addShoeBrandNames("Prefect");
		System.out.println("is shoe brand added : " +isAdded);
		
		 isAdded = Liberty.addShoeBrandNames("Healers");
		System.out.println("is shoe brand added : " +isAdded);
		
		 isAdded = Liberty.addShoeBrandNames("Senorita");
		System.out.println("is shoe brand added : " +isAdded);
		
		 isAdded = Liberty.addShoeBrandNames("Lucy & Luke");
		System.out.println("is shoe brand added : " +isAdded);
		
		 isAdded = Liberty.addShoeBrandNames("Coolers");
		System.out.println("is shoe brand added : " +isAdded);
		
		 isAdded = Liberty.addShoeBrandNames("Coolers");
		System.out.println("is shoe brand added : " +isAdded);
		
		 boolean isUpdated = Liberty.updateShoeBrandName("Coolers", "FootFun");
		 System.out.println("is shoe name is updated : "+isUpdated);
		
		
		
		Liberty.getAllShoeBranNames();
		
		
		Liberty.deleteShoeBrand("Prefect");
		
		Liberty.getAllShoeBranNames();
		
		}


}