package behavioral.stratery.duck_65cntt;

public class VitGioi extends Duck65{
    @Override
    public void display() {
        System.out.println("Em la Vit Co");
        performFly();
        performQuack();
        swim();
        System.out.println("Ngay mai em lay vit gioi");
    }
}
