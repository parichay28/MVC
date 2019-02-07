# MVC

## Created separate packages for all three: models, views, and controller.

### MODEL:
  - contains EmployeeModel class
    1. Three private variables with their public getter and setter methods.

### VIEW:
  - contains EmployeeView class
    1. two static methods showEmpDetails and registerEmp
       - a. showEmpDetails takes name, id and salary and print them.
       - b. registerEmp takes name, id and salary input from the user.
     
### CONTROLLER:
  - contains EmployeeController class:
    1. contains two static methods createEmp and fetchEmp for creating an employee and fetching its details.
    
 ### MVCDemo class
  1. creates a reference of EmployeeModel and calls EmployeeView's registerEmp method.
  2. calls fetchEmp method of EmployeeController.
