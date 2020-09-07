
class NullPaymentHistory extends PaymentHistory {
    int getWeeksDelinquentInLastYear() {
        return 0;
    }
}
