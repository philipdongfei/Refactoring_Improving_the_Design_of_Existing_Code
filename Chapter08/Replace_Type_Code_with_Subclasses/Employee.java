
class Employee {
    //abstract int getType();

    private int _type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    private Employee(int type){
        _type = type;
    }

    int getType(){
        return _type;
    }

    static Employee create(int type){
        /*
        switch (type){
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorrect type code value");
        }
        */
        if (type == ENGINEER) return new Engineer();
        else return new Employee(type);

    }

}
