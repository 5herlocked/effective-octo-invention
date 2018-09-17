//author: shardul vaidya
//date: 17/9/18
//Exchange class for Homework 2

public class Exchange {
    private String country;
    private String year;

    public Exchange(String country, String year, String major, double gpa) {
        this.country = country;
        this.year = year;
        super.setGpa(gpa);
        super.setMajor(major);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Exchange{" +
                "Country='" + country + '\'' +
                ", Year='" + year + '\'' +
                super.toString()
                '}';
    }
}
