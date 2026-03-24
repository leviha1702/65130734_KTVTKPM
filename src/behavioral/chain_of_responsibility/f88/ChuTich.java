package behavioral.chain_of_responsibility.f88;

public class ChuTich extends NV_DuyetVay{

    public ChuTich(String ten, String chucVu, int hanMuc) {
        super(ten, chucVu, hanMuc);
    }

    @Override
    public NV_DuyetVay capTren(NV_DuyetVay capTren) {
        return null;
    }

    @Override
    public void duyetVay(int sotien) {
        if (sotien <= hanMuc) {
            System.out.println(this.chucVu + " " + this.ten + " duyệt khoản vay " + sotien );
        }
        else
            System.out.println("Công ty từ chối");
    }
}