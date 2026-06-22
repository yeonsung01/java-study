package java_intermediate_study.class_object.product;

public class Product {

    // private 필드
    private String name;
    private int price;
    private int stock;

    // 생성자
    public Product(String name, int price, int stock) {
        this.name = name;
        setPrice(price); // 유효성 검사 적용
        setStock(stock); // 유효성 검사 적용
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // Setter with validation
    public void setPrice(int price) {
        if (price < 0) {
            System.out.println("가격은 0 이상이어야 합니다. ");
            return;
        }
        this.price = price;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            System.out.println("재고는 0 이상이어야 합니다.");
        }
        this.stock = stock;
    }

    // 비즈니스 메서드
    public boolean sell(int quantity) {
        if (quantity <= 0) {
            System.out.println("판매 수량은 1이상이어야 합니다.");
            return false;
        }
        if (quantity > stock) {
            System.out.println("재고 부족! 현재 재고:" + stock );
            return false;
        }
        stock -= quantity;
        System.out.println(name + " " + quantity + "개 판매. 남은 재고:" +stock);
        return  true;
    }

    public void restock(int quantity) {
        if(quantity <= 0) {
            System.out.println("입고 수량은 1이상이어야 합니다.");
            return;
        }
        stock += quantity;
        System.out.println(name + " " + quantity + "개 입고. 현재 재고:" + stock);
    }

    public void showInfo() {
        System.out.println("[" + name + "] 가격: " + price + "원, 재고: " + stock + "개");
    }
}
