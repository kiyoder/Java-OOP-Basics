package Ebook;

public class BasicEBookReader implements EBookReader{
    private String currentBook = null;



    @Override
    public void openBook(String bookTitle){
        this.currentBook = bookTitle;
        System.out.println("Opening the book: " + bookTitle + ".");
    }

    @Override
    public void closeBook(){
        if(this.currentBook != null){
            System.out.println("Closing the current book.");
            this.currentBook = null;
        }
        else{
            System.out.println("No book is currently open.");
        }
    }

    @Override
    public void turnPageForward(){
        if(this.currentBook!=null){
            System.out.println("Turning to the next page.");
        }
        else{
            System.out.println("No book is currently open.");
        }
    }

    @Override
    public void turnPageBackward(){
        if(this.currentBook!=null){
            System.out.println("Going back to the previous page.");
        }
        else{
            System.out.println("No book is currently open.");
        }
    }
}
