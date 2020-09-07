
class Customer {
    public String getName() { return "name"; }
    public BillingPlan getPlan() { return bp; }
    public PaymentHistory getHistory() { return ph; }
    public void setPlan(BillingPlan arg){}
    public boolean isNull(){
        return false;
    }
    static Customer newNull(){
        return new NullCustomer();
    }


    public static void main(String[] args) {
        Site site = new Site();
        Customer customer = site.getCustomer();
        BillingPlan plan;
        if (customer.isNull()) plan = BillingPlan.basic();
        else plan = customer.getPlan();

        String customerName = customer.getName();
        //if (customer.isNull()) customerName = "occupant";
        //else customerName = customer.getName();

        customer.setPlan(BillingPlan.special());

        int weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
        //if (customer.isNull()) weeksDelinquent = 0;
        //else weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
    }
    private BillingPlan bp;
    private PaymentHistory ph;
}


