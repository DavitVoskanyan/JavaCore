package homework.BraceChecker;

public class Stack1 {

    int[] stack = new int[10];
    int tos;

    public Stack1() {
        tos = -1;
    }
    public   void push(int item) {
        if (tos == 9)
            System.out.println("Стек заполнен.");
        else
            stack[++tos] = item;
    }
  public   int pop(){
        if (tos < 0) {
            System.out.println("Стек не загру");
            return 0;
        }
        else
            return stack[tos--];
    }
}