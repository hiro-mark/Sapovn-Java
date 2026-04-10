public class ExerciseOCPDIP {
    interface PaymentService{
        void pay();
    }
    static class CardPayment implements PaymentService {
        public void pay() {
            System.out.println("Paying by card");
        }
    }
    static class PayPalPayment implements PaymentService {
        public void pay() {
            System.out.println("Paying by PayPal");
        }
    }

    static class App {
        PaymentService service;

        App(PaymentService service) {
            this.service = service;
        }

        void checkout() {
            service.pay();
        }
    }

    public static void main(String[] args) {
        PaymentService service = new CardPayment();
        App app = new App(service);
        app.checkout();
    }
}
