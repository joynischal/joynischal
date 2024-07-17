class GymRunner{
	public static void main(String[] args){
		
	boolean isAdded = Gym.createGymEquipment("Dumbbells");
	System.out.println("is the gym equipment name added : "+isAdded);
	
	 isAdded = Gym.createGymEquipment("Rope");
	System.out.println("is the gym equipment name added : "+isAdded);
	
	 isAdded = Gym.createGymEquipment("Rowing machine");
	System.out.println("is the gym equipment name added : "+isAdded);
	
	 isAdded = Gym.createGymEquipment("TreadMill");
	System.out.println("is the gym equipment name added : "+isAdded);
	
	 isAdded = Gym.createGymEquipment("Leg Extension Machine");
	System.out.println("is the gym equipment name added : "+isAdded);
	
	 isAdded = Gym.createGymEquipment("Leg Press Machine");
	System.out.println("is the gym equipment name added : "+isAdded);
	
	 isAdded = Gym.createGymEquipment("Spin Bike");
	System.out.println("is the gym equipment name added : "+isAdded);
	
	 isAdded = Gym.createGymEquipment("Elliptical");
	System.out.println("is the gym equipment name added : "+isAdded);
	
	//boolean isUpdated = Gym.updateGymEquipmets("Bench", "Elliptical");
	//System.out.println("is the gym equipment updated : " +isUpdated);
	
	
	Gym.getGymEquipments();
	
	Gym.deleteGymEquipments("Rope");
	
	Gym.getGymEquipments();
	
	}
	


}