package library.view;
import library.dto.BookDTO;
import java.util.List;

public class BookManageView {
    public void displayMenu() {
        System.out.println("=== 도서관리시스템 ===");
        System.out.println("1. 도서 정보 추가");
        System.out.println("2. 도서 조회");
        System.out.println("3. 도서 수정");
        System.out.println("4. 도서 삭제");
        System.out.println("5. 도서 출력");
        System.out.print("메뉴를 입력하세요 (1~5): ");
    }

    public void displayBookList(List<BookDTO> bookList) {
        System.out.println("=== 도서 목록 ===");
        for (BookDTO book : bookList) {
            System.out.println(book);
        }
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}

