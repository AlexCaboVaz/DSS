import java.math.BigDecimal;

public class CreditCard {
    private String cardNumber;
    private String cardHolderName;
    private BigDecimal balance;

    public CreditCard(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.balance = BigDecimal.ZERO;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void charge(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public void makePayment(BigDecimal amount) {
        balance = balance.subtract(amount);
    }
}
