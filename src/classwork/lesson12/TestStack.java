package classwork.lesson12;

public class TestStack {
    public static void main(String[] args) {
        Stack mystack1= new Stack();
        Stack mystack2= new Stack();
        for (int i = 0; i < 10; i++){
            mystack1.pop();
        }
        for (int j = 0; j < 20; j++) {
            mystack2.push(j);
        }
        System.out.println("стек в mystack1:");
        for (int i=0; i<10 ;i++)
            System.out.println(mystack1.pop());
        System.out.println("стек в mystack2:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());

        }
            }




