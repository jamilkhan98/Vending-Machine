//Partners: Jamil Khan, Brandon Walker
//10/10/2018
//Simulate a Vending Machine where user can purchase products and operator can restock products and remove money
//Inputs required - numerical values which represent either amount of money being given, product being chosen, or option to continue in program
//output portion of project - products available in vending machine, as well as what user has successfully purchased.

package VendingMachineProj;

import java.util.*;

public class User {
	private ArrayList<Product> cart;
	
	/**
	 * Null constructor for User class with empty arraylist of Product types
	 */
	public User() {
		cart = new ArrayList<Product>();
	}
	/**
	 * @param wallet amount of money entered in by user
	 * @param chosen Product chosen by user
	 * @param machine Vending Machine in which user purchased product from
	 * @return String based on circumstances of whether user entered enough money and whether product in stock
	 */
	public String selectProduct(double wallet, Product chosen, VendingMachine machine) {
		//will run if user entered enough money and product still in stock
		if(wallet >= chosen.getCost() && chosen.getQuantity() > 0) {
			machine.collectMoney(wallet);
			cart.add(chosen);
			machine.removeProduct(chosen);
		}
		//will return this string if item out of stock
		else if(chosen.getQuantity() == 0){
			return "Item out of stock. Money returned.";
		}
		//will return this string if user did not enter enough money to purchase product
		else {
			return "Insufficient funds. Money returned.";
		}
		//will return this string if user entered enough money and product in stock
		return "You have successfully purchased " + chosen.getName() + ".";
	}
	/**
	 * @return arraylist of Products that user has purchased
	 */
	public ArrayList<Product> getCart(){
		return cart;
	}

	/**
	 * Overridden toString method for User class
	 * @return String of what items have been purchased by user
	 */
	@Override
	public String toString() {
		if(cart.size() == 0) {
			return "No items have been purchased. Have a nice day!";
		}
		String s = "";
		for (int i = 0; i < cart.size(); i ++) {
			s += cart.get(i).getName() + ", ";
		}
		return "User has purchased: " + s;
	}
}