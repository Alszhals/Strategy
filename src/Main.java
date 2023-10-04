public class Main {
    public static void main(String[] args) {
        ShoppingCart cart= new ShoppingCart();
         cart.setPaymentStrategy(new CreditCardPayment("123-456-789-1234", "Asl zhasl"));
         cart.checkout(1000);


         cart.setPaymentStrategy(new PayPalPayment("assg8218@gmail.com"));
         cart.checkout(2000);



    }
}