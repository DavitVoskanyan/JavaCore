package classwork.lesson10;

public class ForEach2 {
    public static void main(String[] args) {
        int sum =0;
        int [] num ={1,2,3,4,5,6,7,8,9,10};
        for(int x:num){
            System.out.println("Значение равно:"+x);
            sum+=x;
            if(x==5)break;

        }
        System.out.println("Сумма 5 1-ых елементов равна:"+sum);
    }
}
