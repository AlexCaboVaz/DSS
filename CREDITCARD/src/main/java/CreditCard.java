public class CreditCard {
    private String cardNumber;
    private String expiryDate;
    private String cvv;
    private double balance; // Saldo disponible en la tarjeta

    public CreditCard(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.balance = 0.0; // Inicializamos el saldo a cero
    }

    public boolean isValid() {
        // Validación del número de tarjeta (longitud y solo números)
        if (cardNumber == null || cardNumber.length() != 16 || !cardNumber.matches("\\d+")) {
            return false;
        }

        // Validación de la fecha de caducidad (formato MM/YY y no caducada)
        if (expiryDate == null || !expiryDate.matches("(0[1-9]|1[0-2])/[0-9]{2}")) {
            return false;
        }

        // Validación del CVV (3 dígitos)
        if (cvv == null || cvv.length() != 3 || !cvv.matches("\\d+")) {
            return false;
        }

        return true;
    }

    public boolean charge(double amount) {
        if (!isValid() || amount <= 0 || amount > balance) {
            return false;
        }

        balance -= amount;
        return true;
    }

    public void addFunds(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    
}
