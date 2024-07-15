public class Main {
    public static void main(String[] args) {

        // Singleton kullanımı
        SingletonTestManager singletonTestManager1 = SingletonTestManager.Instance();
        singletonTestManager1.WriteInfo();

        // Builder kullanımı
        TestCase testCase = new TestCaseBuilder()
                .withPart1("Api Testi.")
                .withPart2("Bu Bir Api Testidir.")
                .build();
        System.out.println(testCase);
    }
}