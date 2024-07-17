import java.util.*;
class Textiles{
	static String materialNames[] = {null, null, null, null, null, null, null, null, null, null, null, null, null, null};
	static int index ;
	
	
	public static boolean addMaterialsName(String materialName){
		boolean isMaterialNamesAdded = false;
		if(materialName != null){
			materialNames[index] = materialName;
			index++;
		isMaterialNamesAdded = true;
		}else{
			System.out.println("Please provide the material name");
		}
		return isMaterialNamesAdded;		
	}
	
	public static void getAllMaterialNames(){
		for(String materialName : materialNames){
			System.out.println(materialName);
		}
	}
	
	public static boolean updateMaterial(String oldMaterialNames , String newMaterialNames){
		boolean isMaterialNamesUpdated = false;
		for(int index = 0; index < materialNames.length ; index++){
			if(materialNames[index] == oldMaterialNames){
				materialNames[index] = newMaterialNames;
				isMaterialNamesUpdated = true;
				
			}
		} if (isMaterialNamesUpdated == false)
			System.out.println(oldMaterialNames + "not found");
		return isMaterialNamesUpdated;
	}
	
	public static boolean deleteMaterial(String materialNameToBeDeleted){
		System.out.println("materialNameToBeDeleted start");
		boolean isMaterialNameDeleted = false;
		int newIndex, oldIndex;
		for(newIndex = 0 , oldIndex=0; oldIndex < materialNames.length ; oldIndex++){
			if(materialNames[oldIndex] != materialNameToBeDeleted){
					materialNames[newIndex] = materialNames[oldIndex];
					newIndex++;
				}
			}
			materialNames = Arrays.copyOf(materialNames, newIndex);
		 if(materialNames != null){
			 isMaterialNameDeleted = true;
		 }
		 if(isMaterialNameDeleted == false){
			 System.out.println(isMaterialNameDeleted + "not found");
		 }
		 
		 		 
		System.out.println("isMaterialNameDeleted end");
		 return isMaterialNameDeleted;
	}
	



}