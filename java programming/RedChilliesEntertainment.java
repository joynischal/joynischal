class RedChilliesEntertainment{


static String movieActors[]={null,null,null,null,null,null,null,null,null};
static int index;

public static boolean addMovieActors(String movieActor){
	boolean isMovieActorNameAdded=false;
	if(movieActor!=null){
		movieActors[index]=movieActor;
		index++;
		isMovieActorNameAdded=true;
	}
	else System.out.println("Please Provide Valid Movie Actor Names......");
	
	return isMovieActorNameAdded;
}

public static void getMovieActors(){
	System.out.println("The Movie Actor Names are");
	for(String movieActor:movieActors){
		System.out.println(movieActor);
	}
}
}


