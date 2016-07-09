package calc;

import java.util.Scanner;

public class calc {
	int num1,num2;
	int ans;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
calc calc_obj=new calc();
		System.out.println("Enter two numbers::");
		Scanner input_obj=new Scanner(System.in);
		calc_obj.enterNumbers(input_obj);
		printMenu();
		int choice = choiceInput(input_obj);
		switch(choice)
		{
		case 1: calc_obj.addition();
		break;
		case 2: calc_obj.substraction();
		break;	
		
		}

	}

	private  void enterNumbers(Scanner input_obj) {
		num1=input_obj.nextInt();
		num2=input_obj.nextInt();
	}


	private  void substraction() {
		ans=num1-num2;
		System.out.println("Sub is "+ans);
	}

	private void addition() {
		ans=num1+num2;
		System.out.println("Addition is "+ans);
	}

	private static int choiceInput(Scanner input_obj) {
		int choice;
		choice=input_obj.nextInt();
		return choice;
	}

	private static void printMenu() {
		System.out.println("\n Enter 1)ADD 2)SUB 3)MUL");
	}

}
