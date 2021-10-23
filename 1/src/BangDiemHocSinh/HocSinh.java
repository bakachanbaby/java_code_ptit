package BangDiemHocSinh;

import java.util.Scanner;

/**
 *
 * @author NguyenPhiTan
 */
public class HocSinh {
    //
    private String ma;
    private String hoTen;
    private float diem[];
    private float diemTB;
    private String xepLoai;
    
    //
    public HocSinh() {
        this.diem = new float[10];
    }
    
    //
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
    
    public float getDiemTB() {
        return this.diemTB;
    }
    
    
    //
    public void input(Scanner in) {
        this.hoTen = in.nextLine();
        float tb = 0;
        for(int i=0 ; i<9 ; i++) {
            this.diem[i] = Float.parseFloat(in.next());
            tb += this.diem[i];
        }
        this.diem[9] = Float.parseFloat(in.nextLine());
        tb += this.diem[9];
        tb += (this.diem[0] + this.diem[1]);
        this.diemTB = tb/12;
        this.diemTB = (float) (Math.round(diemTB * 10.0) / 10.0);
//        String dtb = String.format("%.1f", this.diemTB);
//        this.diemTB = Float.parseFloat(dtb);
    }
    
    public void output() {
        this.xepLoai();
        System.out.print(this.ma + " " + this.hoTen);
        System.out.printf(" %.1f ", this.diemTB);
        System.out.println(this.xepLoai);
    }
    
    //
    public void xepLoai() {
        float diemTB = this.diemTB;
        if(diemTB >= 9) this.xepLoai = "XUAT SAC";
        else if(diemTB >= 8) this.xepLoai = "GIOI";
        else if(diemTB >= 7) this.xepLoai = "KHA";
        else if(diemTB >= 5) this.xepLoai = "TB";
        else this.xepLoai = "YEU";
    }
    
    
    
}
