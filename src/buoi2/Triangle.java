package buoi2;

public class Triangle {
    String soundFile;

    public Triangle(String soundFile) {
        this.soundFile = soundFile;
    }
    
    void rotate(){
        System.out.println(" Xoay hình tam giác...360");
        this.playSound();
    }

    void playSound(){
        System.out.println("play file " + this.soundFile + " music");
    }
    
    
}
