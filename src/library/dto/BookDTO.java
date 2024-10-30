package library.dto;

public class BookDTO {
    private String isbn;
    private String bookName;
    private String author;
    private String publisher;
    private double price;


    public BookDTO(String isbn, String bookName, String author, String publisher, double price) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "도서번호: " + isbn + ", 도서명: " + bookName + ", 저자: " + author + ", 출판사: " + publisher + ", 가격: " + price;
    }
}

