import java.util.*;

public class Lab8 {
    public static void main (String ... args) {
    	ArrayList<Rectangle> list = new ArrayList<Rectangle>();

    	for (int i = 0; i < 10; i++)
    		list.add(new Rectangle (randomNumber(10),randomNumber(10),new Point(randomNumber(10),randomNumber(10))));

    	System.out.println("Before: ");

    	for (Rectangle r : list)
    		System.out.println(r);

    	System.out.println("After: ");

    	Collections.sort(list);

    	for (Rectangle r : list)
    		System.out.println(r);

    }

    private static int randomNumber (int range) {
        Random rnd = new Random();

        return rnd.nextInt(range) + 1;
    }
}

