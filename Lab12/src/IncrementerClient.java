public class IncrementerClient {
    public static void main (String ... args)
    {
        SequentialIncrementer sqI = new SequentialIncrementer();
        RandomIncrementer rI = new RandomIncrementer();
        for (int i = 0; i < 2; i++)
        {
            System.out.println("-------------------------------------------");
            sqI = new SequentialIncrementer();
            rI = new RandomIncrementer();

            System.out.println("Sequential Increments");
            System.out.println(sqI);
            for (int j = 0; j < 4; j++)
            {
                sqI.increment();
                System.out.println(sqI);
            }
            System.out.println("-------------------------------------------");
            System.out.println("Random Increments");
            System.out.println(rI);
            for(int j = 0; j < 4; j++)
            {
                rI.increment();
                System.out.println(rI);
            }
            System.out.println("-------------------------------------------");
        }
    }
}
