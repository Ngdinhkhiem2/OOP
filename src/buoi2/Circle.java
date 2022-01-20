package buoi2;

public class Circle {
    String soundFile;

    public Circle(String soundFile) {
        this.soundFile = soundFile;
    }

    void rotate(){
        System.out.println(" Xoay hình tròn...360");
        this.playSound();
    }

    void playSound(){
        System.out.println("play file " + this.soundFile + " music");
    }
    
    
}
