
import java.util.Scanner;


public class main {

    public static class thiSinh{
        private String hoTen;
        private String ngaySinh;
        private float diem1;
        private float diem2;
        private float diem3;
        private float tongDiem;

        public thiSinh(String hoTen, String ngaySinh, float diem1, float diem2, float diem3) {
            this.hoTen = hoTen;
            this.ngaySinh = ngaySinh;
            this.diem1 = diem1;
            this.diem2 = diem2;
            this.diem3 = diem3;
        }

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public String getNgaySinh() {
            return ngaySinh;
        }

        public void setNgaySinh(String ngaySinh) {
            this.ngaySinh = ngaySinh;
        }

        public float getDiem1() {
            return diem1;
        }

        public void setDiem1(float diem1) {
            this.diem1 = diem1;
        }

        public float getDiem2() {
            return diem2;
        }

        public void setDiem2(float diem2) {
            this.diem2 = diem2;
        }

        public float getDiem3() {
            return diem3;
        }

        public void setDiem3(float diem3) {
            this.diem3 = diem3;
        }
        
        public void tinhTong(){
            tongDiem = (diem1+diem2+diem3);
        }
        
        public void in(){
            System.out.print(hoTen + " " + ngaySinh + " ");
            System.out.printf("%.1f", tongDiem);
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        String ngaySinh = sc.nextLine();
        Float diem1 = Float.parseFloat(sc.nextLine());
        Float diem2 = Float.parseFloat(sc.nextLine());
        Float diem3 = Float.parseFloat(sc.nextLine());
        thiSinh a = new thiSinh(hoTen, ngaySinh, diem1, diem2, diem3);
        a.tinhTong();
        a.in();
        
    }
    
}
