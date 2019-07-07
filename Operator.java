//Partners: Jamil Khan, Brandon Walker
//10/10/2018
//Simulate a Vending Machine where user can purchase products and operator can restock products and remove money
//Inputs required - numerical values which represent either amount of money being given, product being chosen, or option to continue in program
//output portion of project - products available in vending machine, as well as what user has successfully purchased.

package VendingMachineProj;

import java.util.ArrayList;

public class Operator extends User{
	
	/**
	 * Null constructor for Operator class, which calls constructor of User class
	 */
	public Operator() {
		super();
	}
	
	/**
	 * calls product selection method from user super class
	 * @return String based on circumstances of whether user entered enough money and whether product in stock
	 */
	public String selectProduct(double wallet, Product chosen, VendingMachine machine) {
		return (super.selectProduct(wallet, chosen, machine));
	}
	
	/**
	 * sets quantities for the machines inventory equal to 5
	 * @param machine Vending machine in which products are being stocked
	 */
	public void restockProduct(VendingMachine machine) {
		for(int i = 0; i < machine.getInventory().size(); i++) {
			if(machine.getInventory().get(i).getQuantity() < 5) {
				machine.getInventory().get(i).setQuantity(5);
			}
		}
	}
	
	/**
	 * Sets account total equal to 0
	 * @param machine Vending machine in which money is being removed
	 */
	public void removeMoney(VendingMachine machine) {
		machine.setAccountTotal(0);
	}
	
	/**
	 * calls getCart method from user super class
	 * @return arraylist of Products that operator has purchased
	 */
	public ArrayList<Product> getCart(){
		return super.getCart();
	}
	
	/**
	 * Overridden toString method for Operator class
	 * @return returns outcome of test purchases and products bought by operator
	 */
	public String toString() {
		if(getCart().size() == 0) {
			return "No items have been purchased. Thank you.";
		}
		String s = "";
		for (int i = 0; i < getCart().size(); i ++) {
			s += getCart().get(i).getName() + ", ";
		}
	return "Test purchase successfully completed.\nOperator has tested machine by buying: " + s;
	}
}