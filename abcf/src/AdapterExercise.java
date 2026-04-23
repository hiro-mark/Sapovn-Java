public class AdapterExercise {
    class InternationalPayment {
        public void makePayment(double USD) {
            System.out.println(USD + " dollars paid");
        }
    }
    interface PaymentSystem {
        void processPayment(int VND);
    }

    class PaymentAdapter implements PaymentSystem {
        private InternationalPayment payment;

        public PaymentAdapter(InternationalPayment g) {
            this.payment = g;
        }

        @Override
        public void processPayment(int VND) {
            double USD = VND / 26000;
            payment.makePayment(USD);
        }
    }

    public static void main(String[] args) {
        AdapterExercise app = new AdapterExercise();
        InternationalPayment intl = app.new InternationalPayment();
        PaymentSystem adapter = app.new PaymentAdapter(intl);

        adapter.processPayment(52000);
        adapter.processPayment(60000);
    }
}
