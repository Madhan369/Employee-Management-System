package ems;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Controller controller = new Controller();
		int userOption = -1;

		while (userOption != 0) {
			System.out.println("\n 1.Save \n 2.Update \n 3.GetAllDetails \n 4.GetDataById \n 5.Remove \n 6.Exit");
			System.out.print("\nEnter Your Choice : ");
			userOption = sc.nextInt();

			switch (userOption) {
			case 1: {
				controller.save();
				break;
			}
			case 2: {
				controller.update();
				break;
			}
			case 3: {
				controller.getAllData();
				break;
			}
			case 4: {
				controller.getDataById();
				break;
			}
			case 5: {
				controller.remove();
				break;
			}
			case 6: {
				System.out.println("Exiting........");
				System.exit(0);
			}
			case 0: {
				System.out.println("Program Terminated");
				break;
			}
			default: {
				System.out.println("-----Enter only Given Options--------");
			}
			}
		}
		sc.close();
	}
}
