package buoi2;

public class ShapeMain {
    public static void main(String[] args) {
        Tamgiac tamgiac = new Tamgiac();
        Hinhvuong hinhvuong = new Hinhvuong();
        Hinhtron hinhtron = new Hinhtron();

        hinhvuong.rotate();
        hinhvuong.playSound();

        hinhtron.rotatet();
        hinhtron.playSound();

        tamgiac.rotate();
        tamgiac.playSound();


    }
    
}
