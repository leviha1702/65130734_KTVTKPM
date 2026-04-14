package structural.decorator.imagedecorator;

public class BasicImage implements Image{

    private String tenAnh;

    public BasicImage(String tenAnh) {
        this.tenAnh = tenAnh;
    }

    @Override
    public String ShowImage() {
        return tenAnh;
    }
}
