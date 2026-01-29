package behavioral.stratery.duck_65cntt;

public class MainDuck65 {
    public static void main(String[] args) {
        Duck65 d = new VitGioi();
        d.setFlyBehavior(new FlyWithSwings());
//        d.setQuackBehavior(new );
        System.out.println("Hello world");
    }
}
