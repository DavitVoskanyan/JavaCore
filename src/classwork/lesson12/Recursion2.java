package classwork.lesson12;

public class Recursion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        int i=0 ;
        for (int j = 0; j < 10; j++) ob.values[i]=i;
            ob.printArray(10);

        }
    }

