//author: shardul vaidya
//date 17/9/18
//Exchange class for Homework2 

public class Exchange extends Undergraduate {
    private String country;
    private String year;

    //constructors
    public Exchange () {
        super();
        this.country = "Wholand";
        this.year = "Unknown";
    }

    public Exchange (String name, String country) {
        super(name);
        this.country = country;
        this.year = "Unknown";
    }

    public Exchange (String name, String major, boolean honours, String country) {
        super(name, major, honours);
        this.country = country;
        this.year = "Unknown";
    }

    public Exchange (String name, String major, double gpa, boolean honours, String country) {
        super(name, major, gpa, honours);
        this.country = country;
        this.year = "Unknown";
    }

    public Exchange (String name, String major, double gpa, int creditHours, String country) {
        super(name, major, gpa, creditHours);
        this.country = country;
        this.year = "Unknown";
    }

    public Exchange (String name, String major, double gpa, int creditHours, boolean honours) {
        super(name, major, gpa, creditHours, honours);
        this.country = "Wholand";
        this.year = "Unknown";
    }

    public Exchange (String name, String major, double gpa, int creditHours, boolean honours, String country, String year) {
        this(name, major, gpa, creditHours, honours);
        this.country = country;
        this.year = year;
    }

    //methods
    public String getCountry () { return country; }
    public String getTransferYear () { return year; }

    public void setYear (String year) { this.year = year; }
    public void setCountry (String country) { this.country = country; }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Country: " + country + "\n" +
               "Year: " + year;
    }
}
