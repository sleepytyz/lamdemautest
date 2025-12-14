public class SoNguyen {
    public int TrungBinhCong(int [] arr){
        if (arr == null){
            throw new IllegalArgumentException("Vui long nhap phan tu");
        }
        for (int num : arr){
            if (num < 0 || num >1000){
                throw new IllegalArgumentException("Vui long nhap phan tu trong khoang tu 0-1000");
            }
        }
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
}
