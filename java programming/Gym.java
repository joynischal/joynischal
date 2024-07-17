class Gym{
	
	static String gymEquipmentNames[]={null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean createGymEquipments(String gymEquipmentName){
		boolean isGymEquipmentAdded=false;
		if(gymEquipmentName!=null){
			gymEquipmentNames[index]=gymEquipmentName;
			index++;
			isGymEquipmentAdded=true;
		}
		else{
			System.out.println("Please Provide valid gym Equipments.....");
		}
		return isGymEquipmentAdded;
	}
	
	public static void getGymEquipments(){
		System.out.println("The Gym Equipments are");
		for(String gymEquipmentName:gymEquipmentNames){
			System.out.println(gymEquipmentName);
		}
	}
	}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	       	                         