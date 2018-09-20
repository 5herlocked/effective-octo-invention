public class EmployeeClient {
    public static void main(String ... args) {
        Employee lawyer = new Lawyer();
        Employee harvardLawyer = new HarvardLawyer();
        Employee softEng = new SoftwareEngineer();

        printEmployee(lawyer);
        printEmployee(harvardLawyer);
        printEmployee(softEng);
    }

    private static void printEmployee (Employee emp) {
        System.out.println(emp);
        if (emp instanceof SoftwareEngineer){
            ((SoftwareEngineer) emp).writeCode();
            System.out.println();
        }
        if (emp instanceof Lawyer){
            ((Lawyer) emp).sue();
            System.out.println();
        }
    }
}
