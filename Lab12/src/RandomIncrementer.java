import java.util.Random;

public class RandomIncrementer implements Incremental {

    private int incrementee;

    private static Random rnd = new Random();

    public RandomIncrementer() {
        incrementee = rnd.nextInt(Integer.MAX_VALUE);
    }

    public RandomIncrementer(int incrementee) {
        this.incrementee = incrementee;
    }

    @Override
    public void increment() {
        incrementee += rnd.nextInt(1000);
    }

    @Override
    public int getValue() {
        return incrementee;
    }

    @Override
    public String toString() {
        return "" + incrementee;
    }
}
