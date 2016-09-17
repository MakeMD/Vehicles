import java.util.Random;

public class Motorcycle {

	
	static String brandOfMoto[] = {"Kawasaki", "Buggati", "Suzuki", "Duccati", "BMW"};
	static String typeOfMoto[] = {"Standart", "Cruiser", "Sport", "Touring", "Scooter", "Offroader"};
	static int randMoto=0;
	static int randMotoType=0;
	
	public static void getRandomMoto(){
		Random rand = new Random(); 
		randMoto = rand.nextInt(5);
	}
	public static void getRandomMotoType(){
		Random rand = new Random();
		randMotoType = rand.nextInt(6);
	}
	
	public static void printMoto() {
	getRandomMoto();
	getRandomMotoType();
		System.out.println("Brand of motocycle: " + brandOfMoto[randMoto]);
		System.out.println("Type of motocycle: " + typeOfMoto[randMotoType]);
	}
}
