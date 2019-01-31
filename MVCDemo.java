import controllers.EmployeeController;
import models.EmployeeModel;
import views.EmployeeView;

public class MVCDemo {

	public static void main(String[] args) {
		EmployeeModel emp1 = EmployeeView.registerEmp();
		EmployeeController.fetchEmp(emp1);

	}
}