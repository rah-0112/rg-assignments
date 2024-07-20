// Existing interface
interface Vehicle {
  void start();
}

// Existing implementations
class Car implements Vehicle {
  @Override
  public void start() {
    System.out.println("Car is starting");
  }
}

class Bike implements Vehicle {
  @Override
  public void start() {
    System.out.println("Bike is starting");
  }
}

// Evolving the interface by adding a default method
interface EnhancedVehicle extends Vehicle {
  // Default method
  default void stop() {
    System.out.println("Vehicle is stopping");
  }
}

public class BackwardCompatibility {
  public static void main(String[] args) {
    Car myCar = new Car();
    Bike myBike = new Bike();

    // Calling existing method
    myCar.start();
    myBike.start();

    EnhancedVehicle myEnhancedCar = new Car()::start;
    EnhancedVehicle myEnhancedBike = new Bike()::start;

    // Calling the new default method without modifying existing implementations
    myEnhancedCar.stop();
    myEnhancedBike.stop();
  }
}
