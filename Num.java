
public class Num {

    private int value;

    public Num(int update) {
        value = update;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int update) {
        value = update;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
