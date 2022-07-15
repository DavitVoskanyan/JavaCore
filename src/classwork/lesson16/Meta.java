package classwork.lesson16;


import java.lang.reflect.Method;

public class Meta {
    @MyAnno(str = "два параметра", val = 19)
    public static void myMeth(String str ,int i){
        Meta ob=new Meta();
        try {
            Class<?>c=ob.getClass();
            Class<? extends Class> m=c.getClass();
            Method me =c.getMethod("myMeth",String.class,int.class);
           MyAnno anno=m.getAnnotation(MyAnno.class);
            System.out.println(anno.str()+" "+anno.val());

        }catch (NoSuchMethodException exc){
            System.out.println("метод не найден ");

        }

    }

    public static void main(String[] args) {
        myMeth("test ",10);
    }
}
