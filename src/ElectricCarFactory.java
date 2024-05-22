public class ElectricCarFactory extends CarFactory{

  @Override
  public int getProducedCars() {
    return super.getProducedCars();
  }

  @Override
  public Car produceCar() {
    return super.produceCar();
  }

  @Override
  boolean updateCarId(Car car, String carId) {
    return super.updateCarId(car, carId);
  }

  @Override
  boolean updateCarColor(Car car, String color) {
    return super.updateCarColor(car, color);
  }
}
