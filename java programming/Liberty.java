import java.util.*;
class Liberty{
	static String shoeBrandNames[] = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
	static int index ;
	
	public static boolean addShoeBrandNames(String shoeBrandName){
		boolean isShoeBrandNameAdded = false;
		if(shoeBrandName != null){
			shoeBrandNames[index] = shoeBrandName;
			index++;
			isShoeBrandNameAdded=true;
		}else{
			System.out.println("Please add shoe Brand Name ");
		}
		return isShoeBrandNameAdded;
	}
	
	public static void getAllShoeBranNames(){
		for(String shoeBrandName : shoeBrandNames){
			System.out.println(shoeBrandName);
		}
	}
	
	public static boolean updateShoeBrandName(String oldShoeBrandName, String newShoeBrandName){
		boolean isShoeBrandNameUpdated = false;
		for(int index = 0 ; index < shoeBrandNames.length; index++){
			if(shoeBrandNames[index] == oldShoeBrandName){
				shoeBrandNames[index] = newShoeBrandName;
				isShoeBrandNameUpdated = true ;
			}
		}if(isShoeBrandNameUpdated == false){
			System.out.println(oldShoeBrandName + "not found");
		}
		return isShoeBrandNameUpdated;
	}
	
	public static boolean deleteShoeBrand(String shoeBrandNameToBeDeleted){
		System.out.println("shoeBrandNameToBeDeleted start");
		boolean isShoeBrandNameDeleted = false;
		int newIndex, oldIndex;
		for(newIndex = 0 , oldIndex=0; oldIndex < shoeBrandNames.length ; oldIndex++){
			if(shoeBrandNames[oldIndex] != shoeBrandNameToBeDeleted){
					shoeBrandNames[newIndex] = shoeBrandNames[oldIndex];
					newIndex++;
				}
			}
			shoeBrandNames = Arrays.copyOf(shoeBrandNames, newIndex);
		 if(shoeBrandNames != null){
			 isShoeBrandNameDeleted = true;
		 }
		 if(isShoeBrandNameDeleted == false){
			 System.out.println(isShoeBrandNameDeleted + "not found");
		 }
		 
		 		 
		System.out.println("isShoeBrandNameDeleted end");
		 return isShoeBrandNameDeleted;
	}




}