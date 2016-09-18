import java.util.Random;

public class Capacity {

	static int tank = 0;
	static int randTank;
	
	public static void tank (){
		Random rand = new Random(); 
		randTank = rand.nextInt(100);
	}
}
