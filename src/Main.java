import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee(new Employee("Ivanov", "Ivan", "Ivanovich"));
        employeeBook.addEmployee(new Employee("Petrov", "Petr", "Petrovich"));
        employeeBook.addEmployee(new Employee("Mamaev", "Renat", "Maratovich"));
        employeeBook.addEmployee(new Employee("Simonova", "Olga", "Petrovna"));
        employeeBook.addEmployee(new Employee("Lavsky", "Artyom", "Viktorovich"));
        System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");
        System.out.println(employeeBook.findEmployee("Ivanov", "Ivan", "Ivanovich"));
        System.out.println("-------------------------------------------------------------");
        employeeBook.removeEmployee("Ivanov", "Ivan", "Ivanovich");
        employeeBook.printAllEmployees();
        employeeBook.addEmployee(new Employee("Petrov", "Petr", "Petrovich"));


    }
}