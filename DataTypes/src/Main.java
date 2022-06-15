import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter first value:");
		
		int firstNumber = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter operator: + , - , * , / ");
		
		String operator = sc.nextLine();
		
		System.out.println("Please enter second value:");
		
		int secondNumber = Integer.parseInt(sc.nextLine());
		
	Calculator a1 = new Calculator();
	
		int answer = 0;
	
		switch(operator) {
		case "+":
			answer = a1.add(firstNumber, secondNumber);
			break;
		case "-":
			answer = a1.sub(firstNumber, secondNumber);
			break;
		case "*":
			answer = a1.multiply(firstNumber, secondNumber);
			break;
		case "/":
			answer = a1.divide(firstNumber, secondNumber);
			break;
		}
		
		System.out.println(firstNumber + operator + secondNumber + "=" + answer);
	
	}
	
}