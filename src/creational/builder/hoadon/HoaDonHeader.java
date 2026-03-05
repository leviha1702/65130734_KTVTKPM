package creational.builder.hoadon;

public class HoaDonHeader {
    private String id,tenKH,ngayBan;


    public  HoaDonHeader(String id,String tenKH,String ngayBan) {
        this.id=id;
        this.tenKH=tenKH;
        this.ngayBan = ngayBan;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" +
                "id='" + id + '\'' +
                ", tenKH='" + tenKH + '\'' +
                ", ngayBan='" + ngayBan + '\'' +
                '}';
    }
}
