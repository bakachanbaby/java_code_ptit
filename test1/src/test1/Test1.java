/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import data.MaTran;
import data.SoN;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		SoN a = new SoN();
		MaTran b = new MaTran();
		while(true) {
			System.out.println();
			System.out.println("---------------------------");
			System.out.println("1. Nhap vao so nguyen duong n");
			System.out.println("2. Tinh tong tu 1 den n");
			System.out.println("3. Tinh n!");
			System.out.println("4. Kiem tra xem n co phai so thuan nghich");
			System.out.println("5. Nhap ma tran vuong cap n");
			System.out.println("6. Dua ra cac phan tu nam tren duong cheo chinh cua ma tran");
			System.out.println("7. Dua ra cac phan tu nam la so nguyen to cua ma tran");
			System.out.println("8. Tinh dinh thuc ma tran ");
			System.out.println("0. Exit ");
			System.out.print("Lua chon (0->8):   ");
			
			int choice = Integer.parseInt(scanner.nextLine());
			
			switch(choice) {
			case 1:
				a.nhapN();
				break;
			case 2:
				a.tongN();;
				break;
			case 3:
				a.tinhGiaiThua();
				break;
			case 4:
				a.kiemTraSoThuanNghich();
				break;
			case 5:
				b.nhapN();
				break;
			case 6:
				b.duongCheoChinh();
				break;
			case 7:
				b.soNguyenTo();;
				break;
			case 8:
				b.dinhThucMaTranVuong();;
				break;
			case 0:
				System.out.println("Bye!!!");
				System.exit(0);
			default:System.out.println("only select 1->8");
			}			
		}
		
	}
    
}
