package business;

import java.util.Scanner;

public class restaurant {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		//Describing variables
		double mealcost;
		double tax;
		double totalcost;
		double tip;
		double totalbill;
		
		System.out.println("Please enter the cost of the meal: ");
		mealcost = scanner.nextDouble();
		
		//calculating tax
		tax = 0.0675 * mealcost;
		
		totalcost = mealcost + tax;
		
		tip = 0.2 * totalcost;
		
		totalbill = totalcost + tip;
		
		System.out.println("Cost Of Meal: R"+mealcost);
		System.out.println("Tax: R"+tax);
		System.out.println("Tip: R"+tip);
		System.out.println("TotalBill: R"+totalbill);
	}
}
