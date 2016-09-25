public class Moto extends Vehicles {
	
	@Override
	public int Driving(){
		if (speed >= 120){
			speed = 120;	
		}
		return speed;
	}
	
	@Override
	public int GetTankFuel(){
		tankFuel = tankFuel/2;
		return tankFuel;
	}
	
	
	
}
