package behavioral.stratery.cc2;

import java.util.ArrayList;
import java.util.List;

public class MainSoSanh {
    static void main(String[] args) {
        List<SinhVien> dsSV=new ArrayList<>();
        dsSV.add(new SinhVien(7.5F,"17/02/2005","Ha"));
        dsSV.add(new SinhVien(7F,"14/07/2009","Cuong"));
        dsSV.add(new SinhVien(8.5f,"14/07/2009","Chu"));
        dsSV.add(new SinhVien(6.3F,"4/11/2009","Nguyen"));
        QLSV qlsv = new QLSV(dsSV);
        qlsv.inDS();
        System.out.println("So sanh theo tên");
        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        qlsv.inDS();

        System.out.println("So sánh theo điểm");
        qlsv.setSoSanh(new SoSanhTheoDiem());
        qlsv.sapXep();
        qlsv.inDS();
    }
}
