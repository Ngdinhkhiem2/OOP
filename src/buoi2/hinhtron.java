package buoi2;

public class Hinhtron {
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

    void rotatet(){
        System.out.println("  Xoay hình tròn...360");
    }

    void playSound(){
        System.out.println("...TING...TING...TING...");
    }
    
}
