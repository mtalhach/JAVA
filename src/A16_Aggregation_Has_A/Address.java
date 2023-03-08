package A16_Aggregation_Has_A;

public class Address {
    private String street;
    private String city;
    private String country;
    private int zip;

    public Address(String street, String city, String country, int zip) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.zip = zip;
    }

    public String getStreet() {
        return this.street;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public int getZip() {
        return this.zip;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString() {
        return String.format("%s  %s  %s  %d", this.getStreet(), this.getCity(), this.getCountry(), this.getZip());
    }
}
