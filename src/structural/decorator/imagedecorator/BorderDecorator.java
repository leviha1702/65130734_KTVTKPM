package structural.decorator.imagedecorator;

public class BorderDecorator extends ImageDecorator{

    public BorderDecorator(Image image) {
        super(image);
    }

    @Override
    public String ShowImage() {
        return super.ShowImage()+" Đã thêm viền";
    }
}
