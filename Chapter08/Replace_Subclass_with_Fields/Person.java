
abstract class Person {
    private final boolean _isMale;
    private final char _code;

    protected Person (boolean isMale, char code){
        _isMale = isMale;
        _code = code;
    }

    static Person createMale(){
        return new Male();
    }

    static Person createFemale(){
        return new Female();
    }
    boolean isMale(){
        return _isMale;
    }
    char getCode(){
        return _code;
    }

    public static void main(String[] args){
        Person kent = Person.createMale();
    }
}

