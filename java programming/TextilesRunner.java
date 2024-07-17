class TextilesRunner{
	
	public static void main (String[] args){
		
		boolean isAdded = Textiles.addMaterialsName("Cotton");
		System.out.println("textile material name is added : " +isAdded);
		
		 isAdded = Textiles.addMaterialsName("Silk");
		System.out.println("textile material name is added : " +isAdded);
		
		 isAdded = Textiles.addMaterialsName("Linen");
		System.out.println("textile material name is added : " +isAdded);
		
		 isAdded = Textiles.addMaterialsName("Velvet");
		System.out.println("textile material name is added : " +isAdded);
		
		 isAdded = Textiles.addMaterialsName("Chiffon");
		System.out.println("textile material name is added : " +isAdded);
		
		 isAdded = Textiles.addMaterialsName("Crepe");
		System.out.println("textile material name is added : " +isAdded);
		
		 isAdded = Textiles.addMaterialsName("Wool");
		System.out.println("textile material name is added : " +isAdded);
		
	 isAdded = Textiles.addMaterialsName("Polyester");
		System.out.println("textile material name is added : " +isAdded);
		
		 isAdded = Textiles.addMaterialsName("Satin");
		System.out.println("textile material name is added : " +isAdded);
		
		 isAdded = Textiles.addMaterialsName("Denim");
		System.out.println("textile material name is added : " +isAdded);
		
	 isAdded = Textiles.addMaterialsName("Lace");
		System.out.println("textile material name is added : " +isAdded);
		
		 isAdded = Textiles.addMaterialsName("Muslin");
		System.out.println("textile material name is added : " +isAdded);
		
		isAdded = Textiles.addMaterialsName("Nylon");
		System.out.println("textile material name is added : " +isAdded);
		
		 isAdded = Textiles.addMaterialsName("Georgette");
		System.out.println("textile material name is added : " +isAdded);
		
		boolean isUpdated = Textiles.updateMaterial("Cotton", "Leather");
		System.out.println("is textile material name is updated : " +isUpdated);	
		
		Textiles.getAllMaterialNames();
		
		Textiles.deleteMaterial("Polyester");
		
		Textiles.getAllMaterialNames();
	}

}