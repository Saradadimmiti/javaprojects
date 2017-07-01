package Ooops6;

class I {
	Vehicle getVehicle(){
		return new Vehicle();
	}
}
class J extends I{
	Car getCar(){
		return new Car();
	}
}
