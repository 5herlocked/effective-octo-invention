//author: shardul vaidya
//date 17/9/18
//Client for Homework2 

import java.text.*;

public class Homework2 {
    public static void main(String ... args) {
        Undergraduate maya = new Undergraduate("Maya", "Computer Science", 3.9, 54, true);
        Graduate john = new Graduate("John", "Computer Science", "Masters", "Cybersecurity", 1, 4.10);

        System.out.printf("Name: %s\n" + 
                          "Major: %s\n" +
                          "GPA: %s\n" +
                          "Year: %s\n" +
                          "Honours: %s\n",maya.getName(), maya.getMajor(), maya.getGPA(), maya.getYear(), ((maya.isHonours()) ? "Yes" : "No"));
        System.out.println ();
        System.out.printf("Name: %s\n" + 
                          "Concentration: %s\n" +
                          "Years in School: %s\n" +
                          "Major: %s\n",john.getName(), john.getConcentration(), john.getYears(), john.getMajor());
        System.out.println();

        Exchange dan = new Exchange("Dan", "Physics", 4.0, 56, true, "Greece", "Summer 2017");

        System.out.printf("Name: %s \n" +
                          "GPA: %s \n" +
                          "Country: %s \n"+
                          "Major: %s \n", dan.getName(), dan.getGPA(), dan.getCountry(), dan.getMajor());
    }
}
