package structural.decorator.anvatkimchi;

public class giamGia extends ProductDecorator{
    public giamGia(Product product) {
        super(product);
    }

    @Override
    public String showProduct() {
        return super.showProduct()+" Giảm giá 3.000";
    }

    @Override
    public double totalPrice() {
        return super.totalPrice()-3000;
    }
}
