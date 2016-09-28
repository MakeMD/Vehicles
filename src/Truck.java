

public class Truck extends Vehicles  {
	
	
	@Override
	public int drive() {
		if (speed >= 180){
			speed = 180;
		}
		return speed;
	}
	
	
}
