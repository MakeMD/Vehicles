
public class Car extends Vehicles {
		
	@Override
	public int Driving(){
		if (speed >= 240){
			speed=240;
		}
		return speed;
	}
	
	

	
}
