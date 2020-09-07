
public class PaymentHistory {
    int getWeeksDelinquentInLastYear(){ return 0; }
    static PaymentHistory newNull(){
        return new NullPaymentHistory();
    }

}
