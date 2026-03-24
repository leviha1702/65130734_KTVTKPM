package behavioral.chain_of_responsibility.f88;

public class NhanVienChoVay extends NV_DuyetVay{
    public NhanVienChoVay(String ten, String chucVu, int hanMuc) {
        super(ten, chucVu, hanMuc);
    }

    @Override
    public NV_DuyetVay capTren(NV_DuyetVay capTren) {
        this.capTren = capTren;
        return this.capTren;
    }

    @Override
    public void duyetVay(int sotien) {
        if(sotien <= hanMuc) {
            System.out.println(this.chucVu + " " + this.ten + " duyệt khoản vay " + sotien);
        }
        else {
            System.out.println("Chuyển hồ sơ lên cấp trên");
            capTren.duyetVay(sotien);
        }
    }
}