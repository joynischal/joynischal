class PenRunner{
	public static void main(String[] args){
		
	//ClassName ref = new ClassName();
	
	Pen ref = new Pen();// object creation logic
	ref.name = "Cello";
	ref.id = 2;
	ref.color = "Blue";
	ref.prize = 10.00;
	
	System.out.println("The pen brand name is  : " + ref.name);
	
	
	
	Pen ref1 = new Pen();
	ref1.name = "Parker";
	ref1.id = 2;
	ref1.color = "green";
	ref1.prize=250.00;
	
	System.out.println("the pen prize is : " +ref1.prize);
	}


}