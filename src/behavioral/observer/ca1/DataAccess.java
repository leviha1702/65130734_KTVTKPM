package behavioral.observer.ca1;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private List<MonHoc>danhSachMonHoc = new ArrayList<>();
    private Stream stream = new Stream();

    public Stream getStream() {
        return stream;
    }
    public void themMonHoc(MonHoc mh){
        danhSachMonHoc.add(mh);
        stream.addEvent(danhSachMonHoc);
    }
    public void capNhatMonHoc(String maMon,String tenMonMoi){
        for (MonHoc mh:danhSachMonHoc){
            if(mh.getMaMon().equals(maMon)){
                mh.setTenMon(tenMonMoi);
                break;
            }
        }
        stream.addEvent(danhSachMonHoc);
    }
    public void xoaMonHoc(String maMon){
        danhSachMonHoc.removeIf(mh -> mh.getMaMon().equals(maMon));
        stream.addEvent(danhSachMonHoc);
    }
}
