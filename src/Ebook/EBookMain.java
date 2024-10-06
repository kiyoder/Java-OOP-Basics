package Ebook;

public class EBookMain {
    public static void main(String[] args) {

        BasicEBookReader ebook = new BasicEBookReader();

        ebook.openBook("Moby Dick");
        ebook.closeBook();
        ebook.turnPageForward();
        ebook.turnPageBackward();
    }
}
