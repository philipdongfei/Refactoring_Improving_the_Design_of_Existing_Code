
class Account {

    double getFlowBetween(DateRange range){
        double result = 0;
        Enumeration e = _entries.elements();
        while (e.hasMoreElements()){
            Entry each = (Entry)e.nextElement();
            if (each.getDate().equals(range.getStart()) || 
                each.getDate().equals(range.getEnd())  ||
                (each.getDate().after(range.getStart()) && each.getDate().before(range.getEnd())))
            {
                result += each.getValue();
            }
        }
        return result;
    }

    private Vector _entries = new Vector();

    public static void main(String[] args){
        double flow = anAccount.getFlowBetween(new DateRange(startDate, endDate));
    }
}
