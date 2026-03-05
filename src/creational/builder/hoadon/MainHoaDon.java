package creational.builder.hoadon;

public class MainHoaDon {
    static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.Builder().buildHeader("HD01","Viet Ha","14/02/2023").addCTHD("Hàng mỹ phẩm",2,2000000,0.1f).build();


    }
}
