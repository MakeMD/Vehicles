import java.util.Random;

public class Motorcycle {

	
	static String brandOfMoto[] = {"Kawasaki", "Buggati", "Suzuki", "Duccati", "BMW"};
	static String typeOfMoto[] = {"Standart", "Cruiser", "Sport", "Touring", "Scooter", "Offroader"};
	static int randMoto=0;
	static int randMotoType=0;
	static String motoTank;
	
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
	new Capacity();
	Capacity.tank();
	
	if (Capacity.randTank % 10 !=0){
		Capacity.randTank=(Capacity.randTank/10)*10+10;
	}
	else {
		Capacity.randTank=Capacity.randTank+10;
	}
		
	if (Capacity.randTank <=30){
		motoTank = String.valueOf(Capacity.randTank);
	}
	else if (Capacity.randTank == 0){
		motoTank = String.valueOf(Capacity.randTank+10);
	}
	else if (Capacity.randTank >30){
		motoTank = String.valueOf(Capacity.randTank-70); 
	
	}
	
		System.out.println("Brand of motocycle: " + brandOfMoto[randMoto]);
		System.out.println("Type of motocycle: " + typeOfMoto[randMotoType]);
		System.out.println("Tank capacity: " + motoTank);
	}
}
