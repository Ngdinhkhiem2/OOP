package buoi2;

public class Amoeba {
    String soundFile;

    public Amoeba(String soundFile) {
        this.soundFile = soundFile;
    }
    
    void rotate(){
        System.out.println(" Xoay hình Amoeba...");
        this.playSound();
    }

    void playSound(){
        System.out.println("play file " + this.soundFile + " music");
    }
    
    
}
