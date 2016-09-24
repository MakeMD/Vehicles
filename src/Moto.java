public class Moto extends Vehicles {
/*int tankSize=100;
int tankFuel=100;
int speed = 140;*/
	
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
	
	static Moto suzuki = new Moto();
	static	int  motoTank = suzuki.GetTankCapacity(); 
	static boolean start = suzuki.GetStarted();
	static int motoFuel = suzuki.GetTankFuel();
	static int motospeed = suzuki.Driving();
	
}
