/****************************************************************
 * Name: Maximus Kieu
 * ID: 1212535049
 * Assignment 1
 * Description: This class calculate the total number 
*****************************************************************/
package cse360assign2;

public class AddingMachine {
	
	private int total;
	private String keepTrack = "";
	
	/*
	 * This is a constructor that set total to 0
	 */
	public AddingMachine () {
		total = 0;    // not needed - included for clarity
	}
	
	/*
	 * This method is return the total number 
	 */
	public int getTotal () {
		return total;
	}
	
	/*
	 * This method will add the parameter "value" to total
	 * each time the method is call
	 * the string "+ 'value' " will be add to the string keepTrack
	 * to keep track of the history of the calculation
	 * @value the value that will use to add
	 */
	public void add (int value) {
		total += value;
		
		keepTrack += "+ ";
		keepTrack += Integer.toString(value);
		keepTrack += " ";
	}
	
	/*
	 * This method will subtract the parameter "value" to total
	 * each time the method is call
	 * the string "- 'value' " will be add to the string keepTrack
	 * to keep track of the history of the calculation
	 * @value the value that will use to subtract
	 */
	public void subtract (int value) {
		total -= value;
		keepTrack += "- ";
		keepTrack += Integer.toString(value);
		keepTrack += " ";
	}
	
	/*
	 * This method will print out a string 
	 * with the initial value is 0 with the history of calculation
	 */
	public String toString () {
		return "0 " + keepTrack;
	}
	
	/* 
	 * This method will clear all the numbers
	 */
	public void clear() {
		
	}
}
