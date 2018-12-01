
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				//5.5.Create a new class called Loops. In the main method of this class, 
				//create the following loops with any variables you feel are needed:
				//a.A while loop that prints all even numbers from 0 to 100
				//b.A while loop that prints every 3rd number going backwards from 100 until we reach 0
				//c.A for loop that prints every other number from 1 to 100
				//A for loop that prints every number from 0 to 100, but 
				//if the number is divisible by 3, it prints “Hello” instead of the number, and if the number 
				//is divisible by 5, it prints “World” instead of the number, and if it is divisible by both 3 and 5, it prints “HelloWorld” instead of the number.
				
				
				
				for(int i = 0; i <= 100; i++) {
					
					if(i % 3 == 0 && i % 5 == 0 ) {
						System.out.println("Hello World");
						
					}
					else if(i % 3 == 0) {
						System.out.println("Hello");
					}
						else if(i % 5 == 0) {
						System.out.println("World");
					}
					else {
						System.out.println(i);
				}
				}
				
		
		
		}

			


}

