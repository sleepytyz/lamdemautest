import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceTest {
    private NhanVienService service = new NhanVienService();

    @BeforeEach
    void SetUp() {
        service = new NhanVienService();
    }

    @Test
    void ThemHopLeLuong1m() {
        NhanVien nv = new NhanVien("NV01", "Vanh", 18, 1000000.0, "IT");
        service.ThemNhanVien(nv);
    }

    @Test
    void ThemHopLeLuong8m() {
        NhanVien nv = new NhanVien("NV02", "Hello", 18, 8000000.0, "IT");
        service.ThemNhanVien(nv);
    }

    @Test
    void ThemHopLeLuong99m() {
        NhanVien nv = new NhanVien("NV03", "Goodbye", 18, 99000000.0, "IT");
        service.ThemNhanVien(nv);
    }

    @Test
    void ThemVoiNhanViennull() {
        assertThrows(IllegalArgumentException.class, () -> service.ThemNhanVien(null));
    }

    @Test
    void ThemVoiNhanVienMaTrong() {
        assertThrows(IllegalArgumentException.class, () -> service.ThemNhanVien(new NhanVien("", "Vanh", 18, 10000000.0, "IT")));
    }

    @Test
    void ThemVoiNhanVienTenTrong() {
        assertThrows(IllegalArgumentException.class, () -> service.ThemNhanVien(new NhanVien("NV02", "", 18, 10000000.0, "IT")));
    }

    @Test
    void ThemVoiNhanVienPhongBanTrong() {
        assertThrows(IllegalArgumentException.class, () -> service.ThemNhanVien(new NhanVien("NV03", "Vanh", 18, 10000000.0, "")));
    }

    @Test
    void ThemVoiNhanVienLuongAm() {
        assertThrows(IllegalArgumentException.class, () -> service.ThemNhanVien(new NhanVien("NV04", "Vanh", 18, -1.0, "IT")));
    }

    @Test
    void ThemVoiNhanVienLuongLonHon100m() {
        assertThrows(IllegalArgumentException.class, () -> service.ThemNhanVien(new NhanVien("NV05", "Vanh", 18, 10000000000000000.0, "IT")));
    }

    @Test
    void SuaNhanVienHopLe(){
        NhanVien nv = new NhanVien("NV09","Test",20,100000.0,"IT");
        service.ThemNhanVien(nv);

        service.SuaNhanVien("NV09",new NhanVien("NV09","Vanh",30,9.0,"HR"));
    }
}