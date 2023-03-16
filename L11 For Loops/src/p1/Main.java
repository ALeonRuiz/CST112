package p1;

public class Main {

	public static void main(String[] args) {
		// part 1: set the initial condition
		// part 2: set the continuation condition: a boolean
		// part 3: changes to make after each iteration
		for (int i = 0; i < 5; i = i + 1) {
			System.out.println("hi");
		}
		System.out.println("End");
	}

}
// 1. create a variable named i and store 0 in it.
// 2. check the continuation condition to see true or false
//    2a: if false, finish the whole for loop
//    2b: if true, do everything in the body of the loop, between
//			// the two {}
// 3. do part 3 to change the condition
// 4. same as step 2 above. Check the continuation condition 
//     to see true or false