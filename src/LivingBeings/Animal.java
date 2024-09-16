package LivingBeings;

import javax.crypto.spec.PSource;

public class Animal implements LivingBeing {
    public Animal(){

    }

    @Override
    public void eat() {
        System.out.println("Animal is eating");
    }

    @Override
    public void grow() {
        System.out.println("Animal is growing");
    }

    @Override
    public void grow(int n) {
        for(int i = 0; i < n; i++){
            System.out.println("Animal is growing");
        }
    }
}
