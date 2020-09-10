
class test {
    double charge(Billable emp, int days){
        int base = emp.getRate() * days;
        if (emp.hasSpecialSkill())
            return base * 1.05;
        else return base;
    }
    public static void main(String[] args){
        Employee emp = new Employee();
        test t = new test();
        t.charge(emp, 10);
    }
}
