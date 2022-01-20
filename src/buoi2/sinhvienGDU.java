package buoi2;

public class sinhvienGDU {
    private double diemTB;
    private String khoa;
    private String ten;
    private float tuoi;
    private String gioitinh;
    
    
    
    public sinhvienGDU(double diemTB, String khoa, String ten, float tuoi, String gioitinh) {
        this.diemTB = diemTB;
        this.khoa = khoa;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
    }



    public double getDiemTB() {
        return diemTB;
    }



    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }



    public String getKhoa() {
        return khoa;
    }



    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }



    public String getTen() {
        return ten;
    }



    public void setTen(String ten) {
        this.ten = ten;
    }



    public float getTuoi() {
        return tuoi;
    }



    public void setTuoi(float tuoi) {
        this.tuoi = tuoi;
    }



    public String getGioitinh() {
        return gioitinh;
    }



    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void Hienthi(){
        System.out.println("------------STUDENT----------");
        System.out.printf("%-20S %-20S %-20S %-20S %-20S %-20S\n", "DIEM TRUNG BINH", "KHOA", "TEN SINH VIEN", "TUOI", "GIOI TINH");
        System.out.printf("%-5d %-20S %-20S %-20S %-20S %-20S\n", this.diemTB, this.khoa, this.ten, this.tuoi, this.gioitinh);

    }
}
