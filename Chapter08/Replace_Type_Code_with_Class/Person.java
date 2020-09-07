class Person {
    public static void main(String[] args){
        Person thePerson = new Person(BloodGroup.A);
        thePerson.getBloodGroup().getCode();
        thePerson.setBloodGroup(BloodGroup.AB);
    }
    //public static final int O = BloodGroup.O.getCode();
    //public static final int A = BloodGroup.A.getCode();
    //public static final int B = BloodGroup.B.getCode();
    //public static final int AB = BloodGroup.AB.getCode();


    private BloodGroup _bloodGroup;

    //public Person(int bloodGroup){
    //    _bloodGroup = BloodGroup.code(bloodGroup);
    //}

    public Person(BloodGroup bloodGroup){
        _bloodGroup = bloodGroup;
    }


    //public void setBloodGroup(int arg){
    //    _bloodGroup = BloodGroup.code(arg);
    //}

    public void setBloodGroup(BloodGroup arg){
        _bloodGroup = arg;
    }

    //public int getBloodGroupCode(){
    //    return _bloodGroup.getCode();
    //}

    public BloodGroup getBloodGroup(){
        return _bloodGroup;
    }



}
