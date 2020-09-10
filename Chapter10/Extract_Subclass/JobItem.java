
class JobItem {
    protected JobItem(int unitPrice, int quantity, boolean isLabor){
        _unitPrice = unitPrice;
        _quantity = quantity;
        _isLabor = isLabor;
    }
    public JobItem(int unitPrice, int quantity){
        this(unitPrice, quantity, false);
    }

    public int getTotalPrice(){
        return getUnitPrice() * _quantity;
    }
    public int getUnitPrice(){
        return _unitPrice;
    }
    public int getQuantity(){
        return _quantity;
    }
    public Employee getEmployee(){
        return _employee;
    }
    protected boolean isLabor(){
        return false;
    }
    private int _unitPrice;
    private int _quantity;
    protected Employee _employee;
    private boolean _isLabor;
}

