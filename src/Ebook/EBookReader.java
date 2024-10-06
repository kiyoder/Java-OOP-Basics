package Ebook;

public interface EBookReader{
    void openBook(String bookTitle);
    void closeBook();
    void turnPageForward();
    void turnPageBackward();
}
