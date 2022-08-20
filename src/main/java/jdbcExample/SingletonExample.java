package jdbcExample;

public class SingletonExample {
    private  static SingletonExample instance  =new SingletonExample();
    private SingletonExample(){

    }
    public static SingletonExample getInstance(){
        return  instance;
    }
}
