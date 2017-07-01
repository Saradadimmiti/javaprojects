package abstraction;
//} = + ] ' " //
public class TestVehicle {
public static void main(String[] args) {
	Vehicle[] vehicles={new SwiftCar(),new Bus()};
	for (Vehicle vehicle : vehicles) {
		vehicle.fillFuel();
		vehicle.start();
		vehicle.stop();
		
	}
}
}
