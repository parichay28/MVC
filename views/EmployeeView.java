package views;

import java.util.Scanner;

import controllers.EmployeeController;
import models.EmployeeModel;

public class EmployeeView {
	public static void showEmpDetails(String name, int id, float sal) {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee ID: " + id);
		System.out.println("Employee Salary: " + sal);
	}

	public static EmployeeModel registerEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Employee ID: ");
		int id = sc.nextInt();

		System.out.print("Enter Employee Salary: ");
		float sal = sc.nextFloat();

		return EmployeeController.createEmp(name, id, sal);
	}

}
