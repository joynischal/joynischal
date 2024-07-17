import java.util.*;
class Girias{
	static String homeAppliances[] = {null, null, null, null, null, null, null, null, null, null, null, null};
	static int index;
	
	public static boolean createHomeAppliance(String homeAppliance){
	boolean isHomeApplianceAdded = false;
	if(homeAppliance != null){
	homeAppliances[index] = homeAppliance;
	index++;
	isHomeApplianceAdded = true;
	}else
	System.out.println("Plz provide appliances name .....");
	return isHomeApplianceAdded;
	}
	
	public static void getHomeAppliances(){
		for(String homeAppliance : homeAppliances){
			System.out.println(homeAppliance);
		}
	}
	public static boolean updatedHomeAppliance(String oldHomeAppliance, String newHomeAppliance){
	boolean isHomeApplianceUpdated = false;
	for(int index = 0 ; index<homeAppliances.length; index++){
		if(oldHomeAppliance == homeAppliances[index]){
			homeAppliances[index] = newHomeAppliance;
			isHomeApplianceUpdated = true;
		}
	}
	if(isHomeApplianceUpdated == false){
		System.out.println(oldHomeAppliance + "not found");
	}
	return isHomeApplianceUpdated;
	}
	
	
	public static boolean deleteHomeAppliance(String homeApplianceToBeDeleted){
		System.out.println("homeApplianceToBeDeleted start");
		boolean isHomeApplianceDeleted = false;
		int newIndex, oldIndex;
		for(newIndex = 0 , oldIndex=0; oldIndex < homeAppliances.length ; oldIndex++){
			if(homeAppliances[oldIndex] != homeApplianceToBeDeleted){
					homeAppliances[newIndex] = homeAppliances[oldIndex];
					newIndex++;
				}
			}
			homeAppliances = Arrays.copyOf(homeAppliances, newIndex);
		 if(homeAppliances != null){
			 isHomeApplianceDeleted = true;
		 }
		 if(isHomeApplianceDeleted == false){
			 System.out.println(isHomeApplianceDeleted + "not found");
		 }
		 
		 		 
		System.out.println("isHomeApplianceDeleted end");
		 return isHomeApplianceDeleted;
	}
	




}