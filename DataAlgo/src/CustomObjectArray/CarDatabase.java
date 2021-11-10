package CustomObjectArray;

public class CarDatabase {
	
	Car[] carList = new Car[3];
	int carsStored;
	
	
	

	  public void createAccount(String name, String color) 
	  {
		    carList[carsStored+1] = new Car(name, color);
		    carsStored++;
	  }
	 public Car pop()
	 {
		 return carList[carsStored];
	 }
}
