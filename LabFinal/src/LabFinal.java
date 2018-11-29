// Shardul Vaidya
// November 29 2018

public class LabFinal {
    public static void main (String ... args) {
        Student[] array = new Student[]
                {
                        new Student("Gerardo", "Olander", "300130" , 4 ),
                        new Student("Chibuzo","Simonsen", "254938", 3),
                        new Student("Graziano","Ely", "598379", 4),
                        new Student("Mark","Holland", "522696", 3),
                        new Student("Tara", "Kjeldsen", "844598", 3),
                        new Student("Hubertus", "Lenox", "900816", 3)
                };

        System.out.println("------------------------------------------------------------------------");
        System.out.println("Before Sorting: ");

        for(Student s : array)
            System.out.println(s);

        sort(array);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("After Sorting");

        for(Student s : array)
            System.out.println(s);
    }

    private static void sort(Student[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j].compareTo(array[minIndex]) < 0)
                    minIndex = j;
            swap(array, minIndex, i);
        }
    }

    private static void swap(Student[] array, int a, int b) {
        Student temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
