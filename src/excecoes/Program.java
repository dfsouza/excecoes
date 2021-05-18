package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		method1();
		System.out.println("End of program");

	}
	
	public static void method1() {
		method2();
	}
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		
		String[] vect = sc.nextLine().split(" ");
		try {
			int position = sc.nextInt();
			System.out.println(vect[position]);
			
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid position!");
			e.printStackTrace();
		}
		catch (InputMismatchException e) {
			System.out.println("Input error!");
		}
		sc.close();
	}

}
