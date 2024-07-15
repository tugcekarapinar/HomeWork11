public class SingletonTestManager {
    private static SingletonTestManager instance;

    private SingletonTestManager() {}

    public static SingletonTestManager Instance() {
        if (instance == null) {
            instance = new SingletonTestManager();
        }
        return instance;
    }

    public void WriteInfo(){
        System.out.println("Bu Bir Singleton Test Manager'dır");
    }
}