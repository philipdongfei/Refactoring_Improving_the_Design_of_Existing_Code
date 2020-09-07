
class BillingPlan {
    BillingPlan(){
        plan = 0;
    }
    BillingPlan(int arg){
        plan = arg;
    }
    public static BillingPlan basic(){ return new BillingPlan(); }
    public static BillingPlan special() { return new BillingPlan(1); }
    
    private int plan;
}
