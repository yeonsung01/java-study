package java_intermediate_study.class_object;

public class Book {

    // private 필드
    private String isbn;
    private String title;
    private String author;
    private int price;
    private boolean isBorrowed;

    // 생성자
    public Book(String isbn, String title, String author, int price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        setPrice(price);
        this.isBorrowed = false;
    }

    // Getter
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public  boolean isBorrowed() {
        return isBorrowed;
    }

    // Setter with validation
    public void setPrice(int price) {
        if(price < 0) {
            System.out.println("가격은 0 이상이어야 합니다.");
            return;
        }
        this.price = price;
    }

    // 비즈니스 메서드
    public  boolean borrow() {
        if (isBorrowed) {
            System.out.println("이미 대출 중인 도서입니다.");
            return false;
        }
        isBorrowed = true;
        System.out.println("📖" + title + "대출 완료");
        return true;
    }

    public void returnBook(){
        if (!isBorrowed){
            System.out.println("대출 중이 아닌 도서입니다.");
            return;
        }
        isBorrowed = false;
        System.out.println("📝" + title + "반납 완료");
    }

    public void showInfo() {
        System.out.println("===도서 정보 ===");
        System.out.println("ISBN:" + isbn);
        System.out.println("저자:" + author);
        System.out.println("가격:" + price + "원");
        System.out.println("상태:" + (isBorrowed ? "📕대출 중" : "📗대출 가능"));
    }
}
