package ems;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
	ArrayList<Employee1> a = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void save() {
		System.out.println("Enter id : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name : ");
		String name = sc.nextLine();
		System.out.println("Enter salary : ");
		double salary = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter designation : ");
		String designation = sc.nextLine();

		a.add(new Employee1(id, name, salary, designation));
	}

	public void update() {
		System.out.print("Enter value 1 to " + a.size()+" : ");
		// Ask input from the user
		int choice = sc.nextInt();
		sc.nextLine();
		if (choice >= 0 && choice <= a.size()) {
			Employee1 selectedEmployee = a.get(choice - 1);
			System.out.println("Enter New Name : ");
			String newName = sc.nextLine();
			System.out.println("Enter New Salary : ");
			double newSalary = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter New Designation : ");
			String newDesignation = sc.nextLine();

			// Now update the new details through setter of Employee
			selectedEmployee.setName(newName);
			selectedEmployee.setSalary(newSalary);
			selectedEmployee.setDesignation(newDesignation);

			System.out.println("Updation Completed Successfully");
		} else {
			System.out.println("Enter valid Number");
		}
	}

	public void getAllData() {
		// iterate through the list
		for (int i = 0; i < a.size(); i++) {
			Employee1 selectEmployee = a.get(i);
			System.out.println("\nEmployee Id : " + selectEmployee.id);
			System.out.println("Name : " + selectEmployee.name);
			System.out.println("Salary : " + selectEmployee.salary);
			System.out.println("Designation : " + selectEmployee.designation);
			System.out.println("----------------------------");
		}
	}

	public void getDataById() {
		// Display the available id's in the Employee ArrayList
		System.out.println("List of Employee Id : ");
		for (int i = 0; i < a.size(); i++) {
			Employee1 emp = a.get(i);
			System.out.println(emp.id + ", ");
		}
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		boolean employeeFound = false;

		for (Employee1 emp : a) {
			if (emp.id == choice) {
				System.out.println("Employee Id : " + emp.id);
				System.out.println("Name : " + emp.name);
				System.out.println("Salary : " + emp.salary);
				System.out.println("Designation : " + emp.designation);
				employeeFound = true;
				break;
			}
		}
		if (!employeeFound) {
			System.out.println("----Entered Employee Id is invaild");
		}
	}

	public void remove() {
		System.out.println("List of Employee Id : ");
		for (int i = 0; i < a.size(); i++) {
			Employee1 emp = a.get(i);
			System.out.println(emp.id + ", ");
		}
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		boolean removed = false;
		for (Employee1 emp : a) {
			if (emp.id == choice) {
				a.remove(emp);
				removed = true;
				System.out.println(emp.id + " is Removed...");
				break;
			}
		}
		if (!removed) {
			System.out.println("Invalid Employee Id");
		}
	}
}
