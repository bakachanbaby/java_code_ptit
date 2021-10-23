
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class ThiSinh {
    //

    private String ma;
    private String hoTen;
    private float diemToan;
    private float diemLy;
    private float diemHoa;
    private float diemUT;
    private float tongDiem;
    private float diemThat;
    

    //
    public ThiSinh() {

    }

    //
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public float getDiemUT() {
        return diemUT;
    }

    public void setDiemUT(float diemUT) {
        this.diemUT = diemUT;
    }

    public float getTongDiem() {
        return tongDiem;
    }

    public void setTongDiem(float tongDiem) {
        this.tongDiem = tongDiem;
    }

    public float getDiemThat() {
        return diemThat;
    }

    public void setDiemThat(float diemThat) {
        this.diemThat = diemThat;
    }

    
    
    //
    public void nhap(Scanner in) {
        this.ma = in.nextLine();
        this.hoTen = in.nextLine();
        this.diemToan = Float.parseFloat(in.nextLine());
        this.diemLy = Float.parseFloat(in.nextLine());
        this.diemHoa = Float.parseFloat(in.nextLine());
    }

    public void check(){
        diemUT = this.diemUuTien();
        tongDiem = this.diemHoa + this.diemLy + this.diemToan * 2;
        diemThat = tongDiem + this.diemUuTien();
    }
    
    public void xuat() {
        System.out.print(this.ma + " " + this.hoTen + " ");
        // in diem uu tien
        if (diemUT * 10 == (int) diemUT * 10) {
            System.out.print((int) diemUT + " ");
        } else {
            System.out.printf("%.1f ", diemUT);
        }

        // in tong diem
        if (diemThat * 10 == (int) diemThat * 10) {
            System.out.print((int) diemThat + " ");
        } else {
            System.out.printf("%.1f ", diemThat);
        }

        // in ket qua
        
    }

    //
    public float diemUuTien() {
        String res = this.ma.substring(2, 3);
        if (res.equals("1")) {
            return 0.5f;
        }
        if (res.equals("2")) {
            return 1.0f;
        }
        return 2.5f;
    }

    public float diemXetTuyen() {
        return this.diemHoa + this.diemLy + this.diemToan * 2 + this.diemUuTien();
    }
}
