public class Moto extends Vehicles {
	
	
	
	@Override
	public int GetTankFuel(){
		tankFuel = tankFuel/2;
		return tankFuel;
	}

	@Override
	public int drive() {
		if (speed >= 120){
			speed = 120;	
		}
		return speed;
	}
	
	
	
}
