
class Department {
    public Department(String name){
        super(name);
    }

    public int getAnnualCost(){
        Enumeration e = getStaff();
        int result = 0;
        while (e.hasMoreElements()){
            //Employee each = (Employee) e.nextElement();
            Party each = (Party)e.nextElement();
            result += each.getAnnualCost();
        }
        return result;
    }

    public int getHeadCount(){
        return _staff.size();
    }
    public Enumeration getStaff(){
        return _staff.size();
    }
    public void addStaff(Employee arg){
        _staff.addElement(arg);
    }

    private Vector _staff = new Vector();
}
