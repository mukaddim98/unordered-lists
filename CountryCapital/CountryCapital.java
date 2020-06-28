public class CountryCapital {
    // attribute
    private String country;
    private String capital;

    // constructor
    public CountryCapital(){}
    public CountryCapital(String country, String capital){
        this.country = country;
        this.capital = capital;
    }

    // getters

    public String getCountry() {
        return country;
    }

    public String getCapital() {
        return capital;
    }

    // setters

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    // toString

    public String toString() {
        return ""+country+" "+capital;
    }
}
