package furniture;
public class ModernChairFurniture extends ChairFurniture{

    @Override
    public String getStyle() {
        return "Modern";
    }

    @Override
    public double getPrice() {
        return (double) 150.99;
    }
}
