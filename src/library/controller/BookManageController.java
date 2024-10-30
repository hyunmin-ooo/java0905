package library.controller;

import library.dto.BookDTO;
import library.view.BookManageView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManageController {
    private List<BookDTO> bookList;
    private BookManageView view;
    private Scanner scanner;

    public BookManageController() {
        bookList = new ArrayList<>();
        view = new BookManageView();
        scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            view.displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    searchBook();
                    break;
                case 3:
                    updateBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    view.displayBookList(bookList);
                    break;
                default:
                    view.displayMessage("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }

    private void addBook() {
        System.out.println("새 도서 정보 입력:");
        System.out.print("도서번호: ");
        String isbn = scanner.nextLine();
        System.out.print("도서명: ");
        String bookName = scanner.nextLine();
        System.out.print("저자: ");
        String author = scanner.nextLine();
        System.out.print("출판사: ");
        String publisher = scanner.nextLine();
        System.out.print("가격: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        BookDTO newBook = new BookDTO(isbn, bookName, author, publisher, price);
        bookList.add(newBook);
        view.displayMessage("도서가 추가되었습니다.");
    }

    private void searchBook() {
        System.out.print("조회할 도서번호를 입력하세요: ");
        String isbn = scanner.nextLine();
        for (BookDTO book : bookList) {
            if (book.getIsbn().equals(isbn)) {
                System.out.println(book);
                return;
            }
        }
        view.displayMessage("도서를 찾을 수 없습니다.");
    }

    private void updateBook() {
        System.out.print("수정할 도서번호를 입력하세요: ");
        String isbn = scanner.nextLine();
        for (BookDTO book : bookList) {
            if (book.getIsbn().equals(isbn)) {
                System.out.print("새 도서명: ");
                book.setBookName(scanner.nextLine());
                System.out.print("새 저자: ");
                book.setAuthor(scanner.nextLine());
                System.out.print("새 출판사: ");
                book.setPublisher(scanner.nextLine());
                System.out.print("새 가격: ");
                book.setPrice(scanner.nextDouble());
                scanner.nextLine(); // 개행 문자 소비
                view.displayMessage("도서 정보가 수정되었습니다.");
                return;
            }
        }
        view.displayMessage("도서를 찾을 수 없습니다.");
    }

    private void deleteBook() {
        System.out.print("삭제할 도서번호를 입력하세요: ");
        String isbn = scanner.nextLine();
        for (BookDTO book : bookList) {
            if (book.getIsbn().equals(isbn)) {
                bookList.remove(book);
                view.displayMessage("도서가 삭제되었습니다.");
                return;
            }
        }
        view.displayMessage("도서를 찾을 수 없습니다.");
    }

    public static void main(String[] args) {
        BookManageController controller = new BookManageController();
        controller.run();
    }
}

