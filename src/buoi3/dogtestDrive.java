package buoi3;

import javax.security.auth.callback.ChoiceCallback;

import buoi1.oo.main;

public class dogtestDrive {
    public static void main(String[] args) {
        dog dog1 = new dog(14, "shiba","number 1");
        dog1.bark();
        dog1.run();
        dog1.setBigger();

        dog dog2 = new dog(100, "corgi", "number 2");
        dog2.bark();
        dog2.run();
        dog2.setBigger();
    }
    
}
