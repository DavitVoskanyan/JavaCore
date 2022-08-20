package homework.BraceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "(H[e[l(l{o] {from) (java";
        BraceChecker bc = new BraceChecker(text);
        bc.check();

    }
}
