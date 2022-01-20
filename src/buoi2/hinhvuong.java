package buoi2;

public class Hinhvuong {
    String color;
    double circuit;


    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCircuit() {
        return circuit;
    }

    public void setCircuit(double circuit) {
        this.circuit = circuit;
    }

    void rotate(){
        System.out.println(" Xoay hình vuông...360");
    }

    void playSound(){
        System.out.println("...TING...TING...TING...");
    }
    
}
