public class Person {
  // Private fields
  private String name;
  private int age;

  // Constructor to initialize the fields
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    // Validation advantage using setter
    if (age > 0) {
      this.age = age;
    } else {
      System.out.println("Age must be positive");
    }
  }

  public void displayPerson() {
    System.out.println("Name: " + name + ", Age: " + age);
  }
}
