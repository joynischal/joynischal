import java.util.*;
class WatchShop{
	static String watchBrandNames[] = {null, null, null, null, null, null, null, null, null, null};
	static int index ; 
	
	public static boolean addWatchBrandNames(String watchBrandName){
	boolean isWatchBrandAdded = false;
	if(watchBrandName != null){
	watchBrandNames[index]=  watchBrandName;
	index++;
	isWatchBrandAdded = true; 
	}else
	System.out.println("please add the watch brand names");
	
	return isWatchBrandAdded;
	}
	
	public static void getAllWatchBrands(){
		for(String watchBrandName : watchBrandNames){
			System.out.println(watchBrandName);
		}
	}
	
	public static boolean updateWatchBrands(String oldWatchBrandName, String newWatchbrandName){
		
		boolean isWatchBrandUpdated = false;
		for(int index = 0; index < watchBrandNames.length; index++){
			if(watchBrandNames[index]==oldWatchBrandName){
				watchBrandNames[index]= newWatchbrandName;
				return isWatchBrandUpdated=true;
			}
			
		}
		if(isWatchBrandUpdated == false){
			System.out.println(oldWatchBrandName + "not found");
		}
		return isWatchBrandUpdated;
	}
	
	public static boolean deleteWatchBrand(String watchBrandToBeDeleted){
		System.out.println("watchBrandToBeDeleted start");
		boolean isWatchBrandDeleted = false;
		int newIndex, oldIndex;
		for(newIndex = 0 , oldIndex=0; oldIndex < watchBrandNames.length ; oldIndex++){
			if(watchBrandNames[oldIndex] != watchBrandToBeDeleted){
					watchBrandNames[newIndex] = watchBrandNames[oldIndex];
					newIndex++;
				}
			}
			watchBrandNames = Arrays.copyOf(watchBrandNames, newIndex);
		 if(watchBrandNames != null){
			 isWatchBrandDeleted = true;
		 }
		 if(isWatchBrandDeleted == false){
			 System.out.println(isWatchBrandDeleted + "not found");
		 }
		 
		 		 
		System.out.println("isWatchBrandDeleted end");
		 return isWatchBrandDeleted;
	}

	



}