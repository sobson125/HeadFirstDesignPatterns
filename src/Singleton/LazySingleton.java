package Singleton;

public class LazySingleton {
    private static LazySingleton lazySingleton;
    private int checkIfOnlyOneInstanceCreated = 0;
    private LazySingleton(){
        checkIfOnlyOneInstanceCreated++;
    }

    public static LazySingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return  lazySingleton;
    }

    public int getCheckIfOnlyOneInstanceCreated() {
        return checkIfOnlyOneInstanceCreated;
    }
}
