public class main {
    public static void main (String[] args) {
        CreditCard myCard = new CreditCard("1234567890123456", "12/24", "123");
        System.out.println("Tarjeta válida: " + myCard.isValid());
    }
}
