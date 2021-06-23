package src;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		double side, base, heigth, raio;
		int option;

		Scanner input = new Scanner(System.in);
		
		optionsMenu();
		System.out.println("Insert the desired option:");

		option = input.nextInt();

		while (option != 0) {

			switch (option) {
			case 0: {

				System.out.println("See you later!");
				break;

			}
			case 1: {

				System.out.println("Area of a square");
				System.out.println("Insert the value of the side: ");
				side = input.nextDouble();
				
				System.out.println("The area of the square is: " + Square.calculateSquareArea(side));
				break;

			}
			case 2: {

				System.out.println("Area of a rectangle");	
				System.out.println("Insert the base value: ");
				base = input.nextDouble();
				
				System.out.println("Insert the altitude value: ");
				heigth = input.nextDouble();
				
				System.out.println("The area of the rectangle is: " + Rectangle.calculateRectangleArea(base, heigth));

				break;

			}
			case 3: {

				System.out.println("Area of a right triangle");
				
				System.out.println("Insert the base value: ");
				base = input.nextDouble();
				
				System.out.println("Insert the height value: ");
				heigth = input.nextDouble();
				
				System.out.println("The area of the right triangle is: " + RightTriangle.calculateRightTriangleArea(base, heigth));

				break;

			}
			case 4: {
				System.out.println("Circle");
				System.out.println("Insert the radious value: ");
				raio = input.nextDouble();
				
				System.out.println("The circle area is: " + Circle.calculateCircleArea(raio));

				
				break;
			} default:

				System.out.println("We haven't implemented this option yet. Please, choose one option from our menu. " );;
				optionsMenu();

				break;
			}

			System.out.println("Do you want to continue? Please, choose a new operation! ");
			optionsMenu();
			option = input.nextInt();
		}

		input.close();

	}

	static void optionsMenu() {
		System.out.println("=============== OPTIONS MENU ===============");
		System.out.println("0 - Finish the aplication");
		System.out.println("1 - Calculate area of a square");
		System.out.println("2 - Calculate the area of a rectangle");
		System.out.println("3 - Calculate the area of a rigth triangle");
		System.out.println("4 - Calculate the area of a circle");
		System.out.println("============================================");
	}
}
