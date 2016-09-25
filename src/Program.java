
public class Program {

	public static void main(String[] args) {
		Car nissan = new Car();
		int carTank = nissan.GetTankCapacity(); 
		boolean start = nissan.GetStarted();
		int carFuel = nissan.GetTankFuel();
		int carspeed = nissan.Driving(); 
		Truck daf = new Truck();
		int truckTank = daf.GetTankCapacity(); 
			start = daf.GetStarted();
		int truckFuel = daf.GetTankFuel();
		int truckspeed = daf.Driving();
		Moto suzuki = new Moto();
		int motoTank = suzuki.GetTankCapacity(); 
			start = suzuki.GetStarted();
		int motoFuel = suzuki.GetTankFuel();
		int motospeed = suzuki.Driving();
		/*	Moto suzuki = new Moto();
			int  motoTank = suzuki.GetTankCapacity(); 
			boolean start = suzuki.GetStarted();
			int motoFuel = suzuki.GetTankFuel();	
			int speed = suzuki.Driving();
		System.out.println(String.valueOf(suzuki.motoFuel) + " " + String.valueOf(suzuki.tankSize)+ " "+ String.valueOf(suzuki.speed));*/
	}

}
