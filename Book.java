import java.util.Scanner;

public class Book {
    Scanner input = new Scanner(System.in);
    public Book(String bookTitle, String bookAuthor){
        
    }
    Book getBookInformation(){
        Book book;
        String bookTitle;
        String bookAuthor;
        System.out.println("=====책 정보 입력=====");
        System.out.print("\n책 제목 : ");
        bookTitle = input.toString();
        System.out.print("\n책 저자 : ");
        bookAuthor = input.toString();
        book = new Book(bookTitle, bookAuthor);
        return book;
    }
}