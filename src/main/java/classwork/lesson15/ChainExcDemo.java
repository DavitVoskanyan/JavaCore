package classwork.lesson15;

public class ChainExcDemo {
    static  void demoproc(){
        NullPointerException e=new NullPointerException("верхниый уровень");
        e.initCause( new ArithmeticException("причина")) ;
        throw e;

    }

    public static void main(String[] args) {
        try{
            demoproc();

        }catch (NullPointerException e ){
            System.out.println("перехвачено исключение :"+e);
            System.out.println("первопричина :"+e.getCause());

        }
    }
}
