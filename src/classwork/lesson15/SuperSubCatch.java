package classwork.lesson15;

public class SuperSubCatch {
    public static void main(String[] args) {
        try{
            int a=0;
            int b=42/a;

        }catch (Exception e){
            System.out.println("перехват исклученийобшего класса Exception.");

        }
        System.out.println("этот код вобше недостижим");
    }
}
