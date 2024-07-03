public class Main {
  public static void main(String[] args) {
    Singleton instance = Singleton.getInstance();
    SingletonThreadSafe instance1 = SingletonThreadSafe.getInstance();

    instance.showMessage();
    instance1.showMessage();
  }
}