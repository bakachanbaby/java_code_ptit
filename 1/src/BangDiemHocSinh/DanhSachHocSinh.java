package BangDiemHocSinh;

import java.util.Scanner;

/**
 *
 * @author NguyenPhiTan
 */
public class DanhSachHocSinh {
    //
    private int soLuong;
    private HocSinh[] list;
    
    //
    public DanhSachHocSinh(Scanner in) {
        this.soLuong = Integer.parseInt(in.nextLine());
        this.list = new HocSinh[soLuong];
    }
    
    //
    public void input(Scanner in) {
        int id = 1;
        for(int i=0 ; i<this.soLuong ; i++) {
            HocSinh hs = new HocSinh();
            hs.input(in);
            String ma = String.format("HS%02d", id++);
            hs.setMa(ma);
            this.list[i] = hs;
        }
    }
    
    public void output() {
        this.sapXep();
        for(int i=0 ; i<this.soLuong ; i++) {
            this.list[i].output();
        }
    }
    
    //
    public void sapXep() {
        for(int i=0 ; i<this.soLuong-1 ; i++) {
            for(int j=i+1 ; j<this.soLuong ; j++) {
                if(list[i].getDiemTB() <= list[j].getDiemTB()) {
                    HocSinh hs = list[i];
                    list[i] = list[j];
                    list[j] = hs;
                }
            }
        }

    }
    
    
    
}
