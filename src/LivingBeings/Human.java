package LivingBeings;

public class Human implements LivingBeing {
    public Human(){

    }

    @Override
    public void eat() {
        System.out.println("Human is eating");
    }

    @Override
    public void grow() {
        System.out.println("Human is growing");
    }

    @Override
    public void grow(int n) {
        for(int i = 0; i < n; i++){
            System.out.println("Human is growing");
        }
    }
}
