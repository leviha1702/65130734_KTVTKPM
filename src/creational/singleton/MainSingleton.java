package creational.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Singleton65 s1 = Singleton65.getInstance();
        Singleton65 s2 = Singleton65.getInstance();
        s1.myPrint();
        s2.myPrint();
        s1.myPrint();
        s1.myPrint();
        s2.myPrint();
        s1.myPrint();
    }
}
