package behavioral.stratery.cc2;

import java.util.ArrayList;
import java.util.List;

public class QLSV {
    List<SinhVien> dsSV;
    ISoSanh soSanh;

    public QLSV(List<SinhVien> dsSV) {
        this.dsSV = dsSV;
    }
    public void sapXep(){
        for (int i=0;i<dsSV.size()-1;i++){
            for (int j=i+1;j<dsSV.size();j++){
                if(soSanh.soSanh(dsSV.get(i),dsSV.get(j))>0){
                    SinhVien temp = dsSV.get(i);
                    dsSV.set(i, dsSV.get(j));
                    dsSV.set(j, temp);
                }
            }
        }
    }
    public void inDS(){
        for(var item:dsSV){
            System.out.println(item);
        }
    }

    public ISoSanh getSoSanh() {
        return soSanh;
    }

    public void setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
    }
}
