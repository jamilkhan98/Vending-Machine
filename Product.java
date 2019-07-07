//Partners: Jamil Khan, Brandon Walker
//10/10/2018
//Simulate a Vending Machine where user can purchase products and operator can restock products and remove money
//Inputs required - numerical values which represent either amount of money being given, product being chosen, or option to continue in program
//output portion of project - products available in vending machine, as well as what user has successfully purchased.

package VendingMachineProj;

public class Product {
	private int quantity;
	private double cost;
	private String name;
	
	/**
	 * null constructor for Product class, which initializes quantity, cost and name of Product object
	 */
	public Product() {
		quantity = 0;
		cost = 0.0;
		name = "";
	}
	
	/**
	 * Overloaded constructor for Product which takes in name as argument
	 * @param label name to be set for Product object
	 */
	public Product(String label) {
		name = label;
	}
	
	/**
	 * Overloaded constructor for Product which takes in quantity, price, and name of Product object
	 * @param number sets quantity to number
	 * @param price sets cost to price
	 * @param label sets name to the label
	 */
	public Product(int number, double price, String label) {
		quantity = number;
		cost = price;
		name = label;
	}
	
	/**
	 * Sets quantity to the new Quantity
	 * @param newQuantity quantity for Product
	 */
	public void setQuantity(int newQuantity) {
		quantity = newQuantity;
	}
	
	/**
	 * Sets the cost to the new cost
	 * @param newCost cost for Product
	 */
	public void setCost(double newCost) {
		cost = newCost;
	}
	
	/**
	 * Sets name to the new name
	 * @param newName name for Product
	 */
	public void setName(String newName) {
		name = newName;
	}
	/**
	 * @return returns quantity of Product
	 */
	public int getQuantity() {
		return quantity;
	}
	
	/**
	 * @return returns cost of Product
	 */
	public double getCost() {
		return cost;
	}
	
	/**
	 * @return returns name of Product
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Overridden toString method for Product object
	 * @return returns string saying the quantity, name and cost of a product
	 */
	public String toString() {
		return "There are currently " + quantity + " of " + name + ", which costs " + cost + ".";
	}
}