public class Singleton {
  // Private static variable to hold the single instance
  private static Singleton singleInstance;

  // Private constructor to prevent instantiation
  private Singleton() {
  }

  // Public static method to provide global access to the instance
  public static Singleton getInstance() {
    if (singleInstance == null) {
      singleInstance = new Singleton();
    }
    return singleInstance;
  }

  public void showMessage() {
    System.out.println("It's a Singleton instance!");
  }
}