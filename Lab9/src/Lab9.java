//Shardul Vaidya
// Thursday 12:45

public class Lab9 {
    public static void main (String ... args) {
        print(5);
        System.out.println("Print Method ^");
        printNum(5);
        System.out.println("PrintNum Method ^");
        System.out.println(evenSum(7));
        System.out.println("EvenSum Method ^");
        System.out.println(fib(8));
        System.out.println("fib method ^");
    }

    private static void print(int n) {
        if (n!=0){
            print(n-1);
            printNum(n);
            System.out.println();
        }
    }

    private static void printNum(int n){
        if(n!=0){
            System.out.print(n+ n+ " ");
            printNum(n-1);
        }
    }

    private static long evenSum(int n) {
        if (n % 2 == 1)
            n--;
        if (n <= 0) return 0;

        return evenSum(n-2) + n;
    }

    private static long fib(int n) {
        if (n == 0 || n == 1) return n;

        return fib(n-1) + fib(n-2);
    }
}
