public class StringWrap implements Wrap {
    String s;

    public StringWrap(String string) {
        s = string;
    }

    @Override
    public void print() {
        System.out.println(s);
    }
}
