import java.util.Scanner;
/**
 * asks user for a number, generates all fizz buzz numbers up to the given number
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for input
    Scanner input = new Scanner(System.in);

    //initialize variables
    int counter = 1; //the counter to check each number in the loop
    int number; //the number given by the user
    int fizz; //the remainder of the # divided by 3
    int buzz; //the remainder of the # divided by 5

    //ask user for number
    System.out.println("Please enter a positive integer to see the FizzBuzz numbers");
    number = input.nextInt();

    //start the loop to check and display FizzBuzz numbers
    while(counter <= number){
      //get the remainderof the number divided by 3 and 5
      fizz = counter % 3;
      buzz = counter % 5;

      //find what to display
      if(fizz == 0 && buzz == 0){ //if divisible by 3 and 5
        System.out.println("FizzBuzz"); //say FizzBuzz
      }else if(fizz == 0){ //if divisible by 3
        System.out.println("Fizz"); //say Fizz
      }else if(buzz == 0){ //if divisible by 5
        System.out.println("Buzz"); //say Buzz
      }else{ //if divisible by neither
        System.out.println(counter); //say the number
      }

      //increase counter by 1
      counter = counter + 1;
    }
    
  }
}
