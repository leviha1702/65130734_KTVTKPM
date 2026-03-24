package behavioral.chain_of_responsibility.f88;

public class MainChain {
    static void main(String[] args) {
        ChuTich chuTich = new ChuTich("Hà", "Chủ Tịch",2000000000);
        NV_DuyetVay bv = new NhanVienChoVay("Ngân","Bảo Vệ",1000000);
        NV_DuyetVay nv = new NhanVienChoVay("Thu","Nhân Viên",40000000);
        NV_DuyetVay ql = new NhanVienChoVay("Hạ","Quản Lý",400000000);
        NV_DuyetVay gd = new NhanVienChoVay("Đông","Giám Đốc",900000000);
        bv.capTren(nv)
                .capTren(ql)
                .capTren(gd)
                .capTren(chuTich);
        bv.duyetVay(200000);
        bv.duyetVay(1000000000);

    }
}
