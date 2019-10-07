/*
 * Name: Garrett Hoffmann
 * Class ID: 2019Fall-T-CSE360-70641
 * Assignment Number: 2
 * Description: provides a class that allows basic math operations
 *  on a member integer and can output the result of the operations
 *  as well as the order the operations were done.
 */

package cse360assign2;
/**
 * AddingMachine is a class that holds a private
 *  integer holding the result of basic math operations done by
 *  its private methods. Can then return the order of operations
 *  performed on the member integer in the toString method
 */
public class AddingMachine {

	/**
	 * member integer that hold the result of the operations
	 *  performed
	 */
	private int total;
	
	/**
	 * public constructor that assigns the "total" member variable
	 *  to 0.
	 * @param N/A
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * getTotal returns the total of the number of operations
	 *  performed on the "total" member variable.
	 * (NOTE: this function has not been implemented yet)
	 * @param none
	 * @return total, which is the total value of all operations
	 *  performed
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * add allows the "total" value to be changed by adding
	 *  the parameter to the member "total"
	 * (NOTE: this function has not been implemented yet)
	 * @param value is the value to be added to "total"
	 * @return none
	 */
	public void add (int value) {
		
	}
	
	/**
	 * subtract allows the "total" to be changed by subtracting
	 *  the parameter from "total."
	 * (NOTE: this function has not been implemented yet)
	 * @param value is the value to be subtracted from "total"
	 * @return none
	 */
	public void subtract (int value) {
		
	}
		
	/**
	 * returns a string that represents the operations performed on
	 *  "total" in order
	 * (NOTE: this function has not been implemented yet)
	 * @param none
	 * @return a string that represents the operations
	 *  performed on "total"
	 */
	public String toString () {
		return "";
	}

	/**
	 * sets the value of "total" to 0 and removes the history
	 *  of operations
	 *  @param none
	 *  @return none
	 */
	public void clear() {
	
	}
}
