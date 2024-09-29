import exception.EmployeeAlreadyAddedException;
import exception.EmployeeNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class EmployeeBook {

    private  Map<String, Employee> employees = new HashMap<>();

    public void addEmployee(Employee employee) {

        if (employees.containsKey(employee.getFullName())) {
            throw new EmployeeAlreadyAddedException("Such an employee already exists!!!");
        } else {
            employees.put(employee.getFullName(), employee);
            System.out.println("Сотрудник добавлен: " + employee);
        }
    } //// Add

    public void removeEmployee(String firstName, String lastName, String middleName) {
        Employee employee = new Employee(firstName, lastName, middleName);

        if (!employees.containsKey(employee.getFullName())) {
            throw new EmployeeNotFoundException("This employee has not been found");
        }
        employees.remove(employee.getFullName());
    }////remove

    public Employee findEmployee(String firstName, String lastName, String middleName) {
       Employee employee = new Employee(firstName, lastName, middleName);
        if (employees.containsKey(employee.getFullName())) {
            return employees.get(employee.getFullName());
        }
        throw new EmployeeNotFoundException("This employee has not been found");
    }/////find

    public void printAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("В списке нет сотрудников.");
        } else {
            for (Employee employee : employees.values()) {
                System.out.println(employee);
            }
        }
    }/////print

}
