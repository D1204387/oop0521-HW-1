//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {

    CarFactory newCar = new CarFactory();
    TaxiFactory newTaxi = new TaxiFactory();
    ElectricCarFactory newElectricCar = new ElectricCarFactory();

    Car car1 = newCar.produceCar();
    Car car2 = newTaxi.produceCar();
    Car car3 = newElectricCar.produceCar();
    Car car4 = newCar.produceCar();
    Car car5 = newCar.produceCar();
    Car car6 = newElectricCar.produceCar();


    System.out.println(car1.getCarId() +", "+ car1.getEngineId() +", "+ car1.getColor());
    System.out.println(car2.getCarId() +", "+ car2.getEngineId() +", "+ car2.getColor());
    System.out.println(car3.getCarId() +", "+ car3.getEngineId() +", "+ car3.getColor());
    System.out.println(car4.getCarId() +", "+ car4.getEngineId() +", "+ car4.getColor());
    System.out.println(car5.getCarId() +", "+ car5.getEngineId() +", "+ car5.getColor());
    System.out.println(car6.getCarId() +", "+ car6.getEngineId() +", "+ car6.getColor());

    System.out.println(newCar.getProducedCars());
    System.out.println(newTaxi.getProducedCars());
    System.out.println(newElectricCar.getProducedCars());


    System.out.println(newCar.updateCarId(car1, "CAB1234"));
    System.out.println(newTaxi.updateCarId(car2, "CAB1234"));
    System.out.println(newElectricCar.updateCarId(car3, "CAB1234"));
    System.out.println(newCar.updateCarId(car4, "CLM60082"));
    System.out.println(newCar.updateCarId(car5, "CABc158"));
    System.out.println(newElectricCar.updateCarId(car6, "CAB60000"));

    System.out.println(newCar.updateCarColor(car1, "White"));
    System.out.println(newTaxi.updateCarColor(car2, "Yellow"));
    System.out.println(newElectricCar.updateCarColor(car3, "Black"));
    System.out.println(newCar.updateCarColor(car4, "Blue"));
    System.out.println(newCar.updateCarColor(car5, "White"));
    System.out.println(newElectricCar.updateCarColor(car6, "Black"));

  }
}