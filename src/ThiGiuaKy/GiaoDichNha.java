package ThiGiuaKy;

import java.util.Scanner;
import java.util.function.Supplier;

public class GiaoDichNha extends GiaoDich{
    private String loaiNha;
    private String diaChi;
    private int choose;
    
    
    
    public GiaoDichNha(){
        super();
    }
        
    
    
    public GiaoDichNha( String loaiNha, String diaChi) {
        super();
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }



    public String getLoaiNha() {
        return loaiNha;
    }



    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }



    public String getDiaChi() {
        return diaChi;
    }



    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void nhapLoaiNHA(){
        super.nhap();
        System.out.print("Nhap dia chi: ");
        diaChi = scanner.nextLine();
        System.out.print("Nhap loai nha (0: cao cap, 1: thuong): ");
        choose = scanner.nextInt();
        switch (choose) {
            case 0:
                loaiNha = "cao cap";
                break;
            case 1: 
                loaiNha = "thuong";
                break;
            default:
                System.out.println("Chon so khong hop le: ");
                break;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", loai nha: " + this.loaiNha + ", dia chi: " + this.diaChi;
    }

   

    
}
