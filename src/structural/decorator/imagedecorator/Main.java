package structural.decorator.imagedecorator;

public class Main {
    static void main(String[] args) {
        Image img = new BasicImage("anh.jmg");
        System.out.println(img.ShowImage());
        img = new BorderDecorator(img);
        System.out.println(img.ShowImage());
        img = new WatermarkDecorator(img);
        System.out.println(img.ShowImage());

    }
}
