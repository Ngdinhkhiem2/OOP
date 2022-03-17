package ThiGiuaKy;

import java.util.ArrayList;
import java.util.Scanner;

public class GiaoDichTestDrive {
    public static void main(String[] args) {
        ArrayList<GiaoDichNha> GiaoDichNha1 = new ArrayList<>();
        ArrayList<GiaoDichDat> GiaoDichDat1 = new ArrayList<>();
        int soGiaoDichDat = 0, soGiaoDichNha = 0;
        long tongTienGiaoDichDat = 0, trungBinhThanhTien = 0;
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Nhap so giao dich dat can nhap: ");
        soGiaoDichDat = scanner.nextInt();
        System.out.print("Nhap so giao dich nha can nhap: ");
        soGiaoDichNha = scanner.nextInt();
         
        System.out.println("NHAP THONG TIN DAT ");
        for (int i = 0; i < soGiaoDichDat; i++) {
            System.out.println("Nhap thong tin giao dich dat thu: " + (i + 1));
            GiaoDichDat giaoDichDat = new GiaoDichDat();
            giaoDichDat.nhap();
            GiaoDichDat1.add(giaoDichDat);
        }
         
        System.out.println("NHAP THONG TIN NHA:");
        for (int i = 0; i < soGiaoDichNha; i++) {
            System.out.println("Nhap thong tin giao dich nha thu:  " + (i + 1) + ":");
            GiaoDichNha giaoDichNha = new GiaoDichNha();
            giaoDichNha.nhap();
            GiaoDichNha1.add(giaoDichNha);
        }
         
        System.out.println("---Thong tin giao dich dat---");
        for (int i = 0; i < GiaoDichNha1.size(); i++) {
            System.out.println(GiaoDichDat1.get(i).toString());
        }
         
        System.out.println("---Thong tin giao dich nha---");
        for (int i = 0; i < GiaoDichNha1.size(); i++) {
            System.out.println(GiaoDichNha1.get(i).toString());
        }
         
        for (int i = 0; i < GiaoDichDat1.size(); i++) {
            if (GiaoDichDat1.get(i).getLoaiDat().equalsIgnoreCase("A")) {
                tongTienGiaoDichDat += GiaoDichDat1.get(i).getDienTich() * GiaoDichDat1.get(i).getDonGia() * 1.5;
            } else if (GiaoDichDat1.get(i).getLoaiDat().equalsIgnoreCase("B") || 
                    GiaoDichDat1.get(i).getLoaiDat().equalsIgnoreCase("C")) {
                tongTienGiaoDichDat += GiaoDichDat1.get(i).getDienTich() * GiaoDichDat1.get(i).getDonGia();
            }
        }
        trungBinhThanhTien = tongTienGiaoDichDat / (GiaoDichDat1.size());
        System.out.println("Trung binh thanh tien = " + trungBinhThanhTien);
    
    }
}
