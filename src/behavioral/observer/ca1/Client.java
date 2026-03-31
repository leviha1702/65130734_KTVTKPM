package behavioral.observer.ca1;

import java.util.List;

public class Client implements Observer {

    @Override
    public void update(List<MonHoc> danhSach) {
        System.out.println("[Client UI] DANH SACH CAC MON HOC MOI NHAT:");

        if (danhSach.isEmpty()) {
            System.out.println("--> (danh sach trong)");
        } else {
            for (MonHoc mh : danhSach) {
                System.out.println("- " + mh);
            }
        }
    }
}