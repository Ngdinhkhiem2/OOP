package buoi2;
//template:khuôn mẫu
public class Square {
    String soundFile;

    
    public Square(String soundFile) {
        this.soundFile = soundFile;
    }


    void rotate(){
        System.out.println(" Xoay hình vuông...360");
        this.playSound();
    }

    void playSound(){
        System.out.println("play file " + this.soundFile + " music");
    }
    
}
