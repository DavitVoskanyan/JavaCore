package homework.arraytil;

public class PracticeHomework {
    //փոխակերպել տրված րոպեն վարկյանի ու վերադարձնել
    long convert(int minutes) {

        int second = minutes * 60;

        return second;

    }

    //ընդունել տարին , վերադարձնել օրերի քանակը
    int calcAge(int years) {
        int days = years * 365;

        return days;
    }

    //վերադարձնել տրված թվի հաջորդ թիվը
    int nextNumber(int number) {
        int num;
        num = number +1;

        return num;
    }

    //վերադարձնել true եթե տրված a և b թվերը իրար հավասար են եթե ոչ false
    boolean isSameNum(int a, int b) {
        boolean f;
        f = false;
        if (a == b) {
            f = true;
        }
        return f;

    }


    //վերադարձնել true եթե թիվը փոքր է կամ հավասար 0-ին։
    //մնացած դեպքերում  false
    boolean lessThanOrEqualToZero(int number) {
        boolean a;
        a = false;
        if (number <= 0) {

            a = true;
        }
        return a;
    }

    //վերադարձնել ընդունօղ բուլյանի արժեքը ։
    boolean reverseBool(boolean value) {
        boolean b;
        b = false;
        if (value == true) {
            b = true;
        }


        return b;
    }

    //վերադարձնել երկու մասիվի ամենամեծ length-ը
    int maxLength(int[] array1, int[] array2) {

        return    array1.length>array2.length?array1.length:array2.length;
        }


    }

