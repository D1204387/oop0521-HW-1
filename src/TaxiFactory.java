public class TaxiFactory extends CarFactory{
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
}
