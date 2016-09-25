

public class Truck extends Vehicles  {
	
	@Override
	public int Driving(){
		if (speed >= 180){
			speed = 180;
		}
		return speed;
	}
	
	
}
