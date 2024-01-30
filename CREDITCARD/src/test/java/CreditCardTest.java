import static org.junit.Assert.*;
import org.junit.Test;

public class CreditCardTest {

    @Test
    public void testCardValidity() {
        CreditCard card = new CreditCard("1234567890123456", "12/24", "123");
        assertTrue("La tarjeta debería ser válida", card.isValid());
    }

    @Test
    public void testCardCharge() {
        CreditCard card = new CreditCard("1234567890123456", "12/24", "123");
        card.addFunds(200.0); // Asegurando que haya saldo suficiente
        assertTrue("El cargo debería ser exitoso", card.charge(100.0));
    }

    
}
