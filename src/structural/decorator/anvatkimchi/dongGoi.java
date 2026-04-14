package structural.decorator.anvatkimchi;

public class dongGoi extends ProductDecorator{
    public dongGoi(Product product) {
        super(product);
    }

    @Override
    public String showProduct() {
        return super.showProduct()+" Đã đóng gói đơn hàng";
    }
}
