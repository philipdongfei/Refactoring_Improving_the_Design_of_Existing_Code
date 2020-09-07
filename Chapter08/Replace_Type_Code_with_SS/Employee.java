
class Employee {
    private int _type;
    private int _monthlySalary;
    private int _commission;
    private int _bonus;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    Employee(int type){
        setType(type);
    }

    int getType(){
        return _type;
    }

    void setType(int arg){
        _type = arg;
    }


    int payAmount(){
        switch(getType()){
            case ENGINEER:
                return _monthlySalary;
            case SALESMAN:
                return _monthlySalary + _commission;
            case MANAGER:
                return _monthlySalary + _bonus;
            default:
                throw new RuntimeException("Incorrect Employee");
        }
    }
    
}
