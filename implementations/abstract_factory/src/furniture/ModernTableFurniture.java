package furniture;

public class ModernTableFurniture extends TableFurniture{

    @Override
    public String getStyle() {
        return "Modern";
    }

    @Override
    public double getPrice() {
        return (double) 250.00;
    }
    
}
