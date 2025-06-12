
import java.util.Scanner;

public class JavaPrac3 {
	public static void main(String[] args) {
		String[] cars = {"Toyota" , "Honda", "Ford", "Chevrolet", "Nissan"};
		System.out.println("This is my car:" + cars[0]);
            try (Scanner TargetCar = new Scanner(System.in)) {
                System.out.println("enter the index of the car you want to see (0-4): ");
                int index = TargetCar.nextInt();
                if (index >= 0 && index < cars.length) {
                    System.out.println("The car at index " + index + " is: " + cars[index]);
                } else {
                    System.out.println("Invalid index. Please enter a number between 0 and 4.");
                }
            }
		System.out.println("Here are all the cars:");
		for (int i = 0; i < cars.length; i++) {
			System.out.println("Car at index " + i + ": " + cars[i]);
		}
		System.out.println("Thank you for using the car selection program!");
		System.out.println("Have a great day!");

	}
}