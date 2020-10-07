package cse360assignment02;

/**
 * Title: Cse360assignment02
 * Description: First assignment for cse 360, showcasing git management,
 * knowledge in building and testing classes using java, and proper documentation
 * @author Roberto Marracino
 */
public class Cse360assignment02 {

    /**
     * main method to build and test my AddingMachine
     * @param args command line arguments
     */
    public static void main(String[] args) {
        AddingMachine testMachine = new AddingMachine();
        System.out.println("Initial total: " + testMachine.getTotal());
        testMachine.add(5);
        testMachine.subtract(3);
        testMachine.add(8);
        testMachine.add(9);
        testMachine.subtract(6);
        testMachine.subtract(2);
        testMachine.add(4);
        testMachine.subtract(3);
        System.out.println(testMachine.toString());
        System.out.println("Current total: " + testMachine.getTotal());
        testMachine.clear();
        System.out.println(testMachine.toString());
        System.out.println("Total after clear: " + testMachine.getTotal());
    }
    
}
