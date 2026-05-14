package behavioral.stratery.cc2;

public class SoSanhTheoDiem implements ISoSanh<SinhVien> {
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        if(o1.diem> o2.diem)
            return 1;
        else if (o1.diem< o2.diem)
            return -1;
        return 0;
    }
}
