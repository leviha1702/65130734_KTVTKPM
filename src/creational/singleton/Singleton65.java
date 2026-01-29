package creational.singleton;

public class Singleton65 {
    private static Singleton65 instance;
    int count = 0;
    private Singleton65(){
    }
    public static Singleton65 getInstance(){
        if (instance == null)
            instance = new Singleton65();
        return instance;
    }
    public void myPrint(){
        System.out.println(++count);
    }
}
