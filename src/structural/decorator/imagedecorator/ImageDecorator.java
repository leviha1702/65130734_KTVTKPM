package structural.decorator.imagedecorator;

public class ImageDecorator implements Image{
    Image image;

    public ImageDecorator(Image image) {
        this.image = image;
    }

    @Override
    public String ShowImage() {
        return image.ShowImage();
    }
}
