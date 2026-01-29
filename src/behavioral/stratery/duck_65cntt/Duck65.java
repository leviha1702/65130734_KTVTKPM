package behavioral.stratery.duck_65cntt;

abstract public class Duck65 {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    public abstract void display();

    public void swim(){
        System.out.println("VN Vo Dich");
    }

    public void performFly(){
        System.out.println(flyBehavior.fly());
    }

    public void performQuack(){
        System.out.println(quackBehavior.quack());
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
