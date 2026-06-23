package java_intermediate_study.polymorphism_abstarct.payment;

public abstract class Payment {
    protected  int amount;

    public  Payment(int amount){
        this.amount = amount;
    }

    public abstract boolean process();

    public void printReceipt(){
        System.out.println("결제 금액:" + String.format("%,d", amount) + "원");
    }
}
