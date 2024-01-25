package ec.editer.patterns.singleton;

public class SimpleWindowSingleton {
    private static int COUNTER;
    private static SimpleWindowSingleton instance;
    private SimpleWindowSingleton(){
        ++COUNTER;
    }
    public static SimpleWindowSingleton getInstance(){
        if(instance == null){
            instance = new SimpleWindowSingleton();
        }
        return instance;
    }
    public int getCounter(){
        return COUNTER;
    }
}
