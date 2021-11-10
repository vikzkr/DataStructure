package CustomObjectArray;

public class Main {
	
		public static void main(String[] args) {
			  CarDatabase database = new CarDatabase();
			  database.createAccount("Lambo", "Red");
			  database.createAccount("Punto", "White");

			  // To loop through your database, you can then do
//			  for(int i = 0; i < database.carList.length; i++) {
//			  System.out.println(database.carList[i].toString());
//			  }
			  
			  System.out.println(database.pop());
		}

}
