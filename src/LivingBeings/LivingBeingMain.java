package LivingBeings;

public class LivingBeingMain {
    public static void main(String[] args) {

        Human self = new Human();
        self.eat();
        self.grow();
        self.grow(3);

        Animal x = new Animal();
        x.eat();
        x.grow();
        x.grow(2);

        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        dog.grow();
        dog.grow(4);



    }
}
