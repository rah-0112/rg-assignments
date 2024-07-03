public class SingletonThreadSafe {
  // Private static variable to hold the single instance
  private static volatile SingletonThreadSafe singleInstance;

  // Private constructor to prevent instantiation
  private SingletonThreadSafe() {
  }

  // Public static method to provide global access to the instance
  public static SingletonThreadSafe getInstance() {
    if (singleInstance == null) {
      synchronized (SingletonThreadSafe.class) {
        if (singleInstance == null) {
          singleInstance = new SingletonThreadSafe();
        }
      }
    }
    return singleInstance;
  }

  public void showMessage() {
    System.out.println("It's a thread safe Singleton instance!");
  }
}
