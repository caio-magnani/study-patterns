package furniture;
public abstract class Furniture {

    public abstract String getName();
    
    public abstract String getStyle();
    
    public abstract double getPrice();

    @Override
    public String toString(){
        return this.getName()+" with style " + getStyle();
    }
}
