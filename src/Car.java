public class Car {
  private String carId;
  private final String engineId;
  private String color;

  public Car(String engineId) {
    this.engineId = engineId;
  }

  public Car(String carId, String engineId, String color) {
    this.carId = carId;
    this.engineId = engineId;
    this.color = color;
  }

  public String getCarId() {
    return carId;
  }

  public String getEngineId() {
    return engineId;
  }

  public String getColor() {
    return color;
  }

  public void setCarId(String carId) {
    this.carId = carId;
  }
}
