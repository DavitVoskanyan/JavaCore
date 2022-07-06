package classwork.lesson15;

public class ThrowDemo {
    static   void  demoproc (){
      try {
          throw  new NullPointerException("демонсстрация");

      }catch (NullPointerException e){
          System.out.println("исключение перехвачено в теле "+"метода  demoproc().");
          throw  e ;

      }
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch (NullPointerException e){
            System.out.println("повторнй перехват"+ e );

        }
    }
}
