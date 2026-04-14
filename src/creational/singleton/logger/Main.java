package creational.singleton.logger;

public class Main {
    static void main(String[] args) {
        Logger l=Logger.getInstance();
        l.setNoiDungLog("jsbdjsdjnwj");
        System.out.println(l.getNoiDungLog());
        Logger l2 = Logger.getInstance();
        System.out.println(l2.getNoiDungLog());

    }
}
