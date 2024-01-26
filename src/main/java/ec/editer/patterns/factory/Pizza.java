package ec.editer.patterns.factory;

public class Pizza {
    protected Pizza pizza;
    public void prepare(){
        System.out.println("...preparing");
    }
    public void bake(){
        System.out.println("...baking");
    }
    public void cut(){
        System.out.println("...cutting");
    }
    public void box(){
        System.out.println("...boxing");
    }
}
