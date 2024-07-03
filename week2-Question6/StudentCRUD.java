import java.util.ArrayList;
import java.util.Iterator;

public class StudentCRUD {
  ArrayList<Student> students;

  StudentCRUD() {
    students = new ArrayList<>();
  }

  public void createStudent(int id, String name, String department) {
    Student stu = new Student(id, name, department);
    students.add(stu);
    System.out.println("Student with id " + id + " created");
  }

  public Student getStudentById(int id) {
    for (Student stu : students) {
      if (stu.getId() == id)
        return stu;
    }
    System.out.println("Student with id " + id + " not found");
    return null;
  }

  public void updateStudent(int id, String name, String department) {
    Student stu = getStudentById(id);
    if (stu != null) {
      stu.setName(name);
      stu.setDepartment(department);
      System.out.println("Student updated successfully");
    } else {
      System.out.println("Student with given id " + id + " was not found");
    }
  }

  public void deleteStudentById(int id) {
    Iterator<Student> iterator = students.iterator();
    while (iterator.hasNext()) {
      Student stu = iterator.next();
      if (stu.getId() == id) {
        iterator.remove();
        System.out.println("Student with given id " + id + " removed successfully");
        return; // Exit the method after removing the student
      }
    }
    System.out.println("No student with id " + id + " found.");
  }

  public ArrayList<Student> getAllStudents() {
    return students;
  }

  public static void main(String[] args) {
    StudentCRUD ec = new StudentCRUD();
    // CREATE
    ec.createStudent(100, "Rahul", "A");
    ec.createStudent(200, "Priya", "B");

    // READ
    System.out.println(ec.getAllStudents());

    // UPDATE
    ec.updateStudent(200, "Deepika", "C");
    ec.updateStudent(400, "Ram", "D");

    // DELETE
    ec.deleteStudentById(100);
    System.out.println(ec.getAllStudents());
  }
}