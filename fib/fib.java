import java.util.Scanner;

public class App {

    static int counter = 0; // initialize the counter variable to 0

static int fibonacci(int term1, int term2, int count) { // define a function that uses recursion to calculate the Fibonacci sequence
	if (counter < count) {
		System.out.print(term1 + " "); // print the first term of the sequence
		counter += 1;    // increment the counter variable
	}
	int nextTerm = term1 + term2; // calculate the next term
    int totalTerms = count; // store the total number of terms in a variable
	if (counter < count) {
		return fibonacci(nextTerm, term1, totalTerms); // recursively call the function to calculate the next term
	} else {
		return nextTerm; // return the sum of the last two terms
	}
}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of terms: ");
    int numOfTerms = input.nextInt(); // read the number of terms from the user
    input.close(); // close the scanner object

    fibonacci(0, 1, numOfTerms); // call the recursive function to calculate and print the Fibonacci sequence

    }
}
