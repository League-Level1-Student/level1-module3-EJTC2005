package _99_extra;

public class Runner {
	public static void main(String[] args) {
		Car honda = new Car();
		Car chevy = new Car();
		Car tesla = new Car();
		Car.mpg = 1000;
		Car.mpg = 100;
		Car.mpg = 1000000;
		System.out.println(Car.mpg);
		System.out.println(Car.mpg);
		Car.run();
		
		int x = Integer.parseInt("1");
	}
}
