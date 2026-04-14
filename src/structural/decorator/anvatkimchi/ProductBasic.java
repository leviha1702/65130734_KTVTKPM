package structural.decorator.anvatkimchi;

public class ProductBasic implements Product{
    String tenSP,moTa;
    double price;

    public ProductBasic(String moTa, double price, String tenSP) {
        this.moTa = moTa;
        this.price = price;
        this.tenSP = tenSP;
    }

    @Override
    public double totalPrice() {
        return price;
    }

    @Override
    public String showProduct() {
        return "Tên sản phẩn: "+tenSP+" và "+moTa;
    }
}
