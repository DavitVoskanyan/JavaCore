package homework.arraytil;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework ph = new PracticeHomework();
        long convert = ph.convert(125);
        System.out.println("վարկյանը " + convert);

        int calcAge = ph.calcAge(5);
        System.out.println("օրերի քանակը" + calcAge);
        int nextNumber = ph.nextNumber(8);
        System.out.println("հաջորդ թիվը"+nextNumber);
        boolean isSameNum = ph.isSameNum(15, 5);
        System.out.println("վերադարձնել true կամ false." + " " + isSameNum);
        boolean lessThanOrEqualToZero = ph.lessThanOrEqualToZero(-5);
        System.out.println("եթե հավասար է 0 true." + " " + lessThanOrEqualToZero);
        boolean reverseBool = ph.reverseBool(true);
        System.out.println("վերադարձնել բուլյան արժեքը" + reverseBool);
        int[] array1 = new int[17];
        int[] array2 = new int[7];
        System.out.println(ph.maxLength(array1,array2));

    }
}
