// basic example of car class in oop.

class Car{
       String brand;  // properties
       String color;  //properties
       int price;    //properties

	void accelerate(){  //behavior / methods
	 System.out.println("A car accelerates");
	} 
}

class oopexample{
	public static void main(String[] args){

		Car c = new Car();
		c.brand = "Maruthi";
		c.color = "blue";
		c.price = 120000;

		System.out.println("Brand: "+c.brand);
		System.out.println("Color: "+c.color);
		System.out.println("Price: "+c.price);
	}
}
