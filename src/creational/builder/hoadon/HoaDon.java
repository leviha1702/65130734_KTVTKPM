package creational.builder.hoadon;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader header;
    List<CTHD> cthds;
    protected HoaDon(Builder b){
        this.header=b.header;
        this.cthds=b.cthds;
    }

    public void inHD(){
        System.out.println(header.toString());
        for (var cthd:cthds)
            System.out.println(cthd.toString());
    }

    public static class Builder{
        HoaDonHeader header;
        List<CTHD> cthds=new ArrayList<>();
        public Builder buildHeader(String id,String tenKH,String ngayBan) {
            header = new HoaDonHeader(id, tenKH, ngayBan);
            return this;
        }
        public Builder addCTHD(String sanPham, int soluong, int dongia, float chietkhau){
            cthds.add(new CTHD(sanPham,soluong,dongia,chietkhau));
            return this;
        }
        public HoaDon build(){
            return new HoaDon(this);
        }
    }


}
