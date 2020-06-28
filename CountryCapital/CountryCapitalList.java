public class CountryCapitalList {
    // attributes
    private List<CountryCapital> coCap;

    // constructor
    public CountryCapitalList(){
        coCap = new List<CountryCapital>();
    }

    // add CountryCapital
    public void add(CountryCapital cc){
        coCap.add(cc);
    }

    // get size of list
    public int size(){
        return coCap.size();
    }

    // Search for a student’s record given an ID number
    public CountryCapital randCC(int index){
        CountryCapital cc = coCap.first();
        if(index == 0){
            return cc;
        }
        else {
            for(int i = 0; i < index; i++){
                cc = coCap.next();
            }
            return cc;
        }
    }

}
