import static org.junit.Assert.*;


import org.junit.Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class CreditCardTest {
    private CreditCard creditCard;

    @Before
    public void setUp() {
        // Configuración inicial para cada caso de prueba
        creditCard = new CreditCard("1234567890123456", "John Doe");
    }

    @Test
    public void testGetCardNumber() {
        // Verificar que el número de tarjeta es correcto
        Assert.assertEquals("1234567890123456", creditCard.getCardNumber());
    }

    @Test
    public void testGetCardHolderName() {
        // Verificar que el nombre del titular de la tarjeta es correcto
        Assert.assertEquals("John Doe", creditCard.getCardHolderName());
    }

    @Test
    public void testInitialBalance() {
        // Verificar que el saldo inicial es cero
        Assert.assertEquals(BigDecimal.ZERO, creditCard.getBalance());
    }

    @Test
    public void testCharge() {
        // Realizar una carga en la tarjeta
        creditCard.charge(new BigDecimal("100.00"));

        // Verificar que el balance se ha actualizado correctamente
        Assert.assertEquals(new BigDecimal("100.00"), creditCard.getBalance());
    }

    @Test
    public void testMakePayment() {
        // Realizar una carga en la tarjeta
        creditCard.charge(new BigDecimal("100.00"));

        // Realizar un pago
        creditCard.makePayment(new BigDecimal("50.00"));

        // Verificar que el balance se ha actualizado correctamente después del pago
        Assert.assertEquals(new BigDecimal("50.00"), creditCard.getBalance());
    }
}
