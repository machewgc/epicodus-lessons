package foreach;

public class GroceryList {
	public static void main(String[] args) {
		String[] myGroceryList = { "eggs", "milk", "bread", "bananas", "cereal", "rice" };
		System.out.println("My grocery list:");
		
		for ( Integer index = 0 ; index < myGroceryList.length ; index++ ) {
			System.out.println( myGroceryList[index] );
		}
	}
}
