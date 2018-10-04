// Author: Shardul Vaidya
import java.util.ArrayList;

public class Part1 {
    public static void main (String ... args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add (0);

        for (int i = 0; i < 10; i++)
        {
            list.add((int)(Math.random() * 10));
        }

        System.out.println("Before: " + list);

        removeZeros(list);

        System.out.println("After: " + list);
    }

    private static void removeZeros (ArrayList<Integer> list)
    {
        for (int i = 0; i < list.size(); i++)
            if (list.get(i) == 0) list.remove(i--);
    }
}
