package homework.BraceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "(Hello) {from] [java}";
        BraceChecker bc = new BraceChecker(text);
        bc.check();

    }
}
