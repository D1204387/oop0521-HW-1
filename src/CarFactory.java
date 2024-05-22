public class CarFactory {
  int numOfCars;

  public int getProducedCars(){
    return numOfCars;
  }

  public Car produceCar(){
    
    int engineNum = (int)(Math.random()*100000000);
    String engineId = String.format("%08d", engineNum);
    int num = (int)(Math.random()*10000);
    char[] letters = new char[2];
    for(int i = 0; i <2; i++) {
      int index = (int) (Math.random() * 27);
      letters[i] = (char) (index + 'A');
    }
    String carId = "C" + new String(letters) + num;
    String[] colors = {"White", "Black", "Blue"};
    String color = colors[(int)(Math.random()*3)];
    Car car = new Car(carId, engineId, color );
    numOfCars++;
    return car;
  }

  /*public Car produceCar(String color){
    int engineNum = (int)Math.random()*100000000;
    String engineId = Integer.toString(engineNum);
    int num = (int)(Math.random()*10000);
    char[] letters = new char[2];
    for(int i = 0; i <2; i++) {
      int index = (int) (Math.random() * 26);
      letters[i] = (char) (index + 'A');
    }
    String carId = "C" + new String(letters) + num;
    Car car = new Car(carId, engineId, color );
    numOfCars++;
    return car;
  }*/

  boolean updateCarId(Car car, String carId){
    car.setCarId(carId);
    if(car.getCarId().matches("C[A-Z]{2}[0-9]{4}")){
      return true;
    }
    return false;
  }

  boolean updateCarColor(Car car, String color){

    if(car.getColor().equals(color)){
      return true;
    }
    return false;
  }



}
