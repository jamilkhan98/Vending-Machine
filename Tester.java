//Partners: Jamil Khan, Brandon Walker
//10/10/2018
//Simulate a Vending Machine where user can purchase products and operator can restock products and remove money
//Inputs required - numerical values which represent either amount of money being given, product being chosen, or option to continue in program
//output portion of project - products available in vending machine, as well as what user has successfully purchased.

package VendingMachineProj;

import java.util.*;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();

		Product one = new Product(5, 1.50, "Snickers");
		Product two = new Product(5, 1.50, "Hershey's");
		Product three = new Product(5, 2.00, "Twix");
		Product four = new Product(5, 1.75, "Payday");
		Product five = new Product(5, 1.25, "Mounds");
		
		Product six = new Product("Reese's");
		six.setCost(1.5); //Sets cost for product
		six.setQuantity(5); //Sets Quantity for product
		
		//products added to arraylist
		products.add(one); products.add(two); products.add(three); products.add(four); products.add(five);
		
		//vending machine object created with products arraylist passed in
		VendingMachine newMachine = new VendingMachine(products);
		
		//additional product added to vending machine
		newMachine.addProduct(six);

		User newOne = new User();
		Operator newOperator = new Operator();
		
		//Scanner in is used to take in input
		Scanner in = new Scanner(System.in);
		
		//user inputs value greater than 0 to start program
		System.out.println("Enter number greater than 0 to start: ");
		double coin = Double.parseDouble(in.nextLine().trim());
		
		//uninitialized double used to represent amount of money to be entered by user
		double totalInserted;
		
		//Prints out menu and takes in input
		while(coin > 0.0) {
			for(int i = 0; i < products.size(); i++) {
				System.out.println(i + 1 + ". " + products.get(i).getName() + ", Cost: " + products.get(i).getCost() + ", Quantity: " + products.get(i).getQuantity() + "\n");
			}
			//allows user to input money
			System.out.println("Enter amount of money to buy product: ");
			totalInserted = Double.parseDouble(in.nextLine().trim());
			
			//allows user to select product			
			System.out.println("Enter product you would like to buy through number: ");
			int chosen = Integer.parseInt(in.nextLine().trim());
			
			//outputs string based on if user entered enough money, and product still in stock
			System.out.println(newOne.selectProduct(totalInserted, products.get(chosen-1), newMachine));
			
			//allows user to have option to continue
			System.out.println("Would you like to continue? (Enter number greater than 0 to continue): ");
			coin = Double.parseDouble(in.nextLine().trim());
			
			//outputs product purchased by user
			System.out.println(newOne);
		}
		//Restocks Machine and money removed when user inputs 0
		System.out.println(newMachine);
		System.out.println("Machine will be restocked now and money removed: ");
		newOperator.restockProduct(newMachine);
		newOperator.removeMoney(newMachine);
		
		//reprints menu to show products have been restocked
		for(int i = 0; i < products.size(); i++) {
			System.out.println(i + 1 + ". " + products.get(i).getName() + ", Cost: " + products.get(i).getCost() + ", Quantity: " + products.get(i).getQuantity() + "\n");
		}
		//allows operator to test machine
		System.out.println("Would the operator like to purchase any products today? (Enter 0 for no): ");
		coin = Double.parseDouble(in.nextLine().trim());
		while(coin > 0.0) {
			//outputs available products from vending machine
			for(int i = 0; i < products.size(); i++) {
				System.out.println(i + 1 + ". " + products.get(i).getName() + ", Cost: " + products.get(i).getCost() + ", Quantity: " + products.get(i).getQuantity() + "\n");
			}
			//allows operator to enter in money
			System.out.println("Enter amount of money to buy product: ");
			totalInserted = Double.parseDouble(in.nextLine().trim());
						
			//allows operator to select product
			System.out.println("Enter product you would like to buy through number: ");
			int chosen = Integer.parseInt(in.nextLine().trim());
			
			//outputs string based on if user entered enough money, and product still in stock
			System.out.println(newOperator.selectProduct(totalInserted, products.get(chosen-1), newMachine));
			
			//allows operator to have option to continue
			System.out.println("Would you like to continue? (Enter number greater than 0 to continue): ");
			coin = Double.parseDouble(in.nextLine().trim());
			
			//outputs products purchased by operator
			System.out.println(newOperator);
		}

	}
}