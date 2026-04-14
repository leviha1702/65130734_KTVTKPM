package structural.decorator.imagedecorator;

public class FilterDecorator extends ImageDecorator{
    public FilterDecorator(Image image) {
        super(image);
    }

    @Override
    public String ShowImage() {
        return super.ShowImage()+" Đã áp dụng bộ lọc màu";
    }
}
