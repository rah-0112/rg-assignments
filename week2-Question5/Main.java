public class Main {
  public static void main(String[] args) {
    Person person = new Person("Alice", 30);

    System.out.println("Initial Name: " + person.getName());
    System.out.println("Initial Age: " + person.getAge());

    person.setName("Bob");
    person.setAge(25);

    System.out.println("Updated Name: " + person.getName());
    System.out.println("Updated Age: " + person.getAge());
    person.displayPerson();
  }
}
