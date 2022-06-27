package classwork.lesson14;

public class AskMe implements SharedConstants{
   static void answer (int result){
       switch (result){
           case NO :
               System.out.println("no ");
               break;
           case YES:
               System.out.println("yes" );
               break;
           case MAYBE:
               System.out.println("вазможно");
               break;
           case LATER:
               System.out.println("поздне");
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
        Question q=new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
