import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoNguyenTest {
    private SoNguyen service = new SoNguyen();

    @BeforeEach
    void Setup() {
        service = new SoNguyen();
    }

    @Test
    void Hople() {
        int[] arr = {1, 2, 3, 4, 5};
        int ex = 15;
        int re = service.TrungBinhCong(arr);
        assertEquals(ex, re);
    }

    @Test
    void KoHopLeSoAm() {
        assertThrows(
                IllegalArgumentException.class, () -> service.TrungBinhCong(new int[]{-1, 2, -3})
        );
    }

    @Test
    void PhanTuKhongNamTrongKhoangNhap() {
        assertThrows(
                IllegalArgumentException.class, () -> service.TrungBinhCong(new int[]{1500, 2000})
        );
    }

    @Test
    void PhanTuNull() {
        assertThrows(
                IllegalArgumentException.class, () -> service.TrungBinhCong(null)
        );
    }
}