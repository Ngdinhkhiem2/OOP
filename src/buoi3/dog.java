package buoi3;

public class dog {
    int size;
    String breed;
    String name;

    


    public dog(int size, String breed, String name) {
        this.size = size;
        this.breed = breed;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void bark(){
        if(size > 14){
            System.out.println("gâu!...gâu!...");
        }else{
            System.out.println("ẩng!...ẩng!...");
        }
    }
    
    void setBigger(){
        size += 5;
    }

    void run(){
        System.out.println("chạy...");
        this.bark();

    
    }

    

    
}
