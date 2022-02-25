

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello World from new branch!!");
		System.out.println("Adding few more lines");
		int num1 = 10;
		int num2 = 20;
		System.out.println("Sum is " + add(num1, num2));
		
	}
	
	private static int add(int num1, int num2) {
		return num1 + num2;
	}
	
}
