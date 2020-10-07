package cse360assignment02;

/**
 * Title: AddingMachine.java Description: An adding machine that keeps a total
 * and a log of all transactions
 * I have a bad habit of using this. when unnecessary
 *
 * @author Roberto Marracino
 */
public class AddingMachine {

    private int total;
    private String log;

    /**
     * Constructor method that initializes each instance of AddingMachine
     * with a total of 0 and starts the log
     */
    public AddingMachine() {
        this.total = 0;  // not needed - included for clarity
        this.log = "0";
    }
    
    /**
     * getTotal() returns the total of this instance of AddingMachine
     * @return total
     */
    public int getTotal() {
        return this.total;
    }

    /**
     * add() receives a value and adds it to this AddingMachine's total
     * as well as adding the transaction to the log
     * @param value the value to be added
     */
    public void add(int value) {
        this.total += value;
        this.log = this.log.concat(" + " + value);
    }

    /**
     * subtract() receives a value and subtracts it from this AddingMachine's total
     * as well as adding the transaction to the log
     * @param value the value to be subtracted
     */
    public void subtract(int value) {
        this.total -= value;
        this.log = this.log.concat(" - " + value);
    }

    /**
     * toString() prints the log of transactions, each value that has been
     * entered starting with the initial value of 0 including all operations
     * separated by spaces
     * @return log string
     */
    public String toString() {
        return "log: " + this.log;
    }

    /**
     * Clear() clears this AddingMachine by clearing the log and resetting
     * the total value and prints a message to console saying it has
     * been cleared
     */
    public void clear() {
        this.total = 0;
        this.log = "0";
        System.out.println("AddingMachine cleared");
    }
}
