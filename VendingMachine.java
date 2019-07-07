//Partners: Jamil Khan, Brandon Walker
//10/10/2018
//Simulate a Vending Machine where user can purchase products and operator can restock products and remove money
//Inputs required - numerical values which represent either amount of money being given, product being chosen, or option to continue in program
//output portion of project - products available in vending machine, as well as what user has successfully purchased.

package VendingMachineProj;

import java.util.*;

public class VendingMachine {
	private double accountTotal;
	private ArrayList<Product> inventory;
	
	/**
	 * null constructor for VendingMachine class which initializes accountTotal and inventory
	 */
	public VendingMachine() {
		accountTotal = 0;
		inventory = new ArrayList<Product>();
	}
	
	/**
	 * sets accountTotal to zero and inventory equal to arraylist passed in constructor
	 * @param catalog arraylist of Products to be stored in vending machine
	 */
	public VendingMachine(ArrayList<Product> catalog) {
		accountTotal = 0;
		inventory = catalog;
	}

	/**
	 * adds item to inventory 
	 * @param added Product object added to inventory of vending machine
	 */
	public void addProduct(Product added){
		inventory.add(added);
	}
	
	/**
	 * Reduces quantity of selected product by 1
	 * @param removed Product object to be removed from vending machine
	 */
	public void removeProduct(Product removed) {
		if(removed.getQuantity() > 0) {
			removed.setQuantity(removed.getQuantity() - 1);
		}
	}
	
	/**
	 * adds money to vending machine's account total 
	 * @param money money used to buy certain product
	 */
	public void collectMoney(double money) {
		accountTotal += money;
	}
	
	/**
	 * gets total amount of money accrued by vending machine
	 * @return returns amount of money in vending machine
	 */
	public double getAccountTotal() {
		return accountTotal;
	}
	
	/**
	 * sets accountTotal to the new Total
	 * @param newTotal double representing new account total for vending machine
	 */
	public void setAccountTotal(double newTotal) {
		accountTotal = newTotal;
	}
	
	/**
	 * @return returns inventory of vending machine
	 */
	public ArrayList<Product> getInventory(){
		return inventory;
	}
	
	/**
	 * Overridden toString method for VendingMachine class
	 * @return returns String representing how much vending machine has gained
	 */
	@Override
	public String toString() {
		return "Vending Machine has accrued " + accountTotal + " dollars.";
	}
}

