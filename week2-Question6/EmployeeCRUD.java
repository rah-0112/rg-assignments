import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeCRUD {
  ArrayList<Employee> employees;

  EmployeeCRUD() {
    employees = new ArrayList<>();
  }

  public void createEmployee(int id, String name, String department) {
    Employee emp = new Employee(id, name, department);
    employees.add(emp);
    System.out.println("Student with id " + id + " created");
  }

  public Employee getStudentById(int id) {
    for (Employee emp : employees) {
      if (emp.getId() == id)
        return emp;
    }
    System.out.println("Student with id " + id + " not found");
    return null;
  }

  public void updateEmployee(int id, String name, String department) {
    Employee emp = getStudentById(id);
    if (emp != null) {
      emp.setName(name);
      emp.setDepartment(department);
      System.out.println("Student updated successfully");
    } else {
      System.out.println("Student with given id " + id + " was not found");
    }
  }

  public void deleteEmployeeById(int id) {
    Iterator<Employee> iterator = employees.iterator();
    while (iterator.hasNext()) {
      Employee emp = iterator.next();
      if (emp.getId() == id) {
        iterator.remove();
        System.out.println("Student with given id " + id + " removed successfully");
        return; // Exit the method after removing the student
      }
    }
    System.out.println("No student with id " + id + " found.");
  }

  public ArrayList<Employee> getAllEmployees() {
    return employees;
  }

  public static void main(String[] args) {
    EmployeeCRUD ec = new EmployeeCRUD();
    // CREATE
    ec.createEmployee(100, "Rahul", "A");
    ec.createEmployee(200, "Priya", "B");

    // READ
    System.out.println(ec.getAllEmployees());

    // UPDATE
    ec.updateEmployee(200, "Deepika", "C");
    ec.updateEmployee(400, "Ram", "D");

    // DELETE
    ec.deleteEmployeeById(100);
    System.out.println(ec.getAllEmployees());
  }
}