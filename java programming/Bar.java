import java.util.*;
class Bar{
	static String wineBrandNames[] = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
	static int index;
	
	public static boolean addWineBrands(String wineBrandName){
	boolean isWineBrandNameAdded = false;
	if(wineBrandName != null){
	wineBrandNames[index] = wineBrandName;
	index++;
	isWineBrandNameAdded = true;
	}else{
	System.out.println("please add wine brand name");
	}
	return isWineBrandNameAdded;
	}
	
	public static void getAllWineBrands(){
	for(String wineBrandName : wineBrandNames ){
	System.out.println(wineBrandName);
	}
	}
	
	public static boolean updateWineBrandNames(String oldWineBrandName , String newWineBrandName){
		boolean isWineBrandNameUpdated = false;
		for(int index = 0 ; index < wineBrandNames.length; index++){
			if(wineBrandNames[index] == oldWineBrandName){
				wineBrandNames[index] = newWineBrandName;
				isWineBrandNameUpdated=true;
			}
		}
		if(isWineBrandNameUpdated== false){
			System.out.println(oldWineBrandName + "not found");
		}
		return isWineBrandNameUpdated;
		
		
	}
	
	public static boolean deleteWineBrand(String wineBrandNameToBeDeleted){
		System.out.println("wineBrandNameToBeDeleted start");
		boolean isWineBrandNameDeleted = false;
		int newIndex, oldIndex;
		for(newIndex = 0 , oldIndex=0; oldIndex < wineBrandNames.length ; oldIndex++){
			if(wineBrandNames[oldIndex] != wineBrandNameToBeDeleted){
					wineBrandNames[newIndex] = wineBrandNames[oldIndex];
					newIndex++;
				}
			}
			wineBrandNames = Arrays.copyOf(wineBrandNames, newIndex);
		 if(wineBrandNames != null){
			 isWineBrandNameDeleted = true;
		 }
		 if(isWineBrandNameDeleted == false){
			 System.out.println(isWineBrandNameDeleted + "not found");
		 }
		 
		 		 
		System.out.println("isWineBrandNameDeleted end");
		 return isWineBrandNameDeleted;
	}



}