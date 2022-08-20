package classwork.lesson10;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Предшествует оператору break.");
                    if (t) break second;
                    System.out.println("Етот оператор не будет выполняться ");

                }
                System.out.println("Етот оператор не будет выполняться ");
            }
            System.out.println("Етот оператор цледует за блоком second.");
        }
    }
}
