package structural.decorator.imagedecorator;

public class WatermarkDecorator extends ImageDecorator{
    public WatermarkDecorator(Image image) {
        super(image);
    }

    @Override
    public String ShowImage() {
        return super.ShowImage()+" Đã chèn watermark";
    }
}
