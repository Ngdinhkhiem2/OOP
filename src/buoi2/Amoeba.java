package buoi2;

public class Amoeba {
    String soundFile;
    //tọa độ điểm x,y
    double xPoint;
    double yPoint;

   
    
    public Amoeba(String soundFile, double xPoint, double yPoint) {
        this.soundFile = soundFile;
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }

    void rotate(){
        System.out.println(" Xoay hình Amoeba tại điểm x, y: " + this.xPoint + this.yPoint);
        this.playSound();
    }

    void playSound(){
        System.out.println("play file " + this.soundFile + " music");
    }
    
    
}
