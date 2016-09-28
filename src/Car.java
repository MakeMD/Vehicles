
public class Car extends Vehicles {
		
	

	@Override
	public int drive() {
		if (speed >= 240){
			speed=240;
		}
		return speed;
	}
	
	

	
}
