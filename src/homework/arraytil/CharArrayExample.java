package homework.arraytil;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'o') {
                count++;
            }
        }

        System.out.println(count);

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e',};

        System.out.print(" 2 символы" + " " + chars2[chars2.length / 2 - 1]);
        System.out.println(chars2[chars.length / 2]);
        System.out.println();


        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        char e = chars3[chars3.length - 1];
        char f = chars3[chars3.length - 2];
        boolean b = false;
        if (e == 'y' && f == 'l') {
        }
        boolean a = true;
        System.out.println(a);


        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a',};
        char l = 'b';
        boolean result = false;

        for (int i = 0; i < bobArray.length; i++) {

            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                a = true;
                break;
            }
        }
        System.out.println(a);

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        char spase = ' ';
        for (int i = 0; i < text.length; i++) {
            if (text[i] != spase) {
                System.out.print(text[i]);
            }

        }
    }
}






