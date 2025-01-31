package demo1;

public class Car extends Vehicle {
	int acceleration = 0;
	@Override
	public void accelerate() {
		System.out.println("Car is moving");
		acceleration = acceleration + 10;
	}
	
	@Override
	public void showAcceleration(){
		System.out.println(acceleration);
	}

}
