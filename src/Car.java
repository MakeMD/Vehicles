import java.util.Random;

public class Car {
	
	static String brandOfCar[] = {"Ford", "Mazda", "Toyota", "Volvo", "BMW"};
	static boolean autoGearbox;
	static String typeOfGear;
	static String typeOfCar[] = {"Economy", "Family", "Saloon", "Luxury", "Sport", "Offroader"};
	static int randCar=0;
	static int randType=0;
	public static boolean getRandomBoolean() {
	       return Math.random() < 0.5;
	}
	public static void getRandomCar(){
		Random rand = new Random(); 
		randCar = rand.nextInt(5);
	}
	public static void getRandomType(){
		Random rand = new Random();
		randType = rand.nextInt(6);
	}
	
	public static void printCar() {
	getRandomBoolean();
	autoGearbox = getRandomBoolean();
	if (autoGearbox== true){
		typeOfGear = "auto gearbox";
	}
	else {
		typeOfGear = "manual gearbox";
	}
	getRandomCar();
	getRandomType();
		System.out.println("Brand of car: " + brandOfCar[randCar]);
		System.out.println("Type of gearbox: " + typeOfGear);
		System.out.println("Type of car: " + typeOfCar[randType]);
	}

}
