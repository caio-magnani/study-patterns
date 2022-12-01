package furniture;
public class OldChairFurniture extends ChairFurniture{
    
    @Override
    public String getStyle() {
        return "Old";
    }

    @Override
    public double getPrice() {
        return (double) 50;
    }
    
}
