import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    public List<NhanVien> list = new ArrayList<>();
    public Boolean ThemNhanVien(NhanVien nv){
        if (nv == null){
            throw new IllegalArgumentException("Khong duoc de nhan vien null");
        }else if(nv.getMaNV().isEmpty()||nv.getTenNV().isEmpty()||nv.getPhongBan().isEmpty()){
            throw new IllegalArgumentException("Khong duoc de trong cac truong du lieu");
        }else if(nv.getLuong()<0||nv.getLuong()>100000000){
            throw new IllegalArgumentException("Luong ko nam trong khoang tu 0-100m");
        }
        list.add(nv);
        return true;
    }

    public Boolean SuaNhanVien(String maNV, NhanVien nvMoi){
        if (maNV == null){
            throw new IllegalArgumentException("Khong duoc de ma nhan vien null");
        }else if(nvMoi.getMaNV().isEmpty()||nvMoi.getTenNV().isEmpty()||nvMoi.getPhongBan().isEmpty()){
            throw new IllegalArgumentException("Khong duoc de trong cac truong du lieu");
        }else if(nvMoi.getLuong()<0||nvMoi.getLuong()>100000000){
            throw new IllegalArgumentException("Luong ko nam trong khoang tu 0-100m");
        }
        return true;
    }
}
