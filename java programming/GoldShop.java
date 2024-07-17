import java.util.*;
class GoldShop{
	static String goldNames[] = {null, null, null, null, null, null, null};
	static int index ;
		
	public static boolean addGoldItem(String goldName){
	boolean isGoldItemAdded = false;
	if(goldName != null){
		goldNames[index] = goldName;
		index++;
		isGoldItemAdded = true;
	}else{
		System.out.println("please add the gold jeweeleries name ");
	}
	
	return isGoldItemAdded;
	
	}
	
	public static void getAllGoldItems(){
		for(String goldName : goldNames){
			System.out.println("The gold jewellery name is : " +goldName);
		}
	}

	
	public static boolean updateGoldItem(String oldGoldName , String newGoldName){
		boolean isGoldNameUpdated = false;
		for(int index = 0 ; index < goldNames.length; index++){
			if(oldGoldName == goldNames[index]){
				goldNames[index]=newGoldName;
				isGoldNameUpdated=true;
			}
		}if(isGoldNameUpdated==false){
			System.out.println(oldGoldName+ "not found");
		}
		return isGoldNameUpdated;
	}
	
	public static boolean deleteGoldName(String goldNameToBeDeleted){
		System.out.println("goldNameToBeDeleted start");
		boolean isGoldNameDeleted = false;
		int newIndex, oldIndex;
		for(newIndex = 0 , oldIndex=0; oldIndex < goldNames.length ; oldIndex++){
			if(goldNames[oldIndex] != goldNameToBeDeleted){
					goldNames[newIndex] = goldNames[oldIndex];
					newIndex++;
				}
			}
			goldNames = Arrays.copyOf(goldNames, newIndex);
		 if(goldNames != null){
			 isGoldNameDeleted = true;
		 }
		 if(isGoldNameDeleted == false){
			 System.out.println(isGoldNameDeleted + "not found");
		 }
		 
		 		 
		System.out.println("isGoldNameDeleted end");
		 return isGoldNameDeleted;
	}


}