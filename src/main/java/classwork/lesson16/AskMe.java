package classwork.lesson16;

public class AskMe {
    static void answer(Answers result) {
        switch (result) {
            case NO:
                System.out.println("нет");
                break;
            case YES:
                System.out.println("да");
            case MAYBE:
                System.out.println("вазможно");
                break;
            case LATER:
                System.out.println("позднее");
                break;
            case SOON:
                System.out.println("вскоре");
                break;
            case NEVER:
                System.out.println("никогда");
                break;

        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
