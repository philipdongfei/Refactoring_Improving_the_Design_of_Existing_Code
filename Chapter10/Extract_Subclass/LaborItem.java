
class LaborItem extends JobItem {
    public LaborItem (int quantity, Employee employee){
        super(0, quantity, true, employee);
        _employee = employee;
    }
    public int getUnitPrice(){
        return _employee.getRate();
    }
    protected boolean isLabor(){
        return true;
    }
}

