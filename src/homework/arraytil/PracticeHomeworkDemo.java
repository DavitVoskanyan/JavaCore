package homework.arraytil;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework ph = new PracticeHomework();
        long convert = ph.convert(125);
        System.out.println("վարկյանը " + convert);

        int calcAge = ph.calcAge(5);
        System.out.println("օրերի քանակը" + calcAge);
        int nextNumber = ph.nextNumber(0);
        System.out.println("հաջորդ թիվը" + nextNumber);
        boolean isSameNum = ph.isSameNum(15, 5);
        System.out.println("վերադարձնել true կամ false." + " " + isSameNum);
        boolean lessThanOrEqualToZero = ph.lessThanOrEqualToZero(-5);
        System.out.println("եթե հավասար է 0 true." + " " + lessThanOrEqualToZero);
        boolean reverseBool = ph.reverseBool(true);
        System.out.println("վերադարձնել բուլյան արժեքը" + reverseBool);
      //  int maxLength = ph.maxLength();
        //System.out.println("ամենամեծ լենգթը" + maxLength);
    }
}
