public class Main {
    public static void main(String[] args) {

        // Singleton kullanımı
        SingletonTestManager singletonTestManager1 = SingletonTestManager.Instance();
        singletonTestManager1.WriteInfo();

    }
}