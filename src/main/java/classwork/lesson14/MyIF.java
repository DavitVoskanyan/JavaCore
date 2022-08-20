package classwork.lesson14;

public interface MyIF {
    int getNumber();
    default String getString(){
        return "объект типа String по умальчанию";

    }
    static int getDefaultNumber(){
        return 0;
    }
}
