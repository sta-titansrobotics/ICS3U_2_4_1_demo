class Program1 extends ConsoleProgram {

/**
*Given a number n, calculate the sum of the numbers from 1 to n.
*
* @author: E. Fabroa
*
*/

  
  public void run() {

    // initialize variables
    int intN = readInt("Enter N:" );
    int intSum = 0;  // set the accumulator variable

    // accumulate sum
    for (int i = 1; i <= intN; i++){

      // update our accumulator variable
      intSum = intSum + i;
    }

    // output result
    System.out.println(intSum);
    
  }
}
