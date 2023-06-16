# Tarjetas de credito

## Creamos la clase CreditCard

- Comenzamos creando una clase CreditCard, en ella definimos tres variables privada de tipo String que son cardNumber, cardHolderName y balance, estas variables nos permitiran obtener el numero de la tarjeta de credito, el nombre de la persona a la cual pertenece y su balance.

- Inicializamos la tarjeta de credito con un numero y un nombre, y el balance el cero. Para posteriormente crear los metodos para saber el numero, nombre, balance y añadir y quitar balance.

```
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
```


## Test

- Creamos una clase denominada "CreditCardTest" en ella usando las anotaciones @before donde realizamos una configuracion inicial antes de cada caso de prueba, y la anotacion @test donde marcamos cada metodo de prueba.

```@Before
    public void setUp() {
        // Configuración inicial para cada caso de prueba
        creditCard = new CreditCard("1234567890123456", "John Doe");
    }
```

- Los metodos de pruebas que hemos implementado han sido metodos de prueba basicos, donde comprobamos si el numero de la tarjeta o el titular de la misma es correcto, que su saldo inicial es cero, o probamos a realizar una carga y que su balance se actualiza o realizar un pago con la misma.

```
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
```

