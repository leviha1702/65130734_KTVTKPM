package creational.builder.hoadon;

public class CTHD {
    private String tenSP;
    private int soLuong,donGia;
    private float ck;
    public CTHD(String tenSP,int soLuong,int donGia,float ck){
        this.tenSP=tenSP;
        this.soLuong=soLuong;
        this.donGia=donGia;
        this.ck=ck;
    }

    @Override
    public String toString() {
        return "CTHD{" +
                "ck=" + ck +
                ", tenSP='" + tenSP + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }
}
