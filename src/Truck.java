import java.util.Random;

public class Truck {

	static String brandOfTruck[] = {"Scania", "Volvo", "Mercedes", "Daf", "Renault"};
	static boolean trailer;
	static String trailersup;
	static String typeOfTruck[] = {"Small", "Light", "Medium", "Heavy", "Very heavy"};
	static int randTruck=0;
	static int randTruckType=0;
	static String truckTank;
	public static boolean getRandomBoolean() {
	       return Math.random() < 0.5;
	}
	public static void getRandomTruck(){
		Random rand = new Random(); 
		randTruck = rand.nextInt(5);
	}
	public static void getRandomTruckType(){
		Random rand = new Random();
		randTruckType = rand.nextInt(5);
	}
	
	public static void printTruck() {
	getRandomBoolean();
	trailer = getRandomBoolean();
	if (trailer== true){
		trailersup = "with trailer";
	}
	else {
		trailersup = "without trailer";
	}
	getRandomTruck();
	getRandomTruckType();
	new Capacity();
	Capacity.tank();
	if (Capacity.randTank % 10 !=0){
		Capacity.randTank=(Capacity.randTank/10)*10+10;
	}
	if (Capacity.randTank>=50){
		truckTank = String.valueOf(Capacity.randTank);
	}
	else {
		truckTank = String.valueOf(Capacity.randTank+50); 
	}
		System.out.println("Brand of truck: " + brandOfTruck[randTruck]);
		System.out.println("Trailer: " + trailersup);
		System.out.println("Type of truck: " + typeOfTruck[randTruckType]);
		System.out.println("Tank capacity: " + truckTank);
	}
}
