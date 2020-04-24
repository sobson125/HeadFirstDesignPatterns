package Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(instance.getCheckIfOnlyOneInstanceCreated());
        LazySingleton instance2 = LazySingleton.getInstance();
        System.out.println(instance.getCheckIfOnlyOneInstanceCreated());
    }
}
