public class SequentialIncrementer implements Incremental {

    private int incrementee;

    public SequentialIncrementer () { this.incrementee = 0; }

    public SequentialIncrementer(int incrementee) {
        this.incrementee = incrementee;
    }

    @Override
    public void increment() {
        incrementee++;
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
