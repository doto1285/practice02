package prob5;

import java.util.Scanner;

public class CalcApp extends Calc{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print(">> ");
			String input = scanner.nextLine();
			if( input.equals("") == true) {
				System.out.println("값을 입력해주세요.");
				continue;
			}
			if( input.equals("quit") == true) {
				break;
			}
			String[] tokens = input.split(" ");
			
			switch (tokens[1]) {
			case "+":
				new Add().setValue(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[2]));
				System.out.println(">> " +calculate);
				break;
				
			case "-":
				new Sub().setValue(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[2]));
				System.out.println(">> " +calculate);
				break;
				
			case "*":
				new Mul().setValue(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[2]));
				System.out.println(">> " +calculate);
				break;
				
			case "/":
				new Div().setValue(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[2]));
				System.out.println(">> " +calculate);
				break;

			default:
				System.out.println("사칙연산을 제대로 입력해주세요.");
				break;
			}
		}
		scanner.close();
	}
}
