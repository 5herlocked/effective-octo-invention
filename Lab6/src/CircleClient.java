public class CircleClient {
    public static void main (String ... args) {
        ColouredCircle redCircle = new ColouredCircle(5,10,4, "Red");

        ColouredCircle blueCircle = new ColouredCircle(5,11,5, "Blue");

        ColouredCircle otherRedCircle = new ColouredCircle(5,10,4,"Red");

        System.out.println(redCircle + "\n");
        System.out.println(blueCircle + "\n");
        System.out.println(otherRedCircle + "\n");

        System.out.println((redCircle.equals(blueCircle))? (redCircle.toString() + "\n" + blueCircle.toString() + "\n are the same")
                : (redCircle.toString() + "\n" + blueCircle.toString() + "\n are not the same"));

        System.out.println((redCircle.equals(otherRedCircle))? (redCircle.toString() + "\n" + otherRedCircle.toString() + "\n are the same")
                : (redCircle.toString() + "\n" + otherRedCircle.toString() + "\n are not the same"));
    }
}
