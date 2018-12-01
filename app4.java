
public class app4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.What do each of the following Boolean expressions evaluate to?
		
		boolean expression1 = true && false; //false
		System.out.println(expression1);
		boolean expression2 = true || false; //true
		System.out.println(expression2);
		boolean expression3 = false && false; //true
		System.out.println(expression3);
		boolean expression4 = true && (false || true); //true
		System.out.println(expression4);
		boolean expression5= false || (true && false); //false
		System.out.println(expression5);
		boolean expression6 = false || 1 < 5; //true
		System.out.println(expression6);
		boolean expression7 = 5 >= 4 && 1 > 3; //false
		System.out.println(expression7);
		boolean expression8 = 10 < 4 || 1 > 4; //false
		System.out.println(expression8);
		boolean expression9 = 12 >= 2 && 1 < 24; //true
		System.out.println(expression9);
		boolean result =  10 > 1 && 10 > 100;
		System.out.println(result);
		
		boolean result2 = "Hello" .charAt(0) == 'h';
		System.out.println(result2);

	}

}
