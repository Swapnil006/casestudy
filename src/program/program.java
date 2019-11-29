package program;
import java.util.Scanner;

import signin.SignIn;
public class program 
{
	static Scanner sc = new Scanner(System.in);
	static SignIn s1 = new SignIn("abc", "abc@123");

	public static void main(String[] args) {
		int choice;
		while((choice = program.menuchoice())!=0)
		{
			switch(choice)
			{
			case 1:
				System.out.println("Enter Username : ");
				sc.nextLine();
				String user = sc.nextLine();
				System.out.println("Enter Password : ");
				String pass = sc.nextLine();
				if(s1.verify(user, pass))
					System.out.println("SignIn Page");
				break;
			}
		}
	}

	

	private static int menuchoice() {
		System.out.println("0. EXIT");
		System.out.println("1. SIGN IN");
		System.out.println("2. SIGN UP");
		System.out.println("Enter Choice : ");
		return sc.nextInt();
	}
	
}
