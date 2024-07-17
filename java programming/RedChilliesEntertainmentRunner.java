class RedChilliesEntertainmentRunner{
	public static void main(String[] args){
	
	boolean isAdded = RedChilliesEntertainment.addMovieActors("Shah Rukh Khan");
	System.out.println("is Movie Actor name is added : "+isAdded);
	
	 isAdded = RedChilliesEntertainment.addMovieActors("Gauri Khan");
	System.out.println("is Movie Actor name is added : "+isAdded);
	
	 isAdded = RedChilliesEntertainment.addMovieActors("Farah Khan");
	System.out.println("is Movie Actor name is added : "+isAdded);
	
	 isAdded = RedChilliesEntertainment.addMovieActors("Juhi Chawla");
	System.out.println("is Movie Actor name is added : "+isAdded);
	
	 isAdded = RedChilliesEntertainment.addMovieActors("Taapsee Pannu");
	System.out.println("is Movie Actor name is added : "+isAdded);
	
	 isAdded = RedChilliesEntertainment.addMovieActors("Aziz Mirza");
	System.out.println("is Movie Actor name is added : "+isAdded);
	
	 isAdded = RedChilliesEntertainment.addMovieActors("Gaurav Verma");
	System.out.println("is Movie Actor name is added : "+isAdded);
	
	isAdded = RedChilliesEntertainment.addMovieActors("Karan Johar");
	System.out.println("is Movie Actor name is added : "+isAdded);
	
	 isAdded = RedChilliesEntertainment.addMovieActors("Priyanka Chopra");
	System.out.println("is Movie Actor name is added : "+isAdded);
	
	//boolean isUpdated = RedChilliesEntertainment.updateMovieActors("Shah Rukh Khan", "Deepika Padukone");
	//System.out.println("is movie actors list updated : " +isUpdated);
	
	RedChilliesEntertainment.getMovieActors();
	
	RedChilliesEntertainment.deleteMovieActors("Shah Rukh Khan");
	
	RedChilliesEntertainment.getMovieActors();
	
	RedChilliesEntertainment.deleteMovieActors("Darshan");
	
	RedChilliesEntertainment.getMovieActors();
	
	}



}