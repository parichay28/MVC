package controllers;

import models.EmployeeModel;
import views.EmployeeView;

public class EmployeeController {

	public static EmployeeModel createEmp(String name, int id, float sal) {
		EmployeeModel empmodel = new EmployeeModel(name, id, sal);
		return empmodel;
	}

	public static void fetchEmp(EmployeeModel empmodel) {

		EmployeeView.showEmpDetails(empmodel.getName(), empmodel.getId(), empmodel.getSalary());
	}

}
