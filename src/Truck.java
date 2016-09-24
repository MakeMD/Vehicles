

public class Truck extends Vehicles  {
	
	@Override
	public int Driving(){
		if (speed >= 180){
			speed = 180;
		}
		return speed;
	}
	
	static Truck daf = new Truck();
	
	static	int  truckTank = daf.GetTankCapacity(); 
	static boolean start = daf.GetStarted();
	static int truckFuel = daf.GetTankFuel();
	static int truckspeed = daf.Driving();
}
