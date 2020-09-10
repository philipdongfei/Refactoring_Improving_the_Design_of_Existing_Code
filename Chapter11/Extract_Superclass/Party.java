

abstract class Party {
    protected Party(String name){
        _name = name;
    }

    public String getName(){
        return _name;
    }
    abstract public int getAnnualCost();


    private String _name;

    
}
