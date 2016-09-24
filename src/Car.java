
public class Car extends Vehicles {
		
	@Override
	public int Driving(){
		if (speed >= 240){
			speed=240;
		}
		return speed;
	}
	
	static Car nissan = new Car();
	static	int  carTank = nissan.GetTankCapacity(); 
	static boolean start = nissan.GetStarted();
	static int carFuel = nissan.GetTankFuel();
	static int carspeed = nissan.Driving();

	
}
