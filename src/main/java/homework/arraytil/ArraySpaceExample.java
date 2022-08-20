package homework.arraytil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        char space = ' ';
        char[] result = new char[0];
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] != space) {
                for (int j = spaceArray.length - 1; j > i; j--) {
                    result = spaceArray;
                    if (spaceArray[j] != space) {
                        result = new char[j - i + 1];
                        int resultIndex = 0;
                        for (; i <= j; i++) {
                            result[resultIndex] = spaceArray[i];
                            resultIndex++;
                        }
                    }
                }
            }
        }
        for (char c : result) {
            System.out.print(c);
        }
    }
}















