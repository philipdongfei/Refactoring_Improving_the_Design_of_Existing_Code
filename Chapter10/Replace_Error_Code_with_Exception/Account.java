
class Account {
    void withdraw(int amount){

        Assert.isTrue("sufficient funds", amount <= _balance);
        _balance -= amount;
    }
    void newWithdraw(int amount) throws BalanceException {
        if (amount > _balance) throw new BalanceException();
        _balance -= amount;
    }
    private int _balance;

    public static void main(String[] args){

    }
}
