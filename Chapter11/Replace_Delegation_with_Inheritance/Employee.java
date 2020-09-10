
class Employee extends Person{

    public String toString(){
        return "Emp: " + getLastName();
    }

    public static void main(String[] args){
        Employee emp = new Employee();
        emp.setName("John Tom Peter");
        System.out.println(emp);
        System.out.println(emp.getName());
    }
}

