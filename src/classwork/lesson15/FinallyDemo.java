package classwork.lesson15;

public class FinallyDemo {
    static void processA() {
        try {
            System.out.println("в теле метода  processA()");
            throw new RuntimeException("демонстрация");

        } finally {
            System.out.println("блок оперотора finally  в методе processA()");
        }
    }

    static void processB() {
        try {
            System.out.println("в теле метода  processA()");
            return;
        } finally {
            System.out.println("блок оперотора finally  в методе processA()");
        }
    }

    static void processC() {
        try {
            System.out.println("в теле метода  processC()");
            return;
        } finally {
            System.out.println("блок оперотора finally  в методе processC()");
        }
    }

    public static void main(String[] args) {
        try{
            processA();

        }catch (Exception e ){
            System.out.println("исключение перехвачено");
        }
        processB();
        processC();
    }
}
