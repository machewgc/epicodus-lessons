package grocerylist;

public class GroceryList {
	public static void main(String[] args) {
		
	    String[] myGroceryList = { "eggs", "milk", "bread", "bananas", "cereal", "rice" };
	    Integer[] groceryItemPrices = { 3, 6, 4, 2, 4, 4 };
		
		System.out.println("My grocery list is:");
		for ( String myGroceryItem : myGroceryList ) {
			System.out.println( myGroceryItem );
		}

		Integer total = 0;
		for ( Integer price : groceryItemPrices ) {
			total += price;
		}
		
		System.out.println("");
		System.out.println("Your total cost is: $" + total);

	}
}
