public class HW1{
	public static void main(String args[]){
		Automobile vehicle1 = new Automobile(20, 3.14f, 19, 8, 2020); //object for first vehicle
		Automobile vehicle2 = new Automobile(5, 6.32f, 24, 5, 2020); //object for second vehicle

		vehicle1.print_values();
		System.out.print("\n");
		vehicle2.print_values();
	}
}