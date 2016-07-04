package numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShippingCost {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("How much does your package weigh, in lbs?");
		Integer packageWeight = Integer.parseInt(bufferedReader.readLine());
		System.out.println("How far will the package travel, in miles?");
		Integer distanceToTravel = Integer.parseInt(bufferedReader.readLine());
		Integer priceModifier = 2;
		
		Integer price = (packageWeight / 10) + (distanceToTravel / 5) * priceModifier;
		
		System.out.println("The price to ship is: $" + price);
	}
}
