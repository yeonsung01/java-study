package java_intermediate_study.exception.insufficient_balance_exception;

class InsufficientBalanceException extends Exception {
    private int currentBalance;
    private int requestedAmount;

    public InsufficientBalanceException(int balance, int amount) {
        super("잔액 부족: 현재" + balance + "원, 요청" + amount + "원");
        this.currentBalance = balance;
        this.requestedAmount = amount;
    }

    public int getShortage() {
        return requestedAmount - currentBalance;
    }
}
